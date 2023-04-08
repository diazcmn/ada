package Servicio;

import Entidad.Persona;
import Persistencia.PersonDao;

import java.util.List;

//traer logica dao
public class PersonaServicio {

    private final PersonDao personDao;

    public PersonaServicio(){
        personDao = new PersonDao();
    }

    //metodo para imprimir
    public void PrintPeople() throws Exception{
        try {

            List<Persona> personas personDao.getPeople();
            if (personas.isEmpty()) {
                throw new Exception("no existe persona")
                
            }else{
                System.out.println("lista de personas");
                System.out.println("");
            }
        }catch (Exception e){
            throw e;

        }

    }
}
