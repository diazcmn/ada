package com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad;


import jakarta.persistence.*;

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
    private String fechaNacAutor;



    //relacion bd
    @OneToMany(mappedBy = "autor") //no hace falta metodo ni columna porque no se visualiza
    private List<Libros> listaLibros;

    //constructor vacio
    public Autores(){}

    //constructor con parametros
    public Autores(int id, String nombreAutor, String apellidoAutor, String fechaNacAutor){
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

    public String getFechaNacAutor() {
        return fechaNacAutor;
    }

    public void setFechaNacAutor(String fechaNacAutor) {
        this.fechaNacAutor = fechaNacAutor;
    }
}
