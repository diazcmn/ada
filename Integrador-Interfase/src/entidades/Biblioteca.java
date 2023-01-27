/*EJERCICIO INTEGRADOR INTERFACE
Crear una Interface llamada Biblioteca, en donde crearemos
dos metodos crearAutor, crearLibro.
Crear la clase para implementar dicha Interface, donde
crearemos ahora atributos, nombre y apellido para el
CrearAutor, y titulo y paginas para CrearLibro
Una vez recuperados dichos metodos, implementaremos de
tal forma de que sean dinamicos, (es decir que ocuparemos un
Scanner)
En CrearAutor se preguntara por el nombre y apellido del
autor (ocupar esos atributos), y lo guardaremos con ayuda de
la libreria Scanner
En CrearLibro se preguntara por el titulo y paginas del libro.
Luego crear un metodo MostrarLibro donde mostraremos
todos los datos del libro a crear.
Ya en el main, deberan aplicar dicha logica para que podamos
crear tres objetos("libros" - desde ImpBiblioteca) para la
biblioteca.
Como requisito que todos sean dinamicos y con distintos
datos.*/

package entidades;

public interface Biblioteca {

    public void crearAutor();
    public void crearLibro();

}
