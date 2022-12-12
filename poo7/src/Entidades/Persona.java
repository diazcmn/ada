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

    private String nombre; // atributos
    private int edad;
    private double altura;
    private double peso;


    public Persona(){
    //constructor vacio con el nombre de la clase
        // para inicializar el objeto cuando hacemos una instancia  con 0 o nulo
        // es el primero
        //en este caso no devuelve nada
    }

    public Persona(){
        //luego constructor con parametros fuera del vacio
        //clic derecho, generar y agregar constructor de los atributos
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    //despues setter y getter. clic der, generar.
    //en caso de necesitarlos setter para setear valores
    //getter para recuperar esos valores

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


//ahora los metodos importantes
    //en este caso crear una persona
    //no se devuelve nada (void) pero se pide por pantalla
    public void crearPersona(){
        Scanner scan = new Scanner(System.in).useDelimiter;
        System.out.println("ingrese nombre");
        nombre.scan.nextLine();
        System.out.println("ingrese edad");
        edad.scan.nextInt();
        System.out.println("ingrese sexo");
        //valido
        do {
            sexo = scan.next().charAt(0);
            if(!(sexo =='m' or sexo == 'f' or sexo == 'o')){
                System.out.println("ingrese caracter valido");
            }

            }while (!(sexo == 'm' or sexo == 'f' or sexo == 'o')){
            System.out.println("ingrese altura");
            altura.scan.nextInt();
            System.out.println("ingrese peso");
            peso.scan.nextInt();

        }
        //calculo masa
        public String calcularImc(){
            duoble calcularImc = peso / (Math.pow(altura, 2));
            if (calcularImc < 20 ){
                return "bajo peso";
            }else if (calcularImc <= 20 && calcularImc <= 25){
                return "peso ideal";
            }else  {
                return "sobrepeso";
            }
        //devuelve booleano
        public boolean mayorEdad(){
                if(edad >= 18){
                    return true;
                }else{
                    return false;
                }
            }

}

    public void mayorEdad() {
    }