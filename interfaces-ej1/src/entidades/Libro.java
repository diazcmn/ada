/*EJERCICIO INTERFACE

Crearemos una interface en donde colocaremos como nombre Libro
-Dentro de ella creamos los siguientes metodos: titulo, cantPaginas, autor.
* Recuerden que los metodos dentro de una interface no tienen cuerpo: public void Titulo(); *

Luego creamos un clase que se denominara ImpLibro
-Dentro  de ella implementaremos la interface Libro,
-Recuperaremos los metodos y trabajaremos con ellos como venimos haciendo, sobreescribiendolos

En el main, instanciamos y creamos un objeto de la clase ImpLibro,
y con el objeto llamaremos los metodos que implementamos de la interface.*/

package entidades;

public interface Libro {

    public String titulo();
    public int CantPaginas();
    public String autor();

}
