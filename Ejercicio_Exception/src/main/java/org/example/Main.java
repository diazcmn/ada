package org.example;

public class Main {
    public static void main(String[] args) {
        try{

            PersonaAdulta persona1 = new PersonaAdulta("maru", 27);
            persona1.Imprimir();
            PersonaAdulta persona2 = new PersonaAdulta("cecilia", 17);
            persona2.Imprimir();
        }catch(Exception e){

            System.out.println(e.getMessage());
        }finally {
            System.out.println("se termino lo que se daba");
        }
    }
}