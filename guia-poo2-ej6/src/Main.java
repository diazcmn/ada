import entidades.ProductoEnvasado;
import entidades.ProductoFresco;

public class Main {
    public static void main(String[] args) {

        ProductoFresco prod1 = new ProductoFresco("natura", 200, 99, "aceite");
        prod1.InfoProd();

        ProductoEnvasado prod2 = new ProductoEnvasado("paulina", 140, 22,"pasta");
        prod2.InfoProd();

    }
}