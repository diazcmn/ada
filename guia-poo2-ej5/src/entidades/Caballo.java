package entidades;

public class Caballo extends Animal{

    public Caballo(){

    }

    public Caballo(String nombre, String comida, int edad, String raza) {
        super(nombre, comida, edad, raza);
    }

    @Override
    public void Alimentacion() {
        System.out.println("Come heno");
    }

    @Override
    public void MostrarDatos() {
        System.out.println("CABALLO - Nombre " + nombre + "\n comida " + comida + " \n edad " + edad + "\n raza " + raza);
    }
}
