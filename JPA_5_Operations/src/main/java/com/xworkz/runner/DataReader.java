package com.xworkz.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.entity.CustomerEntity;

public class DataReader {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		try {
			eTrans.begin();

			Query query = eManager.createNamedQuery("findByCustomerId");
			query.setParameter("customerId", 101);
			CustomerEntity customer = (CustomerEntity) query.getSingleResult();
			System.out.println("Customer with ID 101: " + customer);

			Query query2 = eManager.createNamedQuery("findByCustomerEmail");
			query2.setParameter("email", "shamanth12@gmail.com");
			CustomerEntity customer2 = (CustomerEntity) query2.getSingleResult();
			System.out.println("Customer with email 'shamanth12@gmail.com': " + customer2);

			Query query3 = eManager.createNamedQuery("findByPhoneNumber");
			query3.setParameter("phoneNumber", "9449706524");
			CustomerEntity customer3 = (CustomerEntity) query3.getSingleResult();
			System.out.println("Customer with phone number '9449706524': " + customer3);

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
