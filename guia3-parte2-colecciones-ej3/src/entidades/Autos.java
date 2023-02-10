/*3- Una concesionaria necesita implementar un sistema de cargas, que le facilite ver las marcas que maneja y el stock
que contiene de cada una. (Atributos: Marca y Stock). 🏎🏁
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo que se pide a continuación:
• Que contenga una consulta de si desea ingresar otro móvil mas o no.
❑ Si decide que no:
- Se mostrara la lista completa de lo que contiene.
- También habrá una lista de la marca que contenga menos de 3 móviles.
- Y una lista mas que contenga la marca con mas de 10 móviles disponibles.*/

package entidades;

import java.util.ArrayList;
import java.util.Scanner;
public class Autos {

    //atributos
    private String marca;
    private int stock;

    private ArrayList<Autos> listaAutos; //atributo lista

    //constructor
    public Autos() {
        this.marca = marca;
        this.stock = stock;
        this.listaAutos = listaAutos;
    }

    //setters & getters para enviar y recuperar informacion

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Autos> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(ArrayList<Autos> listaAutos) {
        this.listaAutos = listaAutos;
    }

    //metodos

    public void CrearAuto(){
        //importar escanner
        Scanner input = new Scanner(System.in);
        //iniciar instancia

        System.out.println("Ingrese la marca del auto: ");
        String marca = input.next();
        System.out.println("Ingrese stock disponible: ");
        int stock = input.nextInt();

        //corresponde al metodo de abajo pero se pone aca


        //agregarData(auto);

    }

    //se cargan los datos (atributos) en la lista con .add haciendo referencia con palabra reservada this del objeto/clase autos
    public void agregarData(Autos auto){

        //de la clase Auto, objeto auto
        this.listaAutos.add(auto);
    }

    //se muestra la lista dentro del metodo con for each
    //la clase (Autos), variable que recorre uno a uno (i), la lista a recorrer (listaAutos),   imprimir i

    public void ListaStock(){
        for (Autos i : listaAutos) {
            System.out.println(i);
        }


    }

    public void StockMenor3(){
        for (Autos i : listaAutos) {
            if (i.getStock() <= 3){
                System.out.println("\n" + "Lista de marcas con menor Stock : ");
                System.out.println(i);
            }
        }
    }

    public void StockMayor10(){
        for (Autos i : listaAutos) {
            if (i.getStock() >= 10){
                System.out.println("\n" + "Lista de marcas con mayor Stock : ");
                System.out.println(i);
            }
        }
    }



    @Override
    public String toString() {
        return "\n" +
                "Marca: " + marca + "\n" +
                "Stock: " + stock;
    }


    public void listaAutos() {
    }
}
