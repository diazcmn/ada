package com.example.RegistroPersona.repositorio;

import com.example.RegistroPersona.entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//etiqueta ayuda a la inyeccion de datos
@Repository

//extension, metodo que contiene crud proporcionado por spring
//entre <> le pasamos la entidad y su tipo de dato que maneja su clave primaria
public interface PersonaRepo extends JpaRepository<Persona, Integer> {}

