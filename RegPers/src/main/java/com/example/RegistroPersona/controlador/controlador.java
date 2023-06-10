package com.example.RegistroPersona.controlador;
import com.example.RegistroPersona.entidad.Persona;
import com.example.RegistroPersona.servicio.PersonaServ;
import com.example.RegistroPersona.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

//declaro con la notacion
@Controller
public class controlador {
    //clase encargada de hacer una interaccion con las vistas y la parte logica
    //inyectamos datos con autowired
    @Autowired

    private PersonaServ servicio;
    // esta clase es la que contiene todos los metodos que nosotros vamos a implementar

    @Autowired
    private UsuarioServicio Uservicio;


    @GetMapping("/login")
    public String iniciarSesion(){
        return "login";
    }

    //Este metodo retornara la lista de usuarios que estan registrados con permisos
    @GetMapping("/")
    public String verPaginaDeInicio(Model modelo){
        modelo.addAttribute("usuarios", Uservicio.listarUsuario());
        return "index"; //el html se llama index
    }

    //Pagina de inicio del sistema
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    //configurar metodos que van a tener interaccion con las vistas html
    //renderizar lista
    @GetMapping("/listar")
    public String listar(Model model){
        //entre parentesis tiene una instancia de un objeto que se llama model
        //se usa para transportar los datos del controlador hacia una vista html
        //model es una interfaz que define un conjunto de metodos para agregar atributos a un modelo de datos
        //que se va a utilizar en una vista

        //devlvemos objetos asi que hacemos una lista
        List<Persona> personas = servicio.listarTodasP();
        model.addAttribute("personas", personas);

        return "lista";
    }

    @GetMapping("/new") //ruta
    public String Agregar(Model model){
        Persona persona = new Persona();//instancia
        model.addAttribute("persona", persona);
        return "crear_persona";//crear un nuevo form para guardar, lo mando con post

    }

    @PostMapping("/save")
    public String Guardar(@ModelAttribute("persona")Persona persona){
        //llamo a servicio
        servicio.guardarP(persona);
        //retirno despues de guardar
        return "redirect:/listar";

    }


    @GetMapping("/editar/{id}")
    //crear get para que nos mande al nuevo formulario. pathvariable identifica datos
    //model para mandar un unevo objeto la nuevo form
    public String mostrarFormEditar(@PathVariable Integer id, Model model){
        model.addAttribute("persona", servicio.ObtenerPorId(id));
        //peticion. busca persona con id que quiera
        return "editar_persona";
    }

    //metodo para guardar los cambios en el nuevo form. es un post
    //porque aloja cambios en la base de datos
    @PostMapping("/editar/{id}")
    public String actuializarP(@PathVariable Integer id, @ModelAttribute("persona")Persona persona){
        //uso model entonces creo instancia que va a obtener id de la persona que necesito
        Persona personaExistente = servicio.ObtenerPorId(id);
        personaExistente.setId(id);
        personaExistente.setNombre(persona.getNombre());
        personaExistente.setTelefono(persona.getTelefono());
        servicio.actualizarP(personaExistente);
        //si actualice el nombre lo tengo que guardar
        //para obtener datos uso get para pasar datos uso set
        return "redirect:/listar";
    }

    @GetMapping("/eliminar/{id}") //pathvariable para reconocer nuestro id
    public String eliminarP(@PathVariable Integer id){
        servicio.eliminarP(id);
        return "redirect:/listar";


    }

}
