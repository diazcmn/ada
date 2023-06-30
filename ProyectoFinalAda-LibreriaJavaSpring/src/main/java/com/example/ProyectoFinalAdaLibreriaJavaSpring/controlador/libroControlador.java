
package com.example.ProyectoFinalAdaLibreriaJavaSpring.controlador;

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
        model.addAttribute("Libros",  libros);
        return "listaLibros";
        //configurar los metodos sin firma,
        // despues la implementacion y por ultimo controlador
    }

    @GetMapping("/listaLibros/nuevoLibro")
    public String formNuevoLibro(Model model){
        model.addAttribute("Autor", new Libros());
        return "crearLibro";
    }

    @PostMapping("/listaLibros")
    public String guardarLibro(@Validated Libros  libros, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()) {
            model.addAttribute("Libros",  libros);
            return "listaLibros";

        }
        libroServicio.guardarLibros(libros);
        redirectAttributes.addFlashAttribute("msgExito", "Autor añadido");
        return "redirect:/listaLibros";  //preguntar
    }
    @GetMapping("/listaLibros/editarLibro/{id}")
    public String formEditarLibros(@PathVariable Integer id, Model model){
        Libros libros = libroServicio.buscarLibrosporId(id);
        model.addAttribute("Libros",  libros);
        return "editarLibro";

    }


    @PostMapping("/listaLibros/{id}")
    public String editarLibros(@PathVariable Integer id, @Validated Libros libros,
                               BindingResult bindingResult, RedirectAttributes redirect, Model model){
        Libros librosDB = libroServicio.buscarLibrosporId(id);

        if (bindingResult.hasErrors()) {
            model.addAttribute("Libros", libros);
            return "listaLibros";

        }


        librosDB.setTitulo(libros.getTitulo());
        librosDB.setISBN(libros.getISBN());
        librosDB.setAnioEdicion(libros.getAnioEdicion());
        librosDB.setCantidadEjemplares(libros.getCantidadEjemplares());
        librosDB.setCondicionEjemplares(libros.getCondicionEjemplares());

        libroServicio.guardarLibros(librosDB);


        redirect.addFlashAttribute("msgExito", "El autor " +
                "se actualizo correctamente");

        return "redirect:/listaLibros";
    }

    @PostMapping("/eliminarLibros/{id}")
    public String eliminarAutores(@PathVariable Integer id,RedirectAttributes redirect) {
        Libros libros = libroServicio.buscarLibrosporId(id);
        libroServicio.eliminarLibros(libros);

        redirect.addFlashAttribute("msgExito", "Se elimino el autor");

        return "redirect:/listaLibros";

    }
}


