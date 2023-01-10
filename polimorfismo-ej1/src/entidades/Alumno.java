package entidades;

public class Alumno extends Persona{
    protected int CicloLectivo;

    public Alumno(){

    }

    public Alumno(int cicloLectivo) {
        CicloLectivo = cicloLectivo;
    }

    public Alumno(String nombre, String apellido, int edad, int cicloLectivo) {
        super(nombre, apellido, edad);
        CicloLectivo = cicloLectivo;
    }

    @Override
    public void Accion() {
        System.out.println("estoy aprendiendo");

    }
}
