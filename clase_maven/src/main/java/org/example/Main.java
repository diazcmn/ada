package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base;
        /*  System.out.println("Ingrese un valor entero: ");
        base = input.nextInt();
        int square = base * base;
        System.out.println("El cuadrado es " + base + ""+square);
        */

        //try catch

        try{
            System.out.println("ingrese valor entero: ");
            base = input.nextInt();
            int square = base * base;
            System.out.println("El cuadrado es " + base + ""+square);
        }catch (InputMismatchException e){

            System.out.println("numero entero dije: ");
        }finally {
            System.out.println("fin");
        }


    }
}