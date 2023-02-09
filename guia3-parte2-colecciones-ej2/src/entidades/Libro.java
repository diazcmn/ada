/*2-Una biblioteca necesita implementar un sistema en el que se puedan cargar libros. Para esto, tendremos una clase
Libro con el titulo, autor y numero de la paginas. Implemente las clases y métodos necesarios para esta situación,
📚 Teniendo en cuenta lo que se pide a continuación:
• En el main deberemos tener un bucle que crea un objeto Libro pidiéndole al usuario todos sus datos y guardándolos
en el objeto Libro.
• Después, esa Libro se guarda una lista y se le pregunta al usuario si quiere crear otro libro o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas los libros.
• Mostrar las libros mayores o iguales a 300 paginas.
• Mostrar las libros menores a 150 paginas.
*/

package entidades;

import java.util.ArrayList;
import java.util.Scanner;


public class Libro {

    private String titulo;
    private String autor;
    private int numPag;

    ArrayList<Libro> listaLibros;


    public Libro(){
        this.listaLibros = new ArrayList<>();
    }

    public Libro(String titulo, String autor, int numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void CrearLibro(){
        Scanner input = new Scanner(System.in);
        Libro libro = new Libro();

        System.out.println("Ingresar titulo: ");
        String titulo = input.next();
        System.out.println("Ingrese autor: ");
        String autor = input.next();
        System.out.println("Ingresae cantidad de paginas: ");
        int numPag = input.nextInt();

       agregarLibro(libro);


    }

    public void agregarLibro(Libro libro){
        listaLibros.add(libro);
    }

    public void verListado(){
        for (Libro libro: listaLibros) {
            System.out.println(libro);

        }
    }


    public void LibrosMayor300P(){
        for (Libro i : listaLibros) {
            if (i.getNumPag() >=300){
                System.out.println("\n" + "Libros con 300 o mas paginas: ");
                System.out.println(i);
            }
        }
    }

    public void LibrosMenor150P(){
        for (Libro i : listaLibros) {
            if (i.getNumPag() <=150){
                System.out.println("\n" + "Libros con 150 o menos paginas: ");
                System.out.println(i);
            }
        }
    }

    @Override
    public String toString() {
        return   "\n" +
                "Titulo: " + titulo + "\n" +
                "Autor: " + autor + "\n"  +
                "Paginas: " + numPag;
    }






}
