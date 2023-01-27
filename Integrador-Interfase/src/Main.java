import entidades.ImpCrear;

public class Main {
    public static void main(String[] args) {

        ImpCrear autor1  = new ImpCrear();
        autor1.crearAutor();




        ImpCrear libro1 = new ImpCrear();
        libro1.crearLibro();
        libro1.MostrarLibros();

        ImpCrear autor2  = new ImpCrear();
        autor2.crearAutor();



        ImpCrear libro2 = new ImpCrear();
        libro2.crearLibro();
        libro2.MostrarLibros();

        ImpCrear autor3  = new ImpCrear();
        autor3.crearAutor();



        ImpCrear libro3 = new ImpCrear();
        libro3.crearLibro();
        libro3.MostrarLibros();



}
}