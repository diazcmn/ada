import entidades.Libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Libro listaLibro = new Libro();

        String end="";

        do {
            listaLibro.CrearLibro();

            System.out.println("Presionar si para ingresar otro, de lo contrario cualquier tecla: ");
            end= input.next();


        }while (end.equalsIgnoreCase("si"));

        listaLibro.verListado();
        listaLibro.LibrosMenor150P();
        listaLibro.LibrosMayor300P();

    }
}

