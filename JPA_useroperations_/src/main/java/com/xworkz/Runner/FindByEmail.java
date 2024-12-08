package com.xworkz.Runner;

import javax.persistence.*;
import com.xworkz.userentity.PersonDTO;

public class FindByEmail {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		try {
			eTrans.begin();

			Query query = eManager.createNamedQuery("findByEmail");
			query.setParameter("email", "vinay.m90@gmail.com");

			PersonDTO person = (PersonDTO) query.getSingleResult();

			System.out.println("Person Details: " + person);

			eTrans.commit();

		} catch (NoResultException e) {
			System.out.println("No person found with the email: vinay.m90@gmail.com");
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
