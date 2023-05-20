package com.example.EstudiantesCRUD.servicio;

import com.example.EstudiantesCRUD.entidad.Estudiante;

import java.util.List;

//parte logica.
//siempre va a tener los cuerpos de los metodos que voy a usar
//esos metodos con completados por otra clase y esa clase trabaja en conjunto con otra interfaz
//esta clase contiene los metedos abstractos
public interface EstudianteServ {
    //paso lista de tipo estudiante(objeto)
    public List<Estudiante> listarTodosEst();
    public Estudiante guardarEst(Estudiante estudiante);//dentro van los parametros porque sabemos vamos a modelar un objeto
    public Estudiante obtenerEstPorId(Long id);//parametro con tipo de dato
    //actualizar tiene los cambios en controlador porque estoy modelando una lista desde un form
    public Estudiante actualizarEst(Estudiante estudiante);
    public void eliminarEst(long id);
    //void porque no devulve nada, parametro id
}
