import entidades.Camion;
import entidades.VehiculoDeportivo;
import entidades.VehiculoElectrico;

public class Main {
    public static void main(String[] args) {

        VehiculoDeportivo deportivo1 = new VehiculoDeportivo("mercedes",2019 ,"negro", 601 );
        deportivo1.Vehiculo();
        deportivo1.FichaTecnica();

        VehiculoElectrico electrico1 = new VehiculoElectrico("tesla",2021, "blanco",222);
        electrico1.Vehiculo();
        electrico1.FichaTecnica();

        Camion camion1 = new Camion("iveco",2018,"amarillo",103);
        camion1.Vehiculo();
        camion1.FichaTecnica();
    }
}