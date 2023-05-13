package com.example.RegistroPersona.servicio;


import com.example.RegistroPerson.entidad.Persona;
import com.example.RegistroPersona.repositorio.PersonaRepo;
import com.example.RegistroPersona.servicio.PersonaServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//etiqueta para indicar que tiene la parte logica
@Service
//implementar todos los metodos que estan en personaserv
public class ImpPersServ implements PersonaServ{

    @Autowired //notacion para indentificar que es una inyeccion de dependencia con una clase
    //patron de diseño que evita la creacion manual de objetos y la gestion manual de la dependencia entre ellos, es automatico
    //inyeccion de datos de mi clase repositorio que es dond esta el crud con una instancia
    private PersonaRepo personRepo;

    @Override
    public List<Persona> listarTodasP() {
        return PersonaRepo.findAll();
        //configurar metodos, retorno una lista gracias a @repository de personrepo
    }

    @Override
    public Persona guardarP(Persona persona) {
        return null;
    }

    @Override
    public Persona ObtenerPorId(Integer Id) {
        return null;
    }

    @Override
    public Persona actualizarP(Persona persona) {
        return null;
    }

    @Override
    public void eliminarP(Integer Id) {

    }
}
