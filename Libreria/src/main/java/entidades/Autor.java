package entidades;

//configuraciones para poder pasar a la base de datos

import javax.persistence.*;

//se declara la clase como entidad con @entity
@Entity

//toda entidad es una tabla en particular se aclara con @table que tambien es una tabla
@Table(name = "autor" )

public class Autor {

    //atributos clase entidad

    @Id //notacion id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autogenerado de manera secuencial
    private Integer Id;

    //identificar como columna los atributos
@Column(name = "nombre_autor", length = 100, nullable = false) //datos de columna como en mysql
    private String nombre_autor;

@Column(name = "apellido_autor", length = 100, nullable = false)

private String apellido_autor;

//constructor vacio para trabajar de forma dinamica

    public Autor(){

    }

    //constructores por parametros, getters y setters


    public Autor(Integer id, String nombre_autor, String apellido_autor) {
        Id = id;
        this.nombre_autor = nombre_autor;
        this.apellido_autor = apellido_autor;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre_autor() {
        return nombre_autor;
    }

    public void setNombre_autor(String nombre_autor) {
        this.nombre_autor = nombre_autor;
    }

    public String getApellido_autor() {
        return apellido_autor;
    }

    public void setApellido_autor(String apellido_autor) {
        this.apellido_autor = apellido_autor;
    }
}



