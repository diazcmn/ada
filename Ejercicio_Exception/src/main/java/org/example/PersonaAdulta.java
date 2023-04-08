package org.example;

public class PersonaAdulta {

    private String nombre;
    private int edad;

    //la excepcion siempre va despues del constructor de impotancia

    //constructor
    public PersonaAdulta(String nombre, int edad) throws Exception{
        this.nombre = nombre;

        if (edad < 18){
            throw new Exception(nombre + "no es adulto, tiene" + edad);
            //this.edad = edad;
        }

    }

    //metodo
    public void fijarEdad (int edad) throws Exception{
        if (edad < 18) {
            throw new Exception(nombre + "no es adulto, tiene" + edad);
            //this.edad=edad;
        }

    }

    public void Imprimir(){
        System.out.println(nombre + edad);
    }
}
