package com.xworkz.dto;

public class CarDTO {
	private int id;
	private String name;
	private String model;
	private double price;
	public CarDTO(int id, String name, String model, double price) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "CarDTO [id=" + id + ", name=" + name + ", model=" + model + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
