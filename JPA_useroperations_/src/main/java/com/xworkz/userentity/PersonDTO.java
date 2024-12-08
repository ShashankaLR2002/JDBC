package com.xworkz.userentity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "personsdata")
@Data
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(name = "findByName", query = "SELECT p FROM PersonDTO p WHERE p.name = :name")
@NamedQuery(name = "findByEmail", query = "SELECT p FROM PersonDTO p WHERE p.email = :email")
@NamedQuery(name = "findByPhone", query = "SELECT p FROM PersonDTO p WHERE p.phone = :phone")
@NamedQuery(name = "findByAgeGreaterThan", query = "SELECT p FROM PersonDTO p WHERE p.age > :age")
@NamedQuery(name = "findByAliveStatus", query = "SELECT p FROM PersonDTO p WHERE p.alive = :alive")
@NamedQuery(name = "findByCreationDate", query = "SELECT p FROM PersonDTO p WHERE p.createdAt >= :date")
@NamedQuery(name = "findAllPersons", query = "SELECT p FROM PersonDTO p")
@NamedQuery(name = "updateByEmailAndPhone", query = "UPDATE PersonDTO p SET p.name = :newName WHERE p.email = :email AND p.phone = :phone")
@NamedQuery(name = "getAllDetailsById", query = "SELECT p FROM PersonDTO p WHERE p.id = :id")
@NamedQuery(name = "updateByPhoneAndAlive", query = "UPDATE PersonDTO p SET p.name = :newName WHERE p.phone = :phone AND p.alive = :alive")
@NamedQuery(name = "updateAliveByPhone", query = "UPDATE PersonDTO p SET p.alive = :alive WHERE p.phone = :phone")
@NamedQuery(name = "deleteByNameAndAge", query = "DELETE FROM PersonDTO p WHERE p.name = :name AND p.age = :age")

public class PersonDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String phone;
	private int age;
	private boolean alive;
	private LocalDateTime createdAt;

	public PersonDTO(String name, String email, String phone, int age, boolean alive) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.alive = alive;
		this.createdAt = LocalDateTime.now();
	}
}
