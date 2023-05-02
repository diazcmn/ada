package servicios;

import entidades.Autor;
import persistencia.AutorDao;

import java.util.Scanner;

public class AutorServicio {
    //primero llamar a scanner porque es dinamico
    Scanner entrada = new Scanner(System.in);

    //instancia de autordao para poder traer los archivos de autordao a autorservicio
    //metodo insertar (unico por el momento)

    private AutorDao autordao  = new AutorDao(); //nueva instanciad de la clase autordao
              //apodo del objeto

    //metodos (configurados en la clase perisistencia se trabaja en servicio)
    public void CrearAutor() throws Exception{

        Autor autor = new Autor();

        try {
            //parte logica de la creacion de un autor
            System.out.println("Ingrese npmbre autor: ");
            String nombre = entrada.next();
            autor.setNombre_autor(nombre);
            if (nombre == null || nombre.trim().isEmpty()){
                throw new Exception("Debe contener un nombre: ");

            }else{
                System.out.println("Se guerdo exitosamente: ");
            }
            autordao.Insertar(autor);//almacenado y mandado a la base

        }catch (Exception e){
            throw e;

        }
    }


    //mostrar, preguntar al usuario el id para buscar. cada metodo de dao tambien tiene que estar en servicio, trabajan en conjunto

    public void MostrarAutorPorId() throws Exception{
        try {
            System.out.println("Ingrear Id del autor a buscar: ");
            Integer Id= entrada.nextInt();
            Autor autor = autordao.ObtebnerPorId(Id);//se llama al metodo buscar Id de dao
            if (autor == null) {
                throw new Exception("No existe registro");


            }else{
                System.out.println("Resultado");
                System.out.printf("%-15%-40s\n", "ID", "Nombre");
                System.out.printf("%-15%-40s\n", autor.getId(), autor.getNombre_autor());

            }
        }catch (Exception e){
            throw new Exception("No se encontro autor: ");
        }
    }


}
