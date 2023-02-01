package entidades;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private ArrayList<Integer> nota ;

    public Alumno(){

    }

    public Alumno(String nombre, ArrayList<Integer> nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    @Override
    public String toString(){
        return
                "Nombre: " + nombre + "notas" + nota ;
    }
}
