package entidades;

public abstract class Alimento {

    protected String nombre;
    protected String marca;
    protected String RangoPrecio;

    public Alimento(){

    }

    public Alimento(String nombre, String marca, String rangoPrecio) {
        this.nombre = nombre;
        this.marca = marca;
        RangoPrecio = rangoPrecio;
    }

    public abstract void TipoAlimento();
}
