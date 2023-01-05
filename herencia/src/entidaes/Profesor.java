package entidaes;

public class Profesor extends Persona{

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    //se sobrescribe el metodo abstracto

    @Override
    public void Accion(){
        System.out.println("Estoy enseñando");
    }

    //esta era la clase no abstracta
    public void MostrarDatos(){
        super.MostrarDatos();
    }

}
