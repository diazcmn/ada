import entidades.NoPerecedero;
import entidades.Perecedero;

public class Main {
    public static void main(String[] args) {

        Perecedero arroz = new Perecedero("arroz","Gallo Oro","moderado", 4);
        arroz.TipoAlimento();

        NoPerecedero carne = new NoPerecedero("carne","Paty","Alto",2);
        carne.TipoAlimento();
    }
}