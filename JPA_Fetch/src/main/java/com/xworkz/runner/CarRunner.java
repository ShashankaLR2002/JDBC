package com.xworkz.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.dto.CarDTO;

public class CarRunner {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			List<CarDTO> cars = new ArrayList<>();
			cars.add(new CarDTO("Porsche", 1500000.00));
			cars.add(new CarDTO("Maruti", 2000000.00));
			cars.add(new CarDTO("BMW", 5500000.00));
			cars.add(new CarDTO("Jimmy", 5000000.00));
			cars.add(new CarDTO("Mini Cooper", 1000000.00));

			for (CarDTO car : cars) {
				CarDTO crdt = new CarDTO();
				crdt.setBrand(car.getBrand());
				crdt.setPrice(car.getPrice());

				em.persist(crdt);
			}

			et.commit();
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
	}
}
