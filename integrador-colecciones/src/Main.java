import entidades.Menu;
import entidades.Series;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);
        Series listas = new Series();
        String fin = "";

        System.out.println("SISTEMA DE CARGA - INGRESE LOS SIGUIENTES DATOS:  ");
        do {

            listas.crearSerie();

            System.out.println("Si desea ingresar otra serie, Presione S, de lo contrario cualquier tecla para salir: ");
            fin = input.next();

        }while (fin.equalsIgnoreCase("S"));

        listas.verLista();

        listas.menor15();

        listas.mayor40();

        listas.categoriaRomance();

        listas.categoriaDrama();

        listas.categoriaComedia();
    }*/


        Menu menuSeries = new Menu();
        menuSeries.menu();



}
}

