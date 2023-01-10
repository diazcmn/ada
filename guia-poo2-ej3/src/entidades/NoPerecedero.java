package entidades;

public class NoPerecedero extends Alimento{

    protected int porciones;

    public NoPerecedero(){

    }

    public NoPerecedero(int porciones) {
        this.porciones = porciones;
    }

    public NoPerecedero(String nombre, String marca, String rangoPrecio, int porciones) {
        super(nombre, marca, rangoPrecio);
        this.porciones = porciones;
    }

    @Override
    public void TipoAlimento(){
        System.out.println(nombre + "marca" + marca + "rango del precio" + RangoPrecio + "porciones" + porciones);
    }
}

