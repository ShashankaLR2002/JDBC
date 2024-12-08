package com.xworkz.Runner;

import javax.persistence.*;
import com.xworkz.userentity.PersonDTO;

public class GetAllDetailsById {

    public static void main(String[] args) {

        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager eManager = emFactory.createEntityManager();

        Query query = eManager.createNamedQuery("getAllDetailsById");
        query.setParameter("id", 8);

        PersonDTO person = (PersonDTO) query.getSingleResult();

        System.out.println("Person Details: " + person);

        eManager.close();
        emFactory.close();
    }
}
