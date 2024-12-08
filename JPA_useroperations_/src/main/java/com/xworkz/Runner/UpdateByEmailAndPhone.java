package com.xworkz.Runner;

import javax.persistence.*;
import com.xworkz.userentity.PersonDTO;

public class UpdateByEmailAndPhone {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		try {
			eTrans.begin();

			Query query = eManager.createNamedQuery("updateByEmailAndPhone");
			query.setParameter("newName", "sharath"); 
			query.setParameter("email", "shashank34@gmail.com"); 
			query.setParameter("phone", "9889987654");

			int rowsUpdated = query.executeUpdate();

			System.out.println("Rows updated: " + rowsUpdated);

			eTrans.commit();
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
