package entidades;

public class VehiculoElectrico extends Vehiculo{

    protected int potencia;

    public VehiculoElectrico(){

    }

    public VehiculoElectrico(int potencia) {
        this.potencia = potencia;
    }

    public VehiculoElectrico(String marca, int modelo, String color, int potencia) {
        super(marca, modelo, color);
        this.potencia = potencia;
    }

    @Override
    public void Vehiculo() {
        System.out.println("Vehiculo Electrico");
    }

    @Override
    public void FichaTecnica() {
        if(modelo <= 2007){
            System.out.println("no existe modelo de se año");

        }else {
            super.FichaTecnica();
            System.out.println("potencia" +potencia+ "auto ultima potencia");
        }

    }
}
