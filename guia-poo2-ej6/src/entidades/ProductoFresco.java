package entidades;

public class ProductoFresco extends Producto{

    protected String tipo;

    public ProductoFresco(){}

    public ProductoFresco(String tipo) {
        this.tipo = tipo;
    }

    public ProductoFresco(String marca, int stock, int ventas, String tipo) {
        super(marca, stock, ventas);

    }

    @Override
    public void InfoProd() {
        System.out.println("Tipo " + tipo + " marca" +marca+ "stock " +stock + "ventas " + ventas);
    }
}
