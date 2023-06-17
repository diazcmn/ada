package com.example.ProyectoFinalAdaLibreriaJavaSpring.servicio;


import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Autores;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Libros;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.repositorio.autoresRepo;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.repositorio.librosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//la logica esta en controlador
//notacion servicio, traer implementacion de metodos crud de contactoserv
@Service
public class ImpLibros implements libroServicio{
    //se recuperan los datos (inyeccion de dependencia de jpa, metodos) y se arma el cuerpo de los metodos
    // por eso los override

    @Autowired
    private librosRepo librosRepo;

    @Override
    public List<Libros> listarL() {
        return librosRepo.findAll();
    }

    @Override
    public Libros guardarLibros(Libros libros) {
        return librosRepo.save(libros);
    }

    @Override
    public Libros buscarLibrosporId(Integer id) {
        return librosRepo.findById(id).get();
    }

    @Override
    public Libros editarLibros(Autores autores) {
        return librosRepo.save(libros);
    }

    @Override
    public void eliminarLibros(Libros libros) {

       librosRepo.delete(libros);

    }











}
