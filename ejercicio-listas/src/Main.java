/*Empecemos con Listas 🤓

📌 Para tener en cuenta, crear una lista:
   List<Integer> ListaNumeros = new ArrayList<Integer>();

En el main:
- Creamos una Lista con 7 numeros asignados de manera directa con el metodo add();
Recordemos que tenemos que llamar a nuestro Objeto Lista segun el nombre que le proporcionamos, y ahi añadir uno a uno.

- Luego crearemos una segunda Lista de numeros de manera dinamica, es decir  que el usuario pueda ingresar la cantidad de numeros que quiera en la lista, y luego mostrarla por pantalla.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Integer> lisNum = new ArrayList<Integer>();

        //Pedimos  al usuario la cantidad de numeros que quisiera en su lista
        System.out.println("Ingrese la cantidad de numeros a cargar: ");
        int N = input.nextInt();

        //Guardamos los numeros con un bucle for, una a uno
        for (int i = 0; i< N; i++){
            System.out.println("Ingrese un numero nuevo");
            int numero = input.nextInt();
            lisNum.add(numero); //Añadimos a la lista uno a uno los numeros ingresados con ayuda del scanner y nuestra variable local
        }

        //Forma tradicional del for, imprimiendo con un indice
     /*   for (int i = 0; i < lisNum.size(); i++) {
            int elemento = lisNum.get(i);  //Get obtiene uno a uno los numeros de la lista
            System.out.println(elemento); //elemento es donde guardamos los numeros uno a uno. Al estar  en un bucle, se rompe cuando no hayan mas numeros en la lista
        }
      */

        //For each - Haciendo referencia el tipo de dato - nombre del for  each y que guardaremos de esa lista que estamos trabajando
        for (Integer elemento: lisNum) {
            System.out.println(elemento); //Imprime uno a uno, los numeros de la lista.
        }


    }
}