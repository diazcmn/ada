package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicio {
    private ArrayList<Pelicula> listaPeliculas;

    public PeliculaServicio() {
        this.listaPeliculas = new ArrayList<>();
    }

    public Pelicula crearPelicula(String titulo, String director, int duracion) {
        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        return pelicula;
    }

    public ArrayList<Pelicula> agregarPeliculas() {

        System.out.println("Ingrese una pelicula");
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String fin = "";
        do {
            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = input.next();
            System.out.println("Ingrese el director");
            String director = input.next();
            System.out.println("Ingrese la/s hora/s de duracion");
            int duracion = input.nextInt();

            listaPeliculas.add(crearPelicula(titulo, director, duracion));
            System.out.println("Si desea ingresar otra pelicula, Presione S, de lo contrario cualquier tecla para salir.");
            fin = input.next();
        } while (fin.equalsIgnoreCase("s"));
        return listaPeliculas;
    }


    public void verListadoPeliculas() {
        for (Pelicula i : listaPeliculas) {
            System.out.println(i);
        }
    }

    public void PeliculasMayorDosHoras() {
        for (Pelicula i : listaPeliculas) {
            if (i.getDuracionHora() >= 2) {
                System.out.println(i);
            }

        }
    }

    public void PeliculasMenorDosHoras() {
        for (Pelicula i : listaPeliculas) {
            if (i.getDuracionHora() < 2) {
                System.out.println(i);
            }

        }
    }


}