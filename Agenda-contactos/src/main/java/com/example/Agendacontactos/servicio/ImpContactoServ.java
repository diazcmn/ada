package com.example.Agendacontactos.servicio;

import com.example.Agendacontactos.entidad.contacto;
import com.example.Agendacontactos.repositorio.contactoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//la logica esta en controlador
//notacion servicio, traer implementacion de metodos crud de contactoserv
@Service
public class ImpContactoServ implements contactoServ{
    //se recuperan los datos y se arma el cuerpo de los metodos

    @Autowired
    private contactoRepo contactoRepo;


    @Override
    //una lista del objeto <contacto> que muestre todo findall
    public List<contacto> listarTodos() {
        return contactoRepo.findAll();
    }

    @Override
    public contacto guardarContacto(contacto contacto) {
        return contactoRepo.save(contacto);
    }

    @Override
    public contacto obtenerPorId(Integer id) {
        return contactoRepo.findById(id).get();

    }

    @Override
    public contacto actualizatContacto(contacto contacto) {
        return contactoRepo.save(contacto);
    }

    @Override
    public void eliminarContacto(contacto contacto) {

        contactoRepo.delete(contacto);
    }
}
