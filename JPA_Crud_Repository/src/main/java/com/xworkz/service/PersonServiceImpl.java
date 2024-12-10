package com.xworkz.service;

import java.time.LocalDateTime;

import com.xworkz.entity.PersonEntity;
import com.xworkz.repository.PersonRepo;
import com.xworkz.repository.PersonRepoImpl;

public class PersonServiceImpl implements PersonService {

	private PersonRepo personRepo = new PersonRepoImpl();

	@Override
	public boolean save(PersonEntity entity) {
		return personRepo.save(entity);
	}

	@Override
	public String getPhById(int id) {
		return personRepo.getPhById(id);
	}

	@Override
	public String getNameById(int id) {
		return personRepo.getNameById(id);
	}

	@Override
	public LocalDateTime getDateAndTimeByPhno(String phone) {
		return personRepo.getDateAndTimeByPhno(phone);
	}

	@Override
	public String getGenderByName(String name) {
		return personRepo.getGenderByName(name);
	}
}
