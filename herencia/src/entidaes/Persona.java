package entidaes;

public abstract class Persona {
//la clase padre abstracta no se puede instanciar
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona(){

    }

    public Persona(String nombre, String apellido, int edad) {
        //atributos
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public abstract void Accion(); //metodo abstracto, la clase tambien debe serlo

    public void MostrarDatos(){
        System.out.println("Mi onmbre es " + nombre);
    }


}
