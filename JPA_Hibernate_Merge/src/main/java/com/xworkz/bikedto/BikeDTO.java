package com.xworkz.bikedto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bike_table")
public class BikeDTO {
	@Id
	private int id;
	private String brand;

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
