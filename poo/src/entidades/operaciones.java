//Crar una clase rectangulo que contenga atributos privados de base y altura
//la clase incluira un metodo para crear el rectangulo con los datos del rectangulo
//dados por el usuario.  tambien incluira un metodo para calcular el area
//del rectangulo. se deberan definir los metodos getter y setter y
//constructores correspondientes. area = base * altura.

package entidades;

public class operaciones {

    public int a=2;
    public int b=2;


    public int Sumar(){
        int sum;
        sum= a + b;
        System.out.println("El resultado es " + sum);
        return sum;
    }


    public int Restar(){
        int res;
        res= a - b;
        System.out.println("El resultado es " + res);
        return res;
    }


    public int Multiplicar(){
        int mul;
        mul= a * b;
        System.out.println("El resultado es " + mul);
        return mul;
    }
}
