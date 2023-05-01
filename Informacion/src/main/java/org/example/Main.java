package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("p");


        //instancia entitymanager desde entitymanagerfactory
       EntityManager entityManager = emf.createEntityManager();

        //inicia transaccion
        entityManager.getTransaction().begin();

        //instancia mas propiedades
        Persona persona = new Persona();
        persona.setNombre("ceci");
        persona.setAp("diaz");
        persona.setCorreo("cecilia@gmail.com");

        //persistir persona en base de datos
        entityManager.persist(persona);

        //confirmar
        entityManager.getTransaction().commit();

        //cerrar
        entityManager.close();



    }
}