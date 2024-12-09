package com.xworkz.repository;

import com.xworkz.userentity.PersonDTO;

public interface PersonRepo {
	boolean save(PersonDTO entity);
}
