package entidades;

public abstract class Vehiculo {

    protected String marca;
    protected int modelo;
    protected String color;

    public Vehiculo(){

    }

    public Vehiculo(String marca, int modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public abstract void Vehiculo();
    public void FichaTecnica(){
        System.out.println("Marca: " + marca + "" "modelo" +modelo+ "color" +color);
    }
}

