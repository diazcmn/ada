
package com.example.ProyectoFinalAdaLibreriaJavaSpring.controlador;

import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Autores;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Libros;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.servicio.UsuarioServicio;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.servicio.autorServicio;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.servicio.libroServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.security.Principal;
import java.util.List;

@Controller
public class libroControlador {

    @Autowired
    private  libroServicio  libroServicio;
    @Autowired
    private autorServicio autorServicio;

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/login")
    public String iniciarSesion(){
        return "login";
    }

    @GetMapping("/")
    public String verPaginaDeInicio(){
        return "index";
    }

    @GetMapping("/home")
    public String paginaPrincipal(){
        return "home";
    }

    @GetMapping("/listaLibros")
    public String verInicio(Model model){
        List<Libros> libros = libroServicio.listarL();
        model.addAttribute("libros",  libros);
        return "listaLibros";
        //configurar los metodos sin firma,
        // despues la implementacion y por ultimo controlador
    }

    @GetMapping("/listaLibros/nuevoLibro")
    public String formNuevoLibro(Model model){
        //te faltaba la lista de autores para el select
        List<Autores> listaAutores = autorServicio.listar();
                            //Tenias autor antes, era libro y abajo autor
        model.addAttribute("libro" , new Libros());
        model.addAttribute("autores", listaAutores);
        return "crearLibro";
    }

    @PostMapping("/listaLibros")
    public String guardarLibro(@Validated Libros  libro, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        List<Autores> listaAutores = autorServicio.listar();

        if (bindingResult.hasErrors()) {
            model.addAttribute("libro",  libro);
            model.addAttribute("autores", listaAutores);
            return "crearLibro";

        }
        libroServicio.guardarLibros(libro);
        redirectAttributes.addFlashAttribute("msgExito", "Autor añadido");

        return "redirect:/listaLibros";
    }


    @GetMapping("/listaLibros/editarLibro/{id}")
    public String formEditarLibros(@PathVariable Integer id, Model model){
        Libros libros = libroServicio.buscarLibrosporId(id);
                            //Tene cuidado con las Mayusculas o minusc
                            //Por lo gral, siempre pongo en minusc para olvidarme de esos detalles
        model.addAttribute("libro",  libros);
        return "editarLibro";

    }


    @PostMapping("/listaLibros/{id}")
    public String editarLibros(@PathVariable Integer id, @Validated Libros libros,
                               BindingResult bindingResult, RedirectAttributes redirect, Model model){
        Libros librosDB = libroServicio.buscarLibrosporId(id);

        if (bindingResult.hasErrors()) {
                        //Tene cuidado con las Mayusculas o minusc
                        //Si aca pones en mayuscula en el html tmb, yo lo coloque en minuscula y singular
            model.addAttribute("libro", libros);
            return "editarLibro";

        }


        librosDB.setTitulo(libros.getTitulo());
        librosDB.setISBN(libros.getISBN());
        librosDB.setAnioEdicion(libros.getAnioEdicion());
        librosDB.setCantidadEjemplares(libros.getCantidadEjemplares());
        librosDB.setCondicionEjemplares(libros.getCondicionEjemplares());

        libroServicio.guardarLibros(librosDB);


        redirect.addFlashAttribute("msgExito", "El libro " +
                "se actualizo correctamente");

        return "redirect:/listaLibros";
    }

    @PostMapping("/eliminarLibros/{id}")
    public String eliminarAutores(@PathVariable Integer id,RedirectAttributes redirect) {
        Libros libros = libroServicio.buscarLibrosporId(id);
        libroServicio.eliminarLibros(libros);

        redirect.addFlashAttribute("msgExito", "Se elimino el libro");

        return "redirect:/listaLibros";

    }
}


