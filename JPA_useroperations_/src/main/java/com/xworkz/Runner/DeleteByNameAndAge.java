package com.xworkz.Runner;

import javax.persistence.*;
import com.xworkz.userentity.PersonDTO;

public class DeleteByNameAndAge {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		try {
			eTrans.begin();

			Query query = eManager.createNamedQuery("deleteByNameAndAge");
			query.setParameter("name", "Suresh");
			query.setParameter("age", 50);

			int rowsDeleted = query.executeUpdate();
			System.out.println("Rows deleted: " + rowsDeleted);

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
