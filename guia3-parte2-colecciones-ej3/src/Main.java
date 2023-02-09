
import entidades.Autos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //importar scanner
        Scanner input = new Scanner(System.in);
        //instancio para mostar datos
        Autos listar = new Autos();

        String end = ""; //variable vacia para cortar ciclo, lo ingresa el usuario, por eso vacia

        System.out.println("Ingreso de datos: ");
        //ciclo

        do {

            listar.CrearAuto();
            System.out.println("Si desea ingresar otro presione S, " +
                    "de lo contrario para salir cualquier tecla");
            end = input.next();


        }while (end.equalsIgnoreCase("s"));

        listar.listaAutos();
        listar.StockMenor3();
        listar.StockMayor10();
    }
}