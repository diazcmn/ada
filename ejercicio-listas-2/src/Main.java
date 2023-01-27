import entidades.Libro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Libro> biblioteca = new ArrayList<>();

        biblioteca.add(new Libro("El principito", "Antoine de Saint-Exupéry", 120));
        biblioteca.add(new Libro("El hombre en busca de sentido", "Viktor Emil Frankl", 168));
        biblioteca.add(new Libro("12 reglas para vivir", "Jordan Peterson", 268));

        System.out.println("Libros cargados: ");
        for (Libro libros : biblioteca) {
            System.out.println(libros.getTitulo());
            System.out.println(libros.getAutor());
            System.out.println(libros.getPaginas());
            System.out.println();
        }

    }
}