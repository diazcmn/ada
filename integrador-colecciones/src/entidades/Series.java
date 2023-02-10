package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Series {

    private String categoria;
    private int duracion;
    private String nombre;

    private ArrayList<Series> listaSeries;

    public Series(){

    }

    public Series(String categoria, int duracion, String nombre, ArrayList<Series> listaSeries) {
        this.categoria = categoria;
        this.duracion = duracion;
        this.nombre = nombre;
        this.listaSeries = listaSeries;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Series> getListaSeries() {
        return listaSeries;
    }

    public void setListaSeries(ArrayList<Series> listaSeries) {
        this.listaSeries = listaSeries;
    }


    public void crearSerie(){

        Scanner input = new Scanner(System.in);
        Series serie = new Series();

        System.out.println("Ingresar nombre de la serie: ");
        String nombre = input.next();
        serie.setNombre(nombre);

        System.out.println("Ingrese la categoria de la serie: ");
        String categoria = input.next();
        serie.setCategoria(categoria);

        System.out.println("Ingrese la duracion de la serie, en minutos: ");
        int duracion = input.nextInt();
        serie.setDuracion(duracion);

        añadirSerie(serie);
    }

    public void añadirSerie(Series serie){
        this.listaSeries.add(serie);
    }

    public void verLista(){
        System.out.println("\n" + "⏳ Lista de series: ");
        for (Series lista : listaSeries) {
            System.out.println(lista);
        }
    }

    public void menor15(){
        System.out.println("\n" + "⏳ Listado completo de series menores o igual a 15 minutos: ");
        for (Series i : listaSeries) {
            if (i.getDuracion() <= 15){
                System.out.println(i);
            }
        }
    }

    public void mayor40(){
        System.out.println("\n" + "⏳ Listado completo de series mayores o igual a 40 minutos: ");
        for (Series i : listaSeries) {
            if (i.getDuracion() >= 40){
                System.out.println(i);
            }
        }
    }

    public void categoriaRomance(){
        System.out.println("\n" + "⏳ Listado completo de series Categoria ROMANCE : ");
        for (Series i : listaSeries) {
            if (i.getCategoria().equalsIgnoreCase("Romance")){
                System.out.println(i);
            }
        }
    }

    public void categoriaComedia(){
        System.out.println("\n" + "⏳ Listado completo de series Categoria COMEDIA : ");
        for (Series i : listaSeries) {
            if (i.getCategoria().equalsIgnoreCase("Comedia")){
                System.out.println(i);
            }
        }
    }

    public void categoriaDrama(){
        System.out.println("\n" + "⏳ Listado completo de series Categoria DRAMA : ");
        for (Series i : listaSeries) {
            if (i.getCategoria().equalsIgnoreCase("Drama")){
                System.out.println(i);
            }
        }
    }



    @Override
    public String toString() {
        return
                "Nombre: " + nombre + "\n" +
                        "Categoria: " + categoria + "\n" +
                        "Duracion: " + duracion + "\n" +
                        "\n";
    }
}
