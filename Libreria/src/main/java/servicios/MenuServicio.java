package servicios;


import java.util.Scanner;

//config del menu
public class MenuServicio {

    Scanner entrada = new Scanner(System.in);

    //instancia autor para poder usar los metodos
    AutorServicio autorServicio = new AutorServicio();

    //menu
    public void Menu() throws Exception{
        try{
            System.out.println("\n" + "-------Menu---------\n"
            + "1) Registrar un autor \n"
            + "2) Buscar autor por Id \n"
            + "3) Salir \n");
            System.out.println("Seleccione una opcion");
            String rta = entrada.next();

            OpcionSeleccionar(rta); //llamada a metodo
        }catch (Exception e){
            throw new Exception("Debe contener una opcion valida");

        }
    }

    //metodo seleccionar
    public void OpcionSeleccionar(String rta) throws Exception{
        try {
            switch (rta){

                case "1":
                    autorServicio.CrearAutor();
                    Menu();
                break;

                case "2":
                    autorServicio.MostrarAutorPorId();
                    Menu();
                    break;

                case "3":
                    System.out.println("Consulta finalizada");

                /*default:
                    System.out.println("Ingrese una opcion valida");
                    Menu();*/

            }

        }catch (Exception e){
            throw new Exception();
        }
    }

}
