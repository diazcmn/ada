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

import java.util.Scanner;

public class cuenta {

    int numCuenta ;
    int dni;
    int saldoAct;

    public cuenta(){

    }
    public int Dni() {
        return dni;
    }

    public int NumCuenta() {
        return dni;
    }

    public int saldo() {
        return dni;
    }

    public int interes() {
        return dni;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getSaldoAct() {
        return saldoAct;
    }

    public void setSaldoAct(int saldoAct) {
        this.saldoAct = saldoAct;
    }

    public int crearCuenta(){
        Scanner crearCuenta = new Scanner(System.in);
        System.out.println("Ingrese numer");
        crearCuenta.next();


    }
}
