import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> razaPerro = new ArrayList<>();

        String end = "" ;
        boolean coincidencia = false ;

        //ingreso razas

        String raza;

        do {
            System.out.println("Ingresar raza: ");
            raza = input.next();
            System.out.println("Desea ingresar otra raza? digite s para continuar, de lo contrario presionar cualquier tecla: ");
            razaPerro.add(raza);
            end = input.next();
        }while (end.equalsIgnoreCase("s"));

        System.out.println("Las razas ingresadas son: ");
        for (String razasIngresadas : razaPerro){
            System.out.println(razasIngresadas);
        }

        //ej 4
        System.out.println("\n" + "Ingrese raza de perro a eliminar: ");
        String eliminar = input.next();
        Iterator<String> iterar = razaPerro.iterator();
        while (iterar.hasNext()) {
            String elemento = iterar.next();
            if(elemento.equals(eliminar)){
                iterar.remove();
                coincidencia = true;

            }else {
                System.out.println("\n" + "La lista de razas actual: ");
                for (String razas : razaPerro) {
                    System.out.println(razas);
            }
        }
    }


}
}

