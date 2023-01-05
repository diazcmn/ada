package entidades;

public abstract class Vehiculo {

    protected  String marca;
    protected  String puertas;
    protected  int km;

    public Vehiculo(){

    }

    public Vehiculo(String marca, String puertas, int km) {
        this.marca = marca;
        this.puertas = puertas;
        this.km = km;
    }

    //metodo abstracto no especifica, eso se hace despues en cada clase
    //hija, este en un aspecto general, en este caso accion, todos tienen marcha
    //pero no todos se ponen en marcha igual
    public abstract void marcha();
}
