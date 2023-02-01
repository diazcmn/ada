package entidades;

import java.util.ArrayList;

public class AlumnoServicio {
    private ArrayList<Alumno> listaAlumnos;

    public AlumnoServicio(){

        this.listaAlumnos = new ArrayList<>();
    }

    public AlumnoServicio(ArrayList<Alumno> alumnos) {
        this.listaAlumnos = alumnos;
    }

    public void CrearAlumno(String nombre, Integer nota1, Integer nota2, Integer nota3){
        Alumno alumno = new Alumno();
        ArrayList<Integer> notas = new ArrayList();

        alumno.setNombre(nombre);
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        alumno.setNota(notas);

        añadirAlumno(alumno);

    }

    public void añadirAlumno(Alumno alumno) {
        this.listaAlumnos.add(alumno);
    }

    public void verListado(){
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno.toString());

        }

    }
    }


