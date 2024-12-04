package com.xworkz.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.entity.CustomerEntity;

public class DataInsert {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		List<CustomerEntity> customers = new ArrayList<>();
		customers.add(new CustomerEntity(101, "Shamanth", "RT", "shamanth12@gmail.com", "9449706524", "Marathahalli"));
		customers.add(new CustomerEntity(102, "Shashank", "LR", "shashank34@gmail.com", "9889987654", "Bangalore"));
		customers.add(new CustomerEntity(103, "Vinay", "OI", "vinay.m90@gmail.com", "9345678901", "Koramangala"));
		customers.add(new CustomerEntity(104, "Nagaraj", "XS", "nagaraj.d52@gmail.com", "9321289231", "Jayanagar"));
		customers.add(new CustomerEntity(105, "Ajay", "DF", "ajay.kumar12@gmail.com", "9974567812", "Indiranagar"));
		customers.add(new CustomerEntity(106, "Ravi", "KR", "ravi1234@gmail.com", "9554443322", "MG Road"));
		customers.add(new CustomerEntity(107, "Anil", "PW", "anil.singh23@gmail.com", "9966332244", "Whitefield"));
		customers.add(new CustomerEntity(108, "Prakash", "CZ", "prakash.m92@gmail.com", "9736598087", "Bellandur"));
		customers.add(new CustomerEntity(109, "Deepak", "MT", "deepak.joy56@gmail.com", "9089898999", "Ulsoor"));
		customers.add(
				new CustomerEntity(110, "Kiran", "BL", "kiran.kumar99@gmail.com", "9512365478", "Electronic City"));

		try {
			eTrans.begin();
			for (CustomerEntity customer : customers) {
				eManager.persist(customer);
			}
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
