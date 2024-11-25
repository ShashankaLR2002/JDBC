package com.xworkz.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.bikedto.BikeDTO;
import com.xworkz.cardto.CarDTO;

public class BikeCarRunner {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {

			et.begin();

			BikeDTO bike = new BikeDTO();
			bike.setId(1);
			bike.setBrand("RoyalEnfield");
			em.merge(bike);

			bike.setId(2);
			bike.setBrand("Suzuki");
			em.merge(bike);

			bike.setId(2);
			bike.setBrand("Honda");
			em.merge(bike);

			CarDTO car = new CarDTO();
			car.setId(1);
			car.setBrand("Tata");
			em.merge(car);

			car.setId(2);
			car.setBrand("Suzuki");
			em.merge(car);

			car.setId(2);
			car.setBrand("Benz");
			em.merge(car);

			et.commit();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			em.close();
			emf.close();
		}
	}
}
