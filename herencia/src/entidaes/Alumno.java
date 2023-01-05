package entidaes;

public class Alumno extends Persona{

    public Alumno() {
    }
    //estos construcotes estan en la clase padre asique tienen que estar aca tambien
    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    //se llama al metodo, se implementa heredandolo
    public void Accion(){
        System.out.println("Estoy aprendiendo");
    }

    //super para mostrar los datos desde la clase padre
    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
    }

}
