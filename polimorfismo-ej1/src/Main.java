import entidades.Alumno;
import entidades.Persona;
import entidades.Profesor;

public class Main {
    public static void main(String[] args) {
        Persona alumno = new Alumno("cecilia", "diaz", 32, 2023);
        alumno.Accion();
        Persona maru = new Profesor("maru", "shiundt", 29, "programacion");
        maru.Accion();


    }
}  