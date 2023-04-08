package Entidad;

public class Persona {

    private Integer PeronaId;
    private String nombre;
    private String apellido;
    private String email;

    //constructor vacio
    public Persona(){}

    //constructor por parametro


    public Persona(Integer peronaId, String nombre, String apellido, String email) {
        PeronaId = peronaId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    //getter setter

    public Integer getPeronaId() {
        return PeronaId;
    }

    public void setPeronaId(Integer peronaId) {
        PeronaId = peronaId;
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

    //toString

    @Override
    public String toString() {
        return "Persona{" +
                "PeronaId=" + PeronaId +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
