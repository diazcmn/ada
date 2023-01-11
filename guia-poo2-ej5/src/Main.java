import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

public class Main {
    public static void main(String[] args) {

        Perro petunia = new Perro("petunia", "balanceado", 4 ,"yorkshire");
        petunia.Alimentacion();
        petunia.MostrarDatos();

        Gato bobo = new Gato("bobo", "balanceado", 9, "mestizo");
        bobo.Alimentacion();
        bobo.MostrarDatos();

        Caballo pitagoras = new Caballo("pitagoras", "heno",6 ,"mestizo");
        pitagoras.Alimentacion();
        pitagoras.MostrarDatos();
    }
}