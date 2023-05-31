package com.example.Agendacontact.controlador;

import com.example.Agendacontact.entidad.contacto;
import com.example.Agendacontact.servicio.contactoServ;
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

//notacion controlador
@Controller
public class contactoControlador {

    @Autowired
    private contactoServ contactoServ;

    @GetMapping("/") //inicio
    public String verPagInicio(Model model) {
        List<contacto> contactos = contactoServ.listarTodos();
        model.addAttribute("contactos", contactos);
        return "index";
    }

    @GetMapping("/nuevo")
    public String mostrarFormRegisCont(Model model){
        model.addAttribute("contacto", new contacto());
        return "nuevo";
    }
    @PostMapping("/save")
    public String guardarContacto(@Validated contacto contacto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("contacto", contacto);
            return "nuevo";

        }

        contactoServ.guardarContacto(contacto);
        redirectAttributes.addFlashAttribute("msgExito", "El contacto se ha agregado");

        return "redirect:/";

    }
    @GetMapping("/editar/{id}")
    public String mostrarFormRegEditCont(@PathVariable Integer id, Model model){
        contacto contacto = contactoServ.obtenerPorId(id);
        model.addAttribute("contacto", contacto);
        return "editar";
    }
    @PostMapping("/editar/{id}")
    public String actualizarContacto(@PathVariable Integer id,@Validated contacto contacto,
                                     BindingResult bindingResult,RedirectAttributes redirect,Model modelo) {

        contacto contactoDB = contactoServ.obtenerPorId(id);

        if(bindingResult.hasErrors()) {
            modelo.addAttribute("contacto", contacto);
            return "editar";
        }

        contactoDB.setNombre(contacto.getNombre());
        contactoDB.setTelefono(contacto.getTelefono());
        contactoDB.setCorreo(contacto.getCorreo());
        contactoDB.setFechanac(contacto.getFechanac());

        contactoServ.guardarContacto(contactoDB);

        redirect.addFlashAttribute("msgExito", "El contacto " +
                "ha sido actualizado correctamente");

        return "redirect:/";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminarContacto(@PathVariable Integer id,RedirectAttributes redirect) {
        contacto contacto = contactoServ.obtenerPorId(id);

        contactoServ.eliminarContacto(contacto);

        redirect.addFlashAttribute("msgExito", "El contacto ha " +
                "sido eliminado correctamente");

        return "redirect:/";
    }



}






