package entidades;

public abstract class Animales {

    protected String animal;
    protected String peligro;
    protected int edad;

    public Animales(){

    }

    public Animales(String animal, String peligro, int edad) {
        this.animal = animal;
        this.peligro = peligro;
        this.edad = edad;
    }

    public abstract void tipoAnimal();
    public abstract void Alimentacion();
    public abstract void MostrarDatos();


}
