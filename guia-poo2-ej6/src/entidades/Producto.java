package entidades;

public abstract class Producto {

    protected String marca;
    protected int stock;
    protected int ventas;




    public Producto(){

    }

    public Producto(String marca, int stock, int ventas) {
        this.marca = marca;
        this.stock = stock;
        this.ventas = ventas;

    }

    public abstract void InfoProd();


}
