package entidades;

import java.util.Scanner;

public class ImpCrear implements Biblioteca{

     public String nombre;
     public String apellido;
     public int paginas;
     public String titulo;


    @Override
    public void crearAutor() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre del autor: ");
        nombre = entrada.nextLine();

        entrada = new Scanner(System.in);
        System.out.println("Ingrese el apellido del autor: ");
        apellido = entrada.nextLine();

    }
    @Override
    public void crearLibro() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese titulo del libro: ");
        titulo = entrada.nextLine();


        entrada = new Scanner(System.in);
        System.out.println("Ingrese cantidad de paginas del libro: ");
        paginas = entrada.nextInt();


    }

    public void MostrarLibros(){
        System.out.println("El nombre del autor es: " + nombre + " " + apellido);
        System.out.println("El titulo del libro es: " + titulo + "\n La cantidad de paginas son: " + paginas);
    }
}
