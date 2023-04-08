package org.example;

import Servicio.PersonaServicio;

public class Main {
    public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicio();
        try {
            PersonaServicio.PrintPeople();
        }catch (Exception e){
            System.out.println(e.getMessage();
        }
    }
}