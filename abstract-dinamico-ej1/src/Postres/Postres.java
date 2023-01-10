package Postres;

public abstract class Postres {

    protected String sabor;

    public Postres(){

    }

    public Postres(String sabor) {
        this.sabor = sabor;
    }

    public abstract void CrearPostre();


}
