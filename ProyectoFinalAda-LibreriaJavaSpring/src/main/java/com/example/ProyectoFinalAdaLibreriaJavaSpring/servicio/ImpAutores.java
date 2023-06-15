package com.example.ProyectoFinalAdaLibreriaJavaSpring.servicio;


import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Autores;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.repositorio.autoresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//la logica esta en controlador
//notacion servicio, traer implementacion de metodos crud de contactoserv
@Service
public class ImpAutores implements autorServicio{
    //se recuperan los datos (inyeccion de dependencia de jpa, metodos) y se arma el cuerpo de los metodos
    // por eso los override

    @Autowired
    private autoresRepo autoresRepo;

    @Override
    //una lista del objeto <contacto> que muestre todo findall

    public List<Autores> listar() {
        return autoresRepo.findAll();
    }

    @Override
    public Autores guardarAutores(Autores autores) {
        return autoresRepo.save(autores);
    }

    @Override
    public Autores buscarAutoresporId(Integer id) {
        return autoresRepo.findById(id).get();
    }

    @Override
    public Autores editarAutores(Autores autores) {
        return autoresRepo.save(autores);
    }

    @Override
    public void eliminarAutores(Autores autores) {

        autoresRepo.delete(autores);

    }
}
