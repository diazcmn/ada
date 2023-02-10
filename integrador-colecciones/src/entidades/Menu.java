package entidades;

import java.util.Scanner;

public class Menu {

    public void menu(){

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Series series = new Series();
        boolean salir = false;
        String opcion = "";


        while (!salir){

            System.out.println("\n" +"Cargar series: " + "\n"
                    + "Elija una opcion:" + "\n" +
                    "- 1. Agregar serie: " + "\n" +
                    "- 2. Lista de series: ." + "\n" +
                    "- 3. Lista de todas las series menores de 15 minutos: " + "\n" +
                    "- 4. Lista de todas las series menores de 40 minutos:" + "\n" +
                    "- 5. Lista de todas las series de categoría “Romance”: " + "\n" +
                    "- 6. Lista de todas las series de categoría “Comedia”: " + "\n" +
                    "- 7. Lista de todas las series de categoría “Drama”: " + "\n" +
                    "Seleccion: ");

            opcion = input.next();


            switch (opcion) {

                case "1":

                    System.out.println("\n" + "" );
                    series.crearSerie();

                    break;

                case "2":

                    series.verLista();

                    break;

                case "3":
                    series.menor15();
                    break;

                case "4":
                   series.mayor40();
                    break;

                case "5":
                    series.categoriaRomance();
                    break;

                case "6":
                    series.categoriaRomance();
                    break;

                case "7":
                    series.categoriaRomance();
                    break;

                case "8":

                    System.out.println("Terminado.");
                    salir = true;

                    break;

                default:
                    System.out.println("Ingresar opcion valida: ");

            }
        }
    }
}