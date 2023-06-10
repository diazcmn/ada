package com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad;


import jakarta.persistence.*;

@Entity
@Table
public class Libros {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "autor", length = 100, nullable = false)
    private String autor;

    @Column(name = "titulo", length = 100, nullable = false)
    private String titulo;

    @Column(name = "ISBN", length = 100, nullable = false)
    private String ISBN;

    @Column(name = "anioEdicion", length = 100, nullable = false)
    private String anioEdicion;

    @Column(name = "cantidadEjemplares", length = 100, nullable = false)
    private int cantidadEjemplares;

    @Column(name = "condicionEjemplar", length = 100, nullable = false)
    private String condicionEjemplares;

    //relacion bd
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autores autores;

    //contrusctor vacio
    public Libros(){}



    //contructor con parametros
    public Libros(int id, String autor, String titulo, String ISBN, String anioEdicion, int cantidadEjemplares, String condicionEjemplares ){
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.anioEdicion = anioEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
        this.condicionEjemplares = condicionEjemplares;
    }
}
