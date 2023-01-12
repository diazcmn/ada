package entidades;

public class ProductoEnvasado extends Producto{

    protected String clase;

    public ProductoEnvasado(){

    }

    public ProductoEnvasado(String clase) {
        this.clase = clase;
    }

    public ProductoEnvasado(String marca, int stock, int ventas, String clase) {
        super(marca, stock, ventas);

    }

    @Override
    public void InfoProd(){
        System.out.println("Clase " + clase + "/n marca" +marca+ "stock " +stock + "ventas " + ventas);
    }
}

