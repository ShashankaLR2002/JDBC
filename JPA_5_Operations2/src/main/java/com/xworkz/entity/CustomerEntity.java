 package com.xworkz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
@NamedQuery(name = "findByCustomerId", query = "SELECT c.firstName FROM CustomerEntity c WHERE c.customerId = :customerId")
@NamedQuery(name = "findByCustomerEmail", query = "SELECT c.firstName FROM CustomerEntity c WHERE c.email = :email")
@NamedQuery(name = "findByPhoneNumber", query = "SELECT c.firstName FROM CustomerEntity c WHERE c.phoneNumber = :phoneNumber")
@NamedQuery(name = "findByfirstname", query = "SELECT c.address FROM CustomerEntity c WHERE c.firstName = :firstname")

public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String address;

	public CustomerEntity() {
	}

	public CustomerEntity(int customerId, String firstName, String lastName, String email, String phoneNumber,
			String address) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", customerId=" + customerId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
