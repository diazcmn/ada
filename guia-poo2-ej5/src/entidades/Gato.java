package entidades;

public class Gato extends Animal{
    public Gato(){

    }

    public Gato(String nombre, String comida, int edad, String raza) {
        super(nombre, comida, edad, raza);
    }

    @Override
    public void Alimentacion() {
        System.out.println("Come alimento balanceado");
    }

    @Override
    public void MostrarDatos() {
        System.out.println("GATO - Nombre " + nombre + "\n comida " + comida + " \n edad " + edad + "\n raza " + raza);
    }
}
