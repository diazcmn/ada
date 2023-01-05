import entidaes.Alumno;
import entidaes.Persona;
import entidaes.Profesor;

public class Main {
    public static void main(String[] args) {

        //el objeto se crea desde nuestra clase alumno
        //que es la clase hija
        //como dije en persona, no se puede instanciar (crear el objeto)

        Alumno alumno = new Alumno("Cecilia", "Diaz", 32);

        alumno.MostrarDatos();
        alumno.Accion();

        Profesor profe = new Profesor("Maru", "Schuindt", 29);
        profe.MostrarDatos();
        profe.Accion();


    }
}