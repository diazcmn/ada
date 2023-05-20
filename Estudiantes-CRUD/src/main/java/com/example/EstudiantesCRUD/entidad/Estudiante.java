package com.example.EstudiantesCRUD.entidad;//de aca sale el paquete principal entidad

import jakarta.persistence.*;

//declaro con la notacion entity que es una entidad
@Entity
@Table(name = "registroestudiantes")
public class Estudiante {
    //atributos
    //funcion de esta clase es la tabla con sus datos
    //paso id con autoincremento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY ) //si ponogo strategy me genera una segunda tabla
    private long id;

    //notacion para identificar columnas
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    //constructor vacio para la parte dinamica porque tenemos form
    public Estudiante(){

    }

    //constructor con parametros en caso de que actualicemos


    public Estudiante(long id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    //getter y setter utilizados tambien para actualizar datos

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
