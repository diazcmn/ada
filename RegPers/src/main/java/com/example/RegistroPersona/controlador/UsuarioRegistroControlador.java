package com.example.RegistroPersona.controlador;


import com.example.RegistroPersona.dto.UsuarioRegistroDTO;
import com.example.RegistroPersona.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//notacion controlados
@Controller
@GetMapping("/registro") //direccion pagina
public class UsuarioRegistroControlador {

    @Autowired //inyeccion de usuarioservicio
    private UsuarioServicio usuarioServicio;

    @ModelAttribute("usuario") //modelamos objeto
    public UsuarioRegistroDTO devolverNuevoUsuarioRegistroDTO(){
        return new UsuarioRegistroDTO();
    }
    @GetMapping
    public String MostrarFormRegistro(){
        return "registro";
    }

    @PostMapping String registroCuentaUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO){
    usuarioServicio.guardar(registroDTO);
    return "redirect:/registro?exito";
    }

}
