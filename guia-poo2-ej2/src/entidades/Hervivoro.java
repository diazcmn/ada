package entidades;

public class Hervivoro extends Animales {

    public Hervivoro() {

    }

    public Hervivoro(String animal, String peligro, int edad) {
        super(animal, peligro, edad);
    }

    @Override
    public void tipoAnimal(){
        System.out.println("Animal hervivoro");
    }

    @Override
    public void Alimentacion(){
        System.out.println("Come plantas");
    }

    @Override
    public void MostrarDatos(){
        System.out.println("El animal es" + animal + "su nivel de peligro es" +peligro + "y tiene" +edad+ "años");

    }
}
