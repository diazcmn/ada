import entidades.Ardilla;
import entidades.Tigre;

//aca no se puede instanciar Animales por ser abstracta
public class Main {
    public static void main(String[] args) {
        Tigre tigre = new Tigre( "zucaritas", 5);
        tigre.TipoAnimal();

        Ardilla ardilla = new Ardilla("albin", 2);
        ardilla.TipoAnimal();
    }
}