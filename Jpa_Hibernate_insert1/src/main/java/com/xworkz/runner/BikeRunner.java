package com.xworkz.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.dto.BikeDTO;

public class BikeRunner {
public static void main(String[] args) {
	
	EntityManagerFactory eMF = null;
	EntityManager eM =null;
	
	try {
	
		eMF=Persistence.createEntityManagerFactory("TestPersistence"
				+ "");
		if(eMF!=null) {
		System.out.println("Connected to databse successfully");
		}
		else{
			System.out.println("Connected to databse failed");
			return;
			}
	
		eM=eMF.createEntityManager();
		 EntityTransaction etr = eM.getTransaction();
		 
		 BikeDTO bt =new BikeDTO();
		 bt.setId(5);
		 bt.setBrand("R15");
		 
		 
		 etr.begin();
		 eM.persist(bt);
		 etr.commit();
		
	}catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (eMF != null) {
        	eM.close();
        }
        if (eMF != null) {
            eMF.close();
        }
    }
}
}