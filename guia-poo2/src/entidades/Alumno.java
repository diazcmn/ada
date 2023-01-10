package entidades;

public class Alumno extends Persona{

   protected int anioAcademico;

   public Alumno(){

   }

    public Alumno(int anioAcademico) {
        this.anioAcademico = anioAcademico;
    }

    public Alumno(String nombre, String apellido, int edad, int anioAcademico) {
        super(nombre, apellido, edad);
        this.anioAcademico = anioAcademico;
    }

    @Override
    public void Accion() {
        System.out.println("Soy estudiante");

    }

    @Override
    public void MosrtarDatos() {
        System.out.println("Mi nombre es " + nombre + apellido + "y tengo " + edad + "años y mi año academico es" + anioAcademico);
    }
}
