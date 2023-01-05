package entidades;

public class Auto extends Vehiculo{

    //propio
    protected  String color;

    public Auto(){

    }

    public Auto(String color) {
        this.color = color;
    }

    //compartido
    public Auto(String marca, String puertas, int km, String color) {
        super(marca, puertas, km);
        this.color = color;
    }

    //sobreescribo metodo abstracto, especifìco
    @Override
    public void marcha() {
        System.out.println("Su marcha esta una velocidad rapida");
        System.out.println("Marca" + marca + "Puertas" + puertas + "km" + km );

    }
}
