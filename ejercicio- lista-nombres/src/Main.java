/*1- Realizar en la clase Main, una lista de nombres al azar, dados por el usuario.
Condiciones para el ejercicio:
-Eliminaremos el nombre en la ubicación número dos.
-También vamos a ordenar la lista alfabéticamente.
🧩 Llamar a la clase y método Collections.sort(nombreLista);
-Después lo mostramos por pantalla, aplicando la lógica correspondiente para dicho caso.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<String> ListaNombres = new ArrayList<String>();

        System.out.println("Ingrese la cantidad de nombres a cargar:");
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese un nombre nuevo");
            String nombre = input.next();
            ListaNombres.add(nombre);
        }

        for (String elemento : ListaNombres) {
            System.out.println(elemento);
        }

    }
}