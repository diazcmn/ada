package entidades;

public class Carnivoro extends Animales{


    public Carnivoro(){

    }

    public Carnivoro(String animal, String peligro, int edad) {
        this.animal = animal;
        this.peligro = peligro;
        this.edad = edad;
    }


    @Override
    public void tipoAnimal(){
        System.out.println("Animal carnivoro");
    }

    @Override
    public void Alimentacion(){
        System.out.println("Come carne");
    }

    @Override
    public void MostrarDatos(){
        System.out.println("El animal es" + animal + "su nivel de peligro es" +peligro + "y tiene" +edad+ "años");

    }

}
