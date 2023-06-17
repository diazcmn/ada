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
    public Libros guardarAutores(Libros libros);
    public Libros buscarAutoresporId(Integer id);
    public Libros editarAutores(Libros libros);
    public void eliminarAutores(Libros libros);
    //son entidad y con void porque no retorna

}
