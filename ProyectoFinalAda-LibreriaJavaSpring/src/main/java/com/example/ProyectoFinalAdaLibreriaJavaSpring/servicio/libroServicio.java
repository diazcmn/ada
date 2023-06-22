package com.example.ProyectoFinalAdaLibreriaJavaSpring.servicio;

import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Autores;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Libros;

import java.util.List;

//metodos crud
//entre <Entidad>
//se configura antes del controlador
public interface libroServicio {
    //metodos sin firma, despues la implementacion
    public List<Libros> listarL();

    public Libros guardarLibros(Libros libros);

    public Libros buscarLibrosporId(Integer id);

    public Libros editarLibros(Libros libros);

    public void eliminarLibros(Libros libros);
    //son entidad y con void porque no retorna


}
