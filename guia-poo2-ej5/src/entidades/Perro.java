package entidades;

public class Perro extends Animal{

    public Perro(){

    }

    public Perro(String nombre, String comida, int edad, String raza) {
        super(nombre, comida, edad, raza);
    }

    @Override
    public void Alimentacion() {
        System.out.println("Come alimento balanceado");
    }

    @Override
    public void MostrarDatos() {
        System.out.println("PERRO - Nombre " + nombre + "\n comida " + comida + " \n edad " + edad + "\n raza " + raza);

    }
}
