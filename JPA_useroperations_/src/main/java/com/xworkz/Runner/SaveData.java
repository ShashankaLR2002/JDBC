package com.xworkz.Runner;

import com.xworkz.userentity.PersonDTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class SaveData {

	public static void main(String[] args) {

		List<PersonDTO> persons = new ArrayList<>();

		persons.add(new PersonDTO("Shamanth", "shamanth12@gmail.com", "9449706524", 15, true));
		persons.add(new PersonDTO("Shashank", "shashank34@gmail.com", "9889987654", 8, true));
		persons.add(new PersonDTO("Vinay", "vinay.m90@gmail.com", "9345678901", 2, true));
		persons.add(new PersonDTO("Nagaraj", "nagaraj.d52@gmail.com", "9321289231", 25, true));
		persons.add(new PersonDTO("Ajay", "ajay.kumar12@gmail.com", "9974567812", 9, false));
		persons.add(new PersonDTO("Ravi", "ravi1234@gmail.com", "9554443322", 4, true));
		persons.add(new PersonDTO("Anil", "anil.singh23@gmail.com", "9966332244", 5, false));
		persons.add(new PersonDTO("Prakash", "prakash.m92@gmail.com", "9736598087", 30, true));
		persons.add(new PersonDTO("Deepak", "deepak.joy56@gmail.com", "9089898999", 27, true));
		persons.add(new PersonDTO("Suresh", "suresh.d53@gmail.com", "9000000000", 50, false));

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		try {
			eTrans.begin();

			for (PersonDTO person : persons) {
				eManager.persist(person);
			}

			eTrans.commit();
			System.out.println("Persons added successfully");
		} catch (Exception e) {
			eTrans.rollback();
			e.printStackTrace();
		} finally {
			eManager.close();
			emFactory.close();
		}
	}
}
