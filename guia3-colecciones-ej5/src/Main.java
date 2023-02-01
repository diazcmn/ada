import entidades.AlumnoServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        AlumnoServicio listaAlumno = new AlumnoServicio();
        Integer nota1;
        String nombre;
        Integer nota2;
        Integer nota3;
        String termina = "";


        listaAlumno.CrearAlumno("Fer", 10, 8, 8);
        listaAlumno.CrearAlumno("Mar", 10, 10, 9);
        listaAlumno.CrearAlumno("Fatima", 10, 7, 8);


        System.out.println("Carga de alumnos a la lista");
        do {

            System.out.println("Ingrese el nombre");
            nombre = leer.next();
            System.out.println("Ingrese la primer nota");
            nota1=leer.nextInt();
            System.out.println("Ingrese la segunda nota");
            nota2=leer.nextInt();
            System.out.println("Ingrese la  tercer nota");
            nota3=leer.nextInt();

            System.out.println("Para ingresar otro alumno presione S, de lo contrario cualquier tecla.");
            termina= leer.next();
            listaAlumno.CrearAlumno(nombre, nota1, nota2, nota3);


        } while (termina.equalsIgnoreCase("s"));

        System.out.println("\n" + "Lista de alumnos: ");
        listaAlumno.verListado();

    }

    }
