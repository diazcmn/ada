package com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    //constructor con parametros

    public Rol(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //constructor vacio
    public Rol(){}

    //constructores por separado con parametros

    public Rol(String nombre) {
        this.nombre = nombre;
    }

    //getter y setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}