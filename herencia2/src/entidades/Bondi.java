package entidades;

public class Bondi extends Vehiculo{

    protected int asientos;

    //constructir vacio
    public Bondi(){

    }

    //constructor propio
    public Bondi(int asientos){
        this.asientos = asientos;
    }

    //constructor compratido
    public Bondi(String marca, String puertas, int km, int asientos) {
        super(marca, puertas, km); //lo que estamos heredando
        this.asientos = asientos; //actual, propio de esta clase
    }

    //implementar nuestro metodo

    @Override
    public void marcha() {
        System.out.println("Su marcha es mas tranquila");
        System.out.println("Marca" + marca + "Puertas" + puertas + "km" + km );
    }
}
