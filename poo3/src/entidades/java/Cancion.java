//Desarrollas una clase cancion con los suguientes
//atributos: titulo y autor
//se debera definir ademas dos constructores:
//uno vacio que inicializa el titlo y el autor
//y otro que reciba la como parametros el titulo y el autor de la cancion
//se deberan ademas definir los metodos getters
//y setter correspondientes


package entidades.java;

public class Cancion {

    public String titulo;
    public String autor;

    public String Cancion(String titulo){
        this.titulo = titulo;

    }

    public String Cancion(String autor){
        this.a = autor;

    }

    public String getAutor() {
        return autor;
    }
}
