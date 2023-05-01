package org.example;

import servicios.MenuServicio;

public class Main {
    public static void main(String[] args) {
       //instancia menuservicio

        MenuServicio menuServicio = new MenuServicio();
        try {
            menuServicio.Menu();


        }catch (Exception e){

        System.out.println(e.getMessage());
    }
}
}