import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero;
        String fin = "";

        List <Integer> listaContacto = new ArrayList<Integer>();

        do {
            System.out.println("Ingrese un numero de contacto");
            numero = input.nextInt();

            System.out.println("¿Desea ingresar otro contacto? - Presione S para seguir," +
                    " de lo contrario cualquier tecla");
            listaContacto.add(numero);

            fin= input.next();
        }while (fin.equalsIgnoreCase("s"));

        System.out.println("Su lista de contactos es la siguiente:");
        for (Integer Lista : listaContacto) {
            System.out.println(Lista);
        }
    }
}