package com.xworkz.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF = null;
        EntityManager entityManager = null;

        try {
            eMF = Persistence.createEntityManagerFactory("TestPersistence");
            if (eMF != null) {
                System.out.println("Connected to the database");
            } else {
                System.err.println("Failed to connect to the database");
                return;
            }

            entityManager = eMF.createEntityManager();
            EntityTransaction entityTransaction = entityManager.getTransaction();

            Cardto cd = new Cardto();
            cd.setId(3); 
            cd.setBrand("Benz"); 

            entityTransaction.begin();
            entityManager.persist(cd); 
            entityTransaction.commit(); 

            System.out.println("Values are stored successfully");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            if (eMF != null) {
                eMF.close();
            }
        }
    }
}
