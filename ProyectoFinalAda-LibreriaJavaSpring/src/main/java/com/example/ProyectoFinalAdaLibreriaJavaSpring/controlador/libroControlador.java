package com.example.ProyectoFinalAdaLibreriaJavaSpring.controlador;


import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Libros;

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
    private libroServicio librosServicio;
    @GetMapping("/") //inicio
    public String verInicio(Model model){
        List<Libros> libros = libroServicio.listarL();
        //configurar los metodos sin firma,
        // despues la implementacion y por ultimo controlador
        return "inicio";
    }

    @GetMapping("/nuevo")
    public String formNuevoLibro(Model model){
        model.addAttribute("Libro", new Libros());
        return "nuevo";
    }

    @PostMapping("/save")
    public String guardarLibros(@Validated Libros libros, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()) {
            model.addAttribute("Libros", libros);
            return "nuevo";

        }
        libroServicio.guardarLibros(libros);
        redirectAttributes.addFlashAttribute("msgExito", "Libro añadido");
        return "redirect:/";  //preguntar
    }
    @GetMapping("/editar/{id}")
    public String formEditarLibros(@PathVariable Integer id, Model model){
       Libros libros1 = libroServicio.buscarLibrosporId(id);
        model.addAttribute("Libros", libros1);
        return "editar";

    }


    @PostMapping("/editar/{id}")
    public String editarLibros(@PathVariable Integer id, @Validated Libros libros,
                               BindingResult bindingResult, RedirectAttributes redirect, Model model){
       Libros libroDB = libroServicio.buscarLibrosporId(id);

        if (bindingResult.hasErrors()) {
            model.addAttribute("Libros", libros);
            return "editar";

        }


        libroDB.setTitulo(libros.getTitulo());
        libroDB.setISBN(libros.getISBN());
        libroDB.setAnioEdicion(libros.getAnioEdicion());
        libroDB.setCantidadEjemplares(libros.getCantidadEjemplares());
        libroDB.setCondicionEjemplares(libros.getCondicionEjemplares());

        libroServicio.guardarLibros(libroDB);

        redirect.addFlashAttribute("msgExito", "El autor " +
                "se actualizo correctamente");

        return "redirect:/";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminarAutores(@PathVariable Integer id,RedirectAttributes redirect) {
       Libros libros = libroServicio.buscarLibrosporId(id);
        libroServicio.eliminarLibros(libros);

        redirect.addFlashAttribute("msgExito", "Se elimino el autor");

        return "redirect:/";

    }
}

