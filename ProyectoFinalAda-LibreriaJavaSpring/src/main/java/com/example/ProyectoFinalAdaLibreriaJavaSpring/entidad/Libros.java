package com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad;


import javax.persistence.*;

@Entity
@Table
public class Libros {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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
    @JoinColumn(name = "libro_id")
    private Libros libros;

    //contrusctor vacio
    public Libros(){}



    //contructor con parametros
    public Libros(int id, String libro, String titulo, String ISBN, String anioEdicion, int cantidadEjemplares, String condicionEjemplares ){
        this.id = id;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.anioEdicion = anioEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
        this.condicionEjemplares = condicionEjemplares;
    }

    //getter y setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(String anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getCondicionEjemplares() {
        return condicionEjemplares;
    }

    public void setCondicionEjemplares(String condicionEjemplares) {
        this.condicionEjemplares = condicionEjemplares;
    }
}
