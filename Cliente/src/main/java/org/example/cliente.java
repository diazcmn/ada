package org.example;

public class cliente {

    String nombre;
    float monto;

    //constructor

    public cliente(String nombre, float monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    //metodos
    public void depositar (float importe){
        monto = monto + importe;
    }

    public void extraer(float importe)  throws Exception{
        //excepcion
        if (importe > monto)
            throw new Exception("no se puede");
            monto = monto - importe;
    }

    public void imprimir(){
        System.out.println(nombre + "tiene" + monto);
    }

    }

