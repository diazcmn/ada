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
        Scanner input = new Scanner(System.in).useDelimiter("");
        //esto es lo sinamico
        System.out.println("De que sabor quiere la torta ?");
        sabor  = input.nextLine();
    }
}
