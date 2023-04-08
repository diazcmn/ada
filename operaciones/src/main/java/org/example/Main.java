package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        //instancia de la clase operacion
        Operacion operacion1 = new Operacion(10, 0);
        operacion1.sumar();
        operacion1.resta();
        operacion1.multiplicion();
        operacion1.division();

        //excepcion del metodo division
        try{

            //aca adentro va el metodo
            operacion1.division();

        }catch (Exception e){

            System.out.println(e);
        }
    }
}