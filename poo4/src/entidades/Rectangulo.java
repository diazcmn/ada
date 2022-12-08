/*
*4- Crear una clase Rectángulo que contenga atributos
privados de base y altura.
La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario.
También incluirá un método para calcular el área del
rectángulo.
Se deberán además definir los métodos getters, setters y
constructores correspondientes.

Área= base * altura.*/

package entidades;

public class Rectangulo {

    private int base;

    private int altura;

    public int CrearRectangulo(){
        System.out.println("El area del rectangulo es: " + area);
        int area = base * altura;
        return area;

    }
}

/*import java.util.Scanner;
public class Rectangulo {

	private int base;
	private int altura;
	int area;

	public Rectangulo() {

	};




	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public void calcularArea() {
		Scanner entrada = new Scanner(System.in).useDelimiter("\n");

	System.out.println ("Ingrese  la base del rectangulo");
	this.setBase(entrada.nextInt());
	System.out.println("Ingrese la altura del rectangulo");
	this.setAltura(entrada.nextInt());
	}

public void resultadoArea() {
	int area = this.base * this.altura;
		System.out.println("El area del rectangulo es " + area);

   }

}
/*
