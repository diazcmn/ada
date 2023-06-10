package com.example.RegistroPersona.controlador;


import com.example.RegistroPersona.dto.UsuarioRegistroDTO;
import com.example.RegistroPersona.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//notacion controlados

@Controller
@RequestMapping("/registro")//Direccion de la web
public class UsuarioRegistroControlador {

    //Inyeccion de dependecias de los metodos de servicio
    @Autowired
    private UsuarioServicio usuarioServicio;

    //Ayuda a guardar los usuarios con el dto
    @ModelAttribute("usuario")
    public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
        return new UsuarioRegistroDTO();
    }

    //Muestra nuestro form de registros
    @GetMapping
    public String MostrarFormularioDeRegistro() {
        return "registro";
    }

    //Guarda los usuarios registrados con ayuda del dto y el metodo de servicio
    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO){
        usuarioServicio.guardar(registroDTO);
        return "redirect:/registro?exito";
    }

}
