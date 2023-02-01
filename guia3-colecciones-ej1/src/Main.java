/*1- Realizar en la clase Main, una lista de nombres dados por el usuario, tanto la cantidad de nombres a ingresar y los
nombres por ingresar.
Luego eliminaremos el nombre en la ubicación (guiarnos por el índice), numero tres y uno.
Vamos a ordenar la lista alfabéticamente. 🧩 Llamar a la clase Collections.sort(nombreLista);
Después lo mostramos por pantalla el tamaño de la lista (recordemos el método size), y la lista completa de los
nombres; aplicar la lógica correspondiente para dicho caso.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);
        List<String> listadeNombres = new ArrayList<>();

        System.out.println("Ingrese cantidad de nombres ");
        int N= input.nextInt();

        for (int i= 0; i<N; i++){
            System.out.println("Ingrese un nombre: ");
            String nombre= input.next();
            listadeNombres.add(nombre);

        }
        listadeNombres.remove(1);
        listadeNombres.remove(3);
        Collections.sort(listadeNombres);

        System.out.println("El tamaño de la lista es: " + listadeNombres.size());


        for(String valor: listadeNombres){
            System.out.println("El nombre ingresado es: " + valor);



        }
    }
}
