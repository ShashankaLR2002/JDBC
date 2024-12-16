 package com.xworkz.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.dto.Students;

public class StudensRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();

            Students student1 = new Students("Vani Vidya Kendra", 250);
            Students student2 = new Students("Prabhodhini Vidya Kendra", 650);
            Students student3 = new Students("Greenwood International School", 350);
            Students student4 = new Students("Saraswati High School", 1200);
            Students student5 = new Students("Shree Vidya Mandir", 400);
            Students student6 = new Students("Bal Bharati Public School", 800);
            Students student7 = new Students("Navodaya Vidyalaya", 500);
            Students student8 = new Students("Kendriya Vidyalaya", 1000);
            Students student9 = new Students("St. Xavier's School", 900);
            Students student10 = new Students("DAV Public School", 450);
            em.persist(student1);
            em.persist(student2);
            em.persist(student3);
            em.persist(student4);
            em.persist(student5);
            em.persist(student6);
            em.persist(student7);
            em.persist(student8);
            em.persist(student9);
            em.persist(student10);

            
            et.commit();
            System.out.println("Student persisted successfully!");

        } catch (Exception e) {

            if (et.isActive()) {
                et.rollback();
                
            }
            e.printStackTrace();

        } finally {
            em.close(); 
            emf.close();
        }
    }
}
