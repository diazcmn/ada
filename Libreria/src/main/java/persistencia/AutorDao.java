package persistencia;

import entidades.Autor;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
//parte logica de la conexion, los datos de pasan en servicios donde esta la interaccion con el usuario
public class AutorDao {
    //configuracion de la persistencia, creacion del objeto entitymanagerfactory y entitymanger
    //declarar como provada y final nuestra persistencia

    //concepto de persistir un dato es mandarlo a la base de datos, siempre que lo hagamos tenemos
    //que hacer una transaccion mediante el metodo .begin y cerrando mediante .commit
    //declarado private y final porque solo usamos en esta clase para persistir
    //entitymanager trabajaba en conjuntos para mandar los datos a la base, contiene la persistencia con sus datos y metodos
    //createentitymanager es para el crud
    private final EntityManager em = Persistence.createEntityManagerFactory("p").createEntityManager();
    //pasar en nombre de  la persistencia que esta en la config de persistence.xml


    //crear metodos para enviar los datos a la base, como es un ojeto se le pasa el parametro autor

    public void Insertar(Autor autor) throws Exception{

        try {
            //con el objeto de entitymanager se empieza la transaccion
            em.getTransaction().begin(); //enviar datos
            em.persist(autor); //persiste el dato, el metodo necesita que le pase un objeto, en este caso el metodo autor
            //los atributos del objeto se pasan en la parte de servicio
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback(); //rolback es una advertencia en caso de error
            throw new Exception("Error al cargar autor");
        }

    }

    //no es void porque en este caso si devulve un dato, tampoco es list porque no devulve lista sino un dato, el id

    public Autor ObtebnerPorId(Integer Id) throws Exception{
        try {
            //instancia objeto autor, mediante la persistencia tiene que buscar oir id
            Autor autor = em.find(Autor.class, Id);
            return autor;
        }catch (Exception e){
            throw new Exception("Error al buscar");
        }


    }

}
