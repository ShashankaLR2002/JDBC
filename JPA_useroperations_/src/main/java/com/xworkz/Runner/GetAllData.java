package com.xworkz.Runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.userentity.PersonDTO;

public class GetAllData {

	public static List<PersonDTO> getAllPersons() {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager eManager = emFactory.createEntityManager();

		List<PersonDTO> persons = eManager.createQuery("SELECT p FROM PersonDTO p", PersonDTO.class).getResultList();
		eManager.close();
		return persons;
	}

	public static void main(String[] args) {
		List<PersonDTO> persons = getAllPersons();
		for (PersonDTO ref : persons) {
			System.out.println(ref);
		}
	}
}
