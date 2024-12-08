package com.xworkz.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.mysql.cj.Query;
import com.xworkz.userentity.PersonDTO;

import java.util.List;

public class FindByName {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		try {
			eTrans.begin();

			javax.persistence.Query query = eManager.createNamedQuery("findByName");
			query.setParameter("name", "Shamanth");

			PersonDTO person = (PersonDTO) query.getSingleResult();

			System.out.println("Person Details: " + person);

			eTrans.commit();

		} catch (NoResultException e) {
			System.out.println("No person found with the name: Shamanth");

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
