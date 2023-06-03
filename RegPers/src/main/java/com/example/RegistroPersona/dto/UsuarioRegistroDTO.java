package com.example.RegistroPersona.dto;

public class UsuarioRegistroDTO {

    //atributos
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String password;

    //metodo parametros
    public UsuarioRegistroDTO(Long id, String nombre, String apellido, String correo, String password){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
    }

    //constructores con parametros por separado
    public UsuarioRegistroDTO(String correo){
        this.correo = correo;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
