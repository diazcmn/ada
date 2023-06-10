package com.example.ProyectoFinalAdaLibreriaJavaSpring.servicio;

import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Autores;

import java.util.List;

//metodos crud
//entre <Entidad>
//se configura antes del controlador
public interface autorServicio {
    //metodos sin firma, despues la implementacion
    public List<Autores> listar();
    public Autores guardarAutores(Autores autores);
    public Autores buscarAutoresporId(Integer id);
    public Autores editarAutores(Autores autores);
    public void eliminarAutores(Autores autores);
    //son entidad y con void porque no retorna

}
