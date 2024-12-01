package com.xworkz.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.dto.PersonDTO;

public class PersonRunner {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		try {
			eTrans.begin();
			eManager.persist(new PersonDTO("Shashanklr", "lrshashank2002@gmail.com", 14, "9449869637"));
			eManager.persist(new PersonDTO("Nagaraj", "nagaraj5@gmail.com", 13, "9856749823"));
			eManager.persist(new PersonDTO("Shamanth", "shamanthhr52@gmail.com", 17, "9449706524"));
			eManager.persist(new PersonDTO("Arun", "arun2@gmail.com", 12, "9875164789"));
			eManager.persist(new PersonDTO("Charan", "charan6@gmail.com", 18, "9875468125"));
			eTrans.commit();
			System.out.println("------------------------");

			eTrans.begin();
			int updatedCount = eManager
					.createQuery("UPDATE PersonDTO p SET p.name = :newName, p.email = :newEmail WHERE p.phone = :phone")
					.setParameter("newName", "Siddarth").setParameter("newEmail", "Siddarth34@gmail.com")
					.setParameter("phone", "9449706524").executeUpdate();
			eTrans.commit();
			System.out.println("------------------------");

			if (updatedCount > 0) {
				System.out.println("Update successful");
			} else {
				System.err.println("No records updated.");
			}

			List<PersonDTO> allPersons = eManager.createQuery("SELECT p FROM PersonDTO p", PersonDTO.class)
					.getResultList();
			System.out.println("\nAll Records:");
			allPersons.forEach(person -> System.out.println(person.getId() + ": " + person.getName() + ", "
					+ person.getEmail() + ", Age: " + person.getAge() + ", Phone: " + person.getPhone()));
			System.out.println("------------------------");

			List<Object[]> nameAndEmail = eManager
					.createQuery("SELECT p.name, p.email FROM PersonDTO p WHERE p.age > 15").getResultList();
			System.out.println("\nNames and Emails where age > 15:");
			nameAndEmail.forEach(record -> System.out.println("Name: " + record[0] + ", Email: " + record[1]));

			System.out.println("------------------------");

			List<String> emails = eManager
					.createQuery("SELECT DISTINCT p.email FROM PersonDTO p WHERE p.name LIKE 'S%' OR p.name LIKE 'N%'")
					.getResultList();
			System.out.println("\nEmails where name starts with 'S' or 'N':");
			emails.forEach(email -> System.out.println(email));
			System.out.println("------------------------");

		} catch (Exception e) {
			if (eTrans.isActive()) {
				eTrans.rollback();
			}
			e.printStackTrace();
		} finally {
			eManager.close();
			emFactory.close();
		}
	}
}
