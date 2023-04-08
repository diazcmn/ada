package org.example;

public class Operacion {

    private int valor1;
    private int valor2;

    //constrector
    public Operacion(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    //metodos
    public void sumar(){
        int suma= valor1 + valor2;
        System.out.println("resultado" + suma);
    }

    public void resta(){
        int resta = valor1 - valor2;
        System.out.println("resultado" + resta);
    }

    public void multiplicion(){
        int multiplicar = valor1 * valor2;
        System.out.println("resultado" + multiplicar);
    }

    //metodo con exceptcion sin toString porque es el mismo paquete
    public void division() throws Exception{
        if (valor2 == 0)
            throw new Exception("no existe");
            int dividir = valor1 / valor2;
        System.out.println("resultado" + dividir);

    }

}
