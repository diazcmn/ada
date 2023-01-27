package Postres;

import java.util.Scanner;

public class Torta extends Postres{

    public Torta(){

    }

    public Torta(String sabor) {
        super(sabor);
    }

    @Override
    public void CrearPostre() {
        //Scanner input = new Scanner(System.in).useDelimiter("");
        //esto es lo dinamico
        //System.out.println("De que sabor quiere la torta ?");
        //sabor  = input.nextLine();

        Scanner entrada = new Scanner(System.in);
        System.out.println("De que sabor desea la torta");
        String sabor = entrada.nextLine();
        System.out.println("Su torta es sabor"+sabor);
    }
}
