package org.example;

public class Main {
    public static void main(String[] args) {

        cliente cliente1 = new cliente("fer", 1000);
        cliente1.imprimir();
        cliente1.depositar(2000);
        cliente1.imprimir();

        try {

            cliente1.extraer(5000);
            cliente1.imprimir();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}