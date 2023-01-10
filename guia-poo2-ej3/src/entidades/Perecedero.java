package entidades;

public class Perecedero extends Alimento{

    protected int porciones;

    public Perecedero(){

    }

    public Perecedero(int porciones) {
        this.porciones = porciones;
    }

    public Perecedero(String nombre, String marca, String rangoPrecio, int porciones) {
        super(nombre, marca, rangoPrecio);
        this.porciones = porciones;
    }

    @Override
    public void TipoAlimento(){
        System.out.println(nombre + "marca" + marca + "rango del precio" + RangoPrecio + "porciones" + porciones);
    }
}
