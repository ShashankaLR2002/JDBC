package com.xworkz.service;

import com.xworkz.entity.PersonEntity;
import java.time.LocalDateTime;

public interface PersonService {
	boolean save(PersonEntity entity);

	String getPhById(int id);

	String getNameById(int id);

	LocalDateTime getDateAndTimeByPhno(String phone);

	String getGenderByName(String name);
}
