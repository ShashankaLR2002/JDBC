package com.xworkz.Runner;

import javax.persistence.*;
import com.xworkz.userentity.PersonDTO;
import java.util.List;

public class Countagegreaterthan5 {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager eManager = emFactory.createEntityManager();

		Query query = eManager.createNamedQuery("findByAgeGreaterThan");
		query.setParameter("age", 15);

		List<PersonDTO> persons = query.getResultList();

		if (persons != null && !persons.isEmpty()) {
			System.out.println("Persons with age greater than " + 15 + ":");
			for (PersonDTO person : persons) {
				System.out.println(person);
			}
		} else {
			System.out.println("No persons found with age greater than " + 15);
		}

		eManager.close();
		emFactory.close();
	}
}
