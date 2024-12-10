package com.xworkz.repository;

import com.xworkz.entity.PersonEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDateTime;

public class PersonRepoImpl implements PersonRepo {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");

	@Override
	public String getPhById(int id) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			return em.createNamedQuery("PersonEntity.getPhoneById", String.class).setParameter("id", id)
					.getSingleResult();
		} finally {
			em.close();
		}
	}

	@Override
	public String getNameById(int id) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			return em.createNamedQuery("PersonEntity.getNameById", String.class).setParameter("id", id)
					.getSingleResult();
		} finally {
			em.close();
		}
	}

	@Override
	public LocalDateTime getDateAndTimeByPhno(String phone) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			return em.createNamedQuery("PersonEntity.getDateTimeByPhone", LocalDateTime.class)
					.setParameter("phone", phone).getSingleResult();
		} finally {
			em.close();
		}
	}

	@Override
	public String getGenderByName(String name) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			return em.createNamedQuery("PersonEntity.getGenderByName", String.class).setParameter("name", name)
					.getSingleResult();
		} finally {
			em.close();
		}
	}

	@Override
	public boolean save(PersonEntity entity) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
			return false;
		} finally {
			em.close();
		}
	}
}
