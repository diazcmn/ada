package entidades;

public class Ardilla extends Animales{

    //constructor vacio
    public Ardilla() {
    }

    //constructor con parametros
    public Ardilla(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void TipoAnimal() {
        System.out.println("Es hervivoro");
        System.out.println("Mi nombre es " + nombre + "y mi edad" + edad);

    }
}
