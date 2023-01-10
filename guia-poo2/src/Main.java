import entidades.Alumno;
import entidades.Profesor;

public class Main {
    public static void main(String[] args) {

        Alumno cecilia = new Alumno("cecilia", "diaz", 32, 2);
        cecilia.Accion();
        cecilia.MosrtarDatos();


        Profesor maru = new Profesor("maru", "schuindt",29,"programacion" );
        maru.Accion();
        maru.MosrtarDatos();
    }

}
