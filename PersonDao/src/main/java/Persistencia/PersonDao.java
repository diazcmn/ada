package Persistencia;

import Entidad.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonDao extends  Dao{

    //metodo listar personas dentro de la base de datos
    public List<Persona> getPeople() throws Exception{
        try{

            String sql = "select * from registro";
            queryDatabase(sql);

            List<Persona> personas = new ArrayList<>();
            Persona person;

            //recorrer listade registros
            while (resultSet.next()){
                person = new Persona();
                person.setPeronaId(resultSet.getInt(1));
                person.setNombre(resultSet.getString(2));
                person.setEmail(resultSet.getString(3));
                person.setEmail(resultSet.getString(4));
                personas.add(person);
                return personas;

            }

        }catch (Exception e){

            System.out.println(e.getMessage());
            throw new Exception("error al obtener personas")
        }finally {
            disconectdatabase();
        }
    }

}
