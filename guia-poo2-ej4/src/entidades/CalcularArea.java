package entidades;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class CalcularArea extends FiguraGeometrica{

    public CalcularArea(){

    }

    public CalcularArea(String figura, int area, int base, int altura, double PI, int radio) {
        super(figura, area, base, altura, PI, radio);
    }


    public void Eleccion() {
        Scanner input = new Scanner(System.in);
        System.out.println("Tipo de figura 1- Triangulo 2-Rectangulo 3-Circulo");
        int figura = input.nextInt();

        switch (figura){
            case 1:
                System.out.println("Ingrese valor de base");
                base = input.nextInt();
                System.out.println("Ingrese altura");
                altura = input.nextInt();
                System.out.println("Triangulo = base * altura / 2" + area);
                area = (base * altura)/2;
                break;

            case 2:
                System.out.println("Ingrese valor de base");
                base = input.nextInt();
                System.out.println("Ingrese altura");
                altura = input.nextInt();
                System.out.println("Rectangulo = base * altura " + area);
                area = (base * altura);
                break;

            case 3:
                System.out.println("Ingrese radio");
                radio = input.nextInt();
                System.out.println("Circulo = " + area);
                area = (int) (Math.pow(radio, 2* PI));
                //el (int) es parsear
                break;


        }
    }

    @Override
    public void area() {
        System.out.println("Resultado " + area);
    }
}
