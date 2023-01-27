import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Asignacion de la lista
        List<Integer> ListaNumeros = new ArrayList<Integer>();

        //Añadimos elementos a la lista
        ListaNumeros.add(1);
        ListaNumeros.add(2);
        ListaNumeros.add(3);

        //Implementacion del bucle for each para imprimir
        for (Integer valor: ListaNumeros){ //Tipo de  dato que maneja, nombre para hacer referencia al for each donde guardara los numeros de la lista uno a uno.
            System.out.println(valor);


        }

    }
}