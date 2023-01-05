package entidades;

public class Tigre extends Animales {
    //clase hija
    public Tigre() {
    }

    public Tigre(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void TipoAnimal() {
        System.out.println("Es carnivoro");
        System.out.println("Mi nombre es " + nombre + "y mi edad" + edad);
    }
}
