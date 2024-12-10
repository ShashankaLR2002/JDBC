package com.xworkz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "personsdata1")
@NamedQueries({
		@NamedQuery(name = "PersonEntity.getPhoneById", query = "SELECT p.phone FROM PersonEntity p WHERE p.id = :id"),
		@NamedQuery(name = "PersonEntity.getNameById", query = "SELECT p.name FROM PersonEntity p WHERE p.id = :id"),
		@NamedQuery(name = "PersonEntity.getDateTimeByPhone", query = "SELECT p.createdAt FROM PersonEntity p WHERE p.phone = :phone"),
		@NamedQuery(name = "PersonEntity.getGenderByName", query = "SELECT p.gender FROM PersonEntity p WHERE p.name = :name") })
public class PersonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String phone;
	private String gender;
	private LocalDateTime createdAt;

	public PersonEntity() {
	}

	public PersonEntity(String name, String phone, String gender) {
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.createdAt = LocalDateTime.now();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "PersonEntity{" + "id=" + id + ", name='" + name + '\'' + ", phone='" + phone + '\'' + ", gender='"
				+ gender + '\'' + ", createdAt=" + createdAt + '}';
	}
}
