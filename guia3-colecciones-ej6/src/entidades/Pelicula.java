/*6- Un cine necesita implementar un sistema en el que se puedan cargar películas. Para esto, tendremos una clase
Película con el titulo, director y duración de la película (en horas). Implemente las clases y métodos necesarios para
esta situación, teniendo en cuenta lo que se pide a continuación:
• En el main deberemos tener un bucle que crea un objeto Película pidiéndole al usuario todos sus datos y
guardándolos en el objeto Película.
• Después, esa Película se guarda una lista de Películas y se le pregunta al usuario si quiere crear otra Película o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar las películas mayores a 2 horas.
• Mostrar las películas menores a 2 horas.*/


package entidades;

public class Pelicula {

    private String titulo;
    private String director;
    private int DuracionHora;

    public Pelicula(){

    }

    public Pelicula(String titulo, String director, int duracionHora) {
        this.titulo = titulo;
        this.director = director;
        DuracionHora = duracionHora;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracionHora() {
        return DuracionHora;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracionHora(int duracionHora) {
        DuracionHora = duracionHora;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", DuracionHora=" + DuracionHora +
                '}';
    }
}
