package com.xworkz.Runner;

import javax.persistence.*;
import java.util.List;

public class GetNamebytwoCondition {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager eManager = emFactory.createEntityManager();

		try {
			Query query = eManager.createNamedQuery("GetNameAndIdByNameAndAge");

			query.setParameter("name", "Ravi");
			query.setParameter("age", 4);

			List<Object[]> resultList = query.getResultList();
			for (Object[] result : resultList) {
				Integer id = (Integer) result[0];
				String name = (String) result[1];

				System.out.println("ID: " + id + ", Name: " + name);
			}

		} catch (NoResultException e) {
			System.out.println("No matching records found");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			eManager.close();
			emFactory.close();
		}
	}
}
