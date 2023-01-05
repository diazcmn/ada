package entidades;

public abstract class  Animales {
    //clase padre
    //abstract = no podemos instanciar, ni crear objetos desde esta clase padre
    // lo vamos atener que hacer desde la clase hija


    //atributos
    protected String nombre;
    protected int edad;


    //constructor vacio
    public Animales(){
    //constructor vacio
    }

    //constructor con parametros
    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodo abstracto aca en clase padre, no lleva llave (firma, englobar, sin especificar)
    //se implementa y sa sentido en sus herencias
    public abstract void TipoAnimal();

}
