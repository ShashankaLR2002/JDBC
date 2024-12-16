<<<<<<< HEAD
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
=======
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
>>>>>>> 22a343a6ad2b0c03fc5478ea544b171112d152e5
