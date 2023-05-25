package com.example.Agendacontactos.servicio;

import com.example.Agendacontactos.entidad.contacto;

import java.util.List;

public interface contactoServ {

    //metodos crud
    //entre <Entidad>
    public List<contacto> listarTodos();

    public contacto guardarContacto(contacto contacto);

    public contacto obtenerPorId(Integer id);

    public contacto actualizatContacto(contacto contacto);

    public void eliminarContacto(contacto contacto);
    //void elimina, no devuelve. elimina por objeto ahora no por id
}
