package entidades;

public abstract class FiguraGeometrica {
    protected String figura;
    protected int area;
    protected int base;
    protected int altura;
    protected double PI = 3.14159265359;
    protected int radio;

    public FiguraGeometrica(){

    }

    public FiguraGeometrica(String figura, int area, int base, int altura, double PI, int radio) {
        this.figura = figura;
        this.area = area;
        this.base = base;
        this.altura = altura;
        this.PI = PI;
        this.radio = radio;
    }

    public abstract void area();
}
