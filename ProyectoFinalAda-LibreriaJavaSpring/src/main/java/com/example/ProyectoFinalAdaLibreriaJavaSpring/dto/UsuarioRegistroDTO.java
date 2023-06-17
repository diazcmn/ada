package com.example.ProyectoFinalAdaLibreriaJavaSpring.dto;

public class UsuarioRegistroDTO {

    //atributos
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;

    //metodo parametros
    public UsuarioRegistroDTO(Long id, String nombre, String apellido, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
    }

    //metodo parametros sin id
    public UsuarioRegistroDTO(String nombre, String apellido, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
    }

    //constructores con parametros por separado
    public UsuarioRegistroDTO(String email){
        this.email = email;
    }

    //contructor vacio
    public UsuarioRegistroDTO(){}

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
