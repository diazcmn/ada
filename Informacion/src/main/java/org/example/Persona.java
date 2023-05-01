package org.example;


import javax.persistence.*;

@Entity
@Table(name="Informacion")

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String nombre;

    @Column()

    private String ap;

    @Column String correo;

    //constructor sin argumentos
    public Persona(){}


    public Persona(Long id, String nombre, String ap, String correo){
        this.id = id;
        this.nombre = nombre;
        this.ap = ap;
        this.correo = correo;

    }

    //getters y setters


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

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


}
