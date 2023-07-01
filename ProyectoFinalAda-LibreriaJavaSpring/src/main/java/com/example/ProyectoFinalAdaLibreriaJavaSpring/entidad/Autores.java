package com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table
public class Autores {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombreAutor", length = 100, nullable = false)
    private String nombreAutor;

    @Column(name = "apellidoAutor", length = 100, nullable = false)
    private String apellidoAutor;

    @Column(name = "fechaNacAutor", length = 100, nullable = false)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    //El tipo de dato para las fechas(siempre q ocupes el calendario es LocalDate, tenias String)
    //no te añadi esta anotacion @Past porque no tenes la dependencia VALIDATION
    //Entonces no quise tocar mucho - Vas a tener que tirar tu BD de nuevo
    private LocalDate fechaNacAutor;



    //relacion bd
    @OneToMany(mappedBy = "autores") //no hace falta metodo ni columna porque no se visualiza, nombre en plural
    private List<Libros> listaLibros;

    //constructor vacio
    public Autores(){}

    //constructor con parametros
    public Autores(int id, String nombreAutor, String apellidoAutor, LocalDate fechaNacAutor){
        this.id = id;
        this.nombreAutor = nombreAutor;
        this.fechaNacAutor = fechaNacAutor;

    }

    //getters y setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidoAutor() {
        return apellidoAutor;
    }

    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }

    public LocalDate getFechaNacAutor() {
        return fechaNacAutor;
    }

    public void setFechaNacAutor(LocalDate fechaNacAutor) {
        this.fechaNacAutor = fechaNacAutor;
    }
}
