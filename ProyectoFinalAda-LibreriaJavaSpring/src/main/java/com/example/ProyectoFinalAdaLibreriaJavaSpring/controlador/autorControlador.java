package com.example.ProyectoFinalAdaLibreriaJavaSpring.controlador;

import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Autores;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.servicio.autorServicio;
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
public class autorControlador {

    @Autowired
    private autorServicio autorServicio;

    @GetMapping("/") //inicio
    public String verInicio(Model model){
        List<Autores> autores = autorServicio.listar();
        model.addAttribute("Autores", autores);
        return "index";
        //onfigurar los metodos sin firma,
        // despues la implementacion y por ultimo controlador
    }

    @GetMapping("/nuevo")
    public String formNuevoAutor(Model model){
        model.addAttribute("Autor", new Autores());
        return "nuevo";
    }

    @PostMapping("/save")
    public String guardarAutor(@Validated Autores autores, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()) {
            model.addAttribute("Autores", autores);
            return "nuevo";

        }
        autorServicio.guardarAutores(autores);
        redirectAttributes.addFlashAttribute("msgExito", "Autor añadido");
        return "redirect:/";  //preguntar

        @GetMapping("/editar/{id}")
        public String formEditarAutores(@PathVariable Integer Id, Model model){
            Autores autores1 = autorServicio.buscarAutoresporId(Id);
            model.addAttribute("Autores", autores);
            return "editar";

        }


     @PostMapping("/editar/{id}")

        public String editarAtores(@PathVariable Integer Id, @Validated Autores autores,
            BindingResult bindinResult, RedirectAttributes redirect, Model model){
            Autores autoresDB = autorServicio.buscarAutoresporId(Id);

            if (BindingResult.hasErrors()) {
                model.addAttribute("Autores", autores);
                return "editar";

            }


            autoresDB.setNombreAutor(Autores.getnombreAutror());
            autoresDB.setApellidoAutor(Autores.getApellidoAutor());
            autoresDB.setfechaNacAutor(Autores.getfechaNacAutor());

            autorServicio.guardarAutores(autoresDB);

            redirect.addFlashAttribute("msgExito", "El autor " +
                    "se actualizo correctamente");

            return "redirect:/";
        }

        @PostMapping("/eliminar/{id}")
        public String eliminarContacto(@PathVariable Integer Id,RedirectAttributes redirect) {
            Autores autores1 = autorServicio.buscarAutoresporId(Id);
            autorServicio.eliminarAutores(Id);

            redirect.addFlashAttribute("msgExito", "Se elimino el autor");

            return "redirect:/";

}
    }
