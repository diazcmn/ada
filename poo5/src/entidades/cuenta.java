/*5. Realizar una clase llamada Cuenta (bancaria) que debe
tener como mínimo los atributos: numeroCuenta (entero),
el DNI del cliente (entero largo), el saldo actual.
Los métodos a realizar son:
• Constructor por defecto(vacío) y constructor con DNI,
saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Método para crear un objeto Cuenta, pidiéndole los
datos al usuario.
• Método ingresar(double ingreso): el método recibe una
cantidad de dinero a ingresar y se la sumara a saldo
actual.

• Método retirar(double retiro): el método recibe
una cantidad de dinero a retirar y se la restará al
saldo actual. Si la cuenta no tiene la cantidad de
dinero a retirar, se pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo
un 20% de su saldo. Validar que el usuario no saque
más del 20%.
• Método consultarSaldo(): permitirá consultar el
saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos
los datos de la cuenta.*/
import java.util.Scanner;

package entidades;

public class cuenta {

    private int NumCuenta ;
    private int dni;
    private double SaldoAct;
    private double interes;


    public cuenta(){

    }
    public cuenta(int NumCuenta, int dni, double SaldoAct, double interes) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldoAct = saldoAct;
        this.interes = interes;
    }
    public int getNumCuenta() {
        return numCuenta;
    }

    public double ingresarDinero( double ca){

        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite la cantidad a ingresar");

       double cantidad = teclado.nextDouble();

       SaldoAct += cantidad;
        System.out.println( "Su saldo bancario es " + SaldoAct);
        return cantidad;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSaldoAct() {
        return saldoAct;
    }

    public void setSaldoAct(double saldoAct) {
        this.saldoAct = saldoAct;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }





}

