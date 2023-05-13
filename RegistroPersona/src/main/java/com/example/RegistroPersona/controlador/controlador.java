package com.example.RegistroPersona.controlador;


import ch.qos.logback.core.model.Model;
import com.example.RegistroPerson.entidad.Persona;
import com.example.RegistroPersona.servicio.PersonaServ;
import com.example.RegistroPersona.servicio.PersonaServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//declaro con la notacion
@Controller
public class Controlador {
    //clase encargada de hacer una interaccion con las vistas y la parte logica
    //inyectamos datos con autowired
    @Autowired

    private PersonaServ servicio;
    // esta clase es la que contiene todos los metodos que nosotros vamos a implementar

    //configurar metodos que van a tener intereaccion con las vistas html
    //renderizar lista
    @GetMapping("/listar")
    public String listar(Model model){
        //entre parentesis tiene una instancia de un objeto que se llama model
        //se usa para transportar los datos del controlador hacia una vista html
        //model es una interfaz que define un conjunto de metodos para agregar atributos a un modelo de datos
        //que se va a utilizar en una vista

        //devlvemos objetos asique hacemos una lista
        List<Persona> personas = servicio.listarTodasP();
        model.addAttribute("personas", personas);

        return "index";
    }

}
