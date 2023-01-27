package entidades;

public class VehiculoDeportivo extends Vehiculo{

    protected int rpm;

    public VehiculoDeportivo(){

    }

    public VehiculoDeportivo(int rpm) {
        this.rpm = rpm;
    }

    public VehiculoDeportivo(String marca, int modelo, String color, int rpm) {
        super(marca, modelo, color);
        this.rpm = rpm;
    }

    @Override
    public void Vehiculo() {
        System.out.println("Vehiculo deportivo");

    }

    @Override
    public void FichaTecnica() {
        if(rpm==0 || rpm <=50){
            super.FichaTecnica();
            System.out.println("rpm" +rpm);
            System.out.println("lindo auto pero solo sirve para pasear");

        }else if(rpm==51 || rpm <=380){
            super.FichaTecnica();
            System.out.println("rpm" + rpm );
            System.out.println("este auto sirve para todo");
        }else if(rpm==318 || rpm<=680){
            super.FichaTecnica();
            System.out.println("rpm" +rpm);
            System.out.println("?");

        } else if (rpm <= 601) {
            super.FichaTecnica();
            System.out.println("rpm" +rpm);
            System.out.println("parte de rapido y furioso");
        }
    }
}
