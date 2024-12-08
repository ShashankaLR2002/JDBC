package com.xworkz.Runner;

import javax.persistence.*;
import com.xworkz.userentity.PersonDTO;

public class FindByPhone {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		try {
			eTrans.begin();

			Query query = eManager.createNamedQuery("findByPhone");
			query.setParameter("phone", "9089898999");

			PersonDTO person = (PersonDTO) query.getSingleResult();

			System.out.println("Person Details: " + person);

			eTrans.commit();

		} catch (NoResultException e) {
			System.out.println("No person found with the phone number: 9089898999");
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
