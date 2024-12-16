 package com.xworkz.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@Getter
@Entity
@Table(name = "carfetch_table")
public class CarDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String brand;
	private double price;

	public CarDTO(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
}
