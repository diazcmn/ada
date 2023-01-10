import entidades.Carnivoro;
import entidades.Hervivoro;

public class Main {
    public static void main(String[] args) {

        Carnivoro cocodrilo = new Carnivoro("cocodrilo","alto", 150);
        cocodrilo.tipoAnimal();
        cocodrilo.Alimentacion();
        cocodrilo.MostrarDatos();

        Hervivoro cervatillo = new Hervivoro("cervatillo", "nulo", 7);
        cervatillo.tipoAnimal();
        cervatillo.Alimentacion();
        cervatillo.MostrarDatos();


    }
}