package com.example.ProyectoFinalAdaLibreriaJavaSpring.controlador;

import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Autores;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Libros;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.servicio.autorServicio;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.servicio.libroServicio;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
        model.addAttribute("Libros", libros);
        return "inicio";
        //configurar los metodos sin firma,
        // despues la implementacion y por ultimo controlador
    }

    @GetMapping("/nuevo")
    public String formNuevoAutor(Model model){
        model.addAttribute("Libro", new Libros());
        return "nuevo";
    }

    @PostMapping("/save")
    public String guardarAutor(@Validated Libros libros, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()) {
            model.addAttribute("Libros", libros);
            return "nuevo";

        }
        libroServicio.guardarLibros(autores);
        redirectAttributes.addFlashAttribute("msgExito", "Libro añadido");
        return "redirect:/";  //preguntar
    }
    @GetMapping("/editar/{id}")
    public String formEditarAutores(@PathVariable Integer id, Model model){
       Libros libros1 = libroServicio.buscarLibrosporId(id);
        model.addAttribute("Libros", libros1);
        return "editar";

    }


    @PostMapping("/editar/{id}")
    public String editarLibros(@PathVariable Integer id, @Validated Libros libros,
                               BindingResult bindingResult, RedirectAttributes redirect, Model model){
       Libiros libroDB = libroServicio.buscarLibrosporId(id);

        if (bindingResult.hasErrors()) {
            model.addAttribute("Libros", libros);
            return "editar";

        }


        autoresDB.setNombreAutor(autores.getNombreAutor());
        autoresDB.setApellidoAutor(autores.getApellidoAutor());
        autoresDB.setFechaNacAutor(autores.getFechaNacAutor());

        autorServicio.guardarAutores(autoresDB);

        redirect.addFlashAttribute("msgExito", "El autor " +
                "se actualizo correctamente");

        return "redirect:/";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminarAutores(@PathVariable Integer id,RedirectAttributes redirect) {
        Autores autores1 = autorServicio.buscarAutoresporId(id);
        autorServicio.eliminarAutores(autores1);

        redirect.addFlashAttribute("msgExito", "Se elimino el autor");

        return "redirect:/";

    }
}

