package com.xworkz.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.entity.CustomerEntity;

public class DataReader1 {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		try {
			eTrans.begin();

			Query query2 = eManager.createNamedQuery("findByCustomerEmail");
			query2.setParameter("email", "shamanth12@gmail.com");
			String firstname = (String) query2.getSingleResult();
			System.out.println("Customer Name with email 'shamanth12@gmail.com': " + firstname);

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
