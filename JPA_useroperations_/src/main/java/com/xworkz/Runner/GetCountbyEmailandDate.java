package com.xworkz.Runner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.cj.Query;
import com.xworkz.userentity.PersonDTO;

public class GetCountbyEmailandDate {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager eManager = emFactory.createEntityManager();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime createdAt = LocalDateTime.parse("2024-12-09 11:22:51", formatter);

		javax.persistence.Query query = eManager.createNamedQuery("GetCountbyEmailandDate");
		query.setParameter("email", "shamanth12@gmail.com");
		query.setParameter("createdAt", createdAt);

		List<PersonDTO> persons = query.getResultList();

		for (PersonDTO person : persons) {
			System.out.println(person);
		}

		eManager.close();
		emFactory.close();
	}
}
