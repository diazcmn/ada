import entidades.Auto;
import entidades.Bondi;

public class Main {
    public static void main(String[] args) {
    //no podemos instanciar ni crear un objeto
        // directamente se hace referencia a que tipo de vehiculo queremos crear

        Auto auto1 = new Auto("Corolla", "cuatro", 0, "blanco");
        auto1.marcha();//primer clase hija creada de la herencia veiculo

        Bondi bondi1 = new Bondi("Ben", "dos", 6354, 20);
        bondi1.marcha();





    }
}