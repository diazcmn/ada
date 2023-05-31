package com.example.Agendacontact.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

//notacion entidad y nombre tabla
@Entity
@Table(name = "contactos")
public class contacto {

    @Id  //id con autoincremento. no hace falta nombrar las tablas esta vez
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  //atributos

    private String nombre;

    private String telefono;

    // @NotBlank(message = "Ingresar correo: ") //mesaje a validar en html.
    @Email //validacion. para que contenga si o si una @
    @NotEmpty(message = "Ingrese al menos un caracter") // validacion. al menos un caracter
    private  String correo;

    //notacion para la fecha
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) //   formato iso, dia /mes /año
    @Past //fechas pasadas, validacion.
    @NotNull(message = "Ingrese fecha de nacimiento: ")
    private LocalDate fechanac; //localdate tipo de dato. fechas
    private LocalDateTime fechaRegistro;//feche y hora del registro actual cuando se entra a la web
    //se configura con un metodo (esta al final)


    //getter/setter


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechanac() {
        return fechanac;
    }

    public void setFechanac(LocalDate fechanac) {
        this.fechanac = fechanac;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


    //metodo de fecharegistro. toma la hora actual de la pc
    @PrePersist //para que funcione correctamente, asigna fecha actual
    public void asignarfechareg(){
        fechaRegistro = LocalDateTime.now();
    }

}
