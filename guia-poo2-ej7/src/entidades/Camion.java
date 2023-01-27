package entidades;

public class Camion extends Vehiculo{

    protected int CargaMaxima;

    public Camion(){

    }

    public Camion(int cargaMaxima) {
        CargaMaxima = cargaMaxima;
    }

    public Camion(String marca, int modelo, String color, int cargaMaxima) {
        super(marca, modelo, color);
        CargaMaxima = cargaMaxima;
    }

    @Override
    public void Vehiculo() {
        System.out.println("Camion");
    }

    @Override
    public void FichaTecnica() {
        if(CargaMaxima <= 100){
            super.FichaTecnica();
            System.out.println("carga maxima" +CargaMaxima);
            System.out.println("utilitario");

        }else if(CargaMaxima >= 101){
            super.FichaTecnica();
            System.out.println("carga maxima" +CargaMaxima);
            System.out.println("usese en el campo");

        }
    }
}
