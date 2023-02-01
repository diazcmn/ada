import entidades.PeliculaServicio;

public class Main {
    public static void main(String[] args) {


        PeliculaServicio servicioCarga = new PeliculaServicio();
        servicioCarga.agregarPeliculas();
        System.out.println("Peliculas cargadas: ");
        servicioCarga.verListadoPeliculas();

        System.out.println("PELICULAS CON DURACION DE 2 HORAS O MAS HORAS:");
        servicioCarga.PeliculasMayorDosHoras();

        System.out.println("PELICULAS CON DURACION MENOR A 2 HORAS:");
        servicioCarga.PeliculasMenorDosHoras();


    }
}