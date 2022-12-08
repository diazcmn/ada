/*7-Realizar una clase llamada Persona que tenga los
siguientes atributos: nombre, edad, sexo ('M' hombre, 'F'
mujer, 'O' otro), peso y altura. Los métodos que se
implementarán son:
• Un constructor por defecto y un constructor con todos
los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide
los valores de los atributos al usuario y después se le
asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea
correcto, es decir, M, F o O. Si no es correcto se deberá
mostrar un mensaje.
• Método calcularIMC(): calculara si la persona está en su
peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal
y la función devuelve un mensaje advirtiendo eso.
Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que la persona está en su peso ideal
y la función devuelve un mensaje de felicitaciones.
Finalmente, si el resultado de la fórmula es un valor
mayor que 25 significa que la persona tiene sobrepeso, y
la función devuelve otra advertencia.
• Método esMayorDeEdad(): indica si la persona es mayor
de edad. La función devuelve un booleano.*/

package Entidades;

import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private double altura;
    private double peso;


    public Persona(){
    //constructor vacio parainicializxar vaci0o
    }

    public Persona(){
        //constructor con parametros
        this.
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }



    public void crearPersona(){
        Scanner scan = new Scanner(System.in).useDelimiter(/n);
        System.out.println("ingrese nombre");
        nombre.sacan.nextLine();
        do {
            sexo = scan.next().char(0);
            if(){

            }

        }
    }
}

