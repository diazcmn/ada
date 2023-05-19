package com.example.RegistroPersona.servicio;

import com.example.RegistroPersona.entidad.Persona;

import java.util.List;

public interface PersonaServ {
    //cuerpo abstracto de nuestro metodos, solo firma

    //primer metodo esl ista porque nos trae todas las personas
    public List<Persona> listarTodasP();

    //metodo guardar, le paso persona que es de tipo objeto, parametro instancia del objeto
    public Persona guardarP(Persona persona);

    public Persona ObtenerPorId(Integer Id);

    public Persona actualizarP(Persona persona);

    //metodo para eliminar

    public void eliminarP(Integer Id);
}
