import entidades.VetServicio;

public class Main {
    public static void main(String[] args) {


        VetServicio servicioIngreso = new VetServicio();
        servicioIngreso.ingresarMascota();
        System.out.println("Peliculas cargadas: ");
        servicioIngreso.verListaMascotas();

        System.out.println("Mascotas viejas:");
        servicioIngreso.mascotasViejas();

        System.out.println("Mascotas jovenes:");
        servicioIngreso.mascotasJovenes();


    }
}