package com.example.ProyectoFinalAdaLibreriaJavaSpring.controlador;

import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Autores;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.servicio.autorServicio;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
public class autorControlador {

    @Autowired
    private autorServicio autorServicio;

    @GetMapping("/listaAutores")
    public String verInicio(Model model){
        List<Autores> autores = autorServicio.listar();
        model.addAttribute("Autores", autores);
        return "listaAutores";
        //configurar los metodos sin firma,
        // despues la implementacion y por ultimo controlador
    }

    @GetMapping("/listaAutores/nuevoAutor")
    public String formNuevoAutor(Model model){
        model.addAttribute("Autor", new Autores());
        return "crearAutor";
    }

    @PostMapping("/listaAutores")
    public String guardarAutor(@Validated Autores autores, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()) {
            model.addAttribute("Autores", autores);
            return "listaAutores";

        }
        autorServicio.guardarAutores(autores);
        redirectAttributes.addFlashAttribute("msgExito", "Autor añadido");
        return "redirect:/listaAutores";  //preguntar
    }
        @GetMapping("/listaAutores/editarAutor/{id}")
        public String formEditarAutores(@PathVariable Integer id, Model model){
            Autores autores1 = autorServicio.buscarAutoresporId(id);
            model.addAttribute("Autores", autores1);
            return "editarAutor";

        }


     @PostMapping("/listaAutores/{id}")
       public String editarAtores(@PathVariable Integer id, @Validated Autores autores,
           BindingResult bindingResult, RedirectAttributes redirect, Model model){
        Autores autoresDB = autorServicio.buscarAutoresporId(id);

        if (bindingResult.hasErrors()) {
              model.addAttribute("Autores", autores);
                return "listarAutores";

           }


            autoresDB.setNombreAutor(autores.getNombreAutor());
            autoresDB.setApellidoAutor(autores.getApellidoAutor());
            autoresDB.setFechaNacAutor(autores.getFechaNacAutor());

            autorServicio.guardarAutores(autoresDB);

            redirect.addFlashAttribute("msgExito", "El autor " +
                    "se actualizo correctamente");

            return "redirect:/listaAutores";
        }

        @PostMapping("/eliminarAutor/{id}")
        public String eliminarAutores(@PathVariable Integer id,RedirectAttributes redirect) {
            Autores autores1 = autorServicio.buscarAutoresporId(id);
            autorServicio.eliminarAutores(autores1);

            redirect.addFlashAttribute("msgExito", "Se elimino el autor");

            return "redirect:/listaAutores";

}
    }

