package com.xworkz.service;

import com.xworkz.repository.PersonRepo;
import com.xworkz.repository.PersonRepoImpl;
import com.xworkz.userentity.PersonDTO;

public class PersonServiceImpl implements PersonService {
	@Override
	public boolean save(PersonDTO entity) {
		System.out.println("entity==" + entity.toString());

		PersonRepo personRepo = new PersonRepoImpl();
		personRepo.save(entity);
		return false;
	}

	@Override
	public boolean update() {

		return false;
	}

}
