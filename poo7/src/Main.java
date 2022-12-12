import Entidades.Persona;

public class Main {
    public static void main(String[] args) {
        //instancio clase persona lo cual importa el paquete entidades y la clase persona
        Persona persona1 = new Persona();
        //persona1 es un nuevo objeto de la clase persona
        //luego se invoca para calcular imc

        persona1.crearPersona();
        persona1.calcularImc();
        persona1.mayorEdad();

        System.out.println(persona1.calcularImc());
        System.out.println("la persona es mayor edad(True = si /Talse = no)" + persona1.mayorEdad());


    }
    }