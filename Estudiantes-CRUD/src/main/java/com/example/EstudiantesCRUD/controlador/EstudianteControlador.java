package com.example.EstudiantesCRUD.controlador;


import com.example.EstudiantesCRUD.servicio.EstudianteServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//notacion
@Controller
public class EstudianteControlador {
    //inyeccion de dependencia de la clase estudianteserv
    //con esta inyeccion vamos a poder usar todos los metodos
    //que van a ser interactivos con las vistas
    @Autowired

    private EstudianteServ servest;
    @GetMapping({"/estudiantes", "/"})//peticion
    //servest es un nombre que se le pasa, podemos elegirlo
    public String listarEstudiantes(Model model){

        model.addAttribute("estudiantes", servest.listarTodosEst());
                //parametro lista de estudiantes
        //despues la coma llamo al objeto servest y listo los estudiantes desde bd
        return "estudiantes";
    }
    //parametro objeto model sirve para modelar nuestro objeto con el
    //metodo addattribute se agrega el estudiante con el nombre quedando disponible en la vista
    //string porque siempre devolvemos un template



}
