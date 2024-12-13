package com.xworkz.admindetailsrepository;

import com.xworkz.admindetailsentity.AdmindetailsEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;

@Repository
public class AdmindetailsRepositoryImpl implements AdmindetailsRepository {
    @Override
        public boolean save(AdmindetailsEntity enity) {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");

            EntityManager em = emf.createEntityManager();
            EntityTransaction et = em.getTransaction();
            try {
                et.begin();
                em.persist(enity);
                et.commit();
            } catch (Exception e) {
                if (et.isActive()) {
                    et.rollback();
                }
            } finally {
                em.close();
                emf.close();
            }

            return true;
        }
}
