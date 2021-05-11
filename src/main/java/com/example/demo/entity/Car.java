package com.example.demo.entity;

public class Car {
	
	private String brand;
	private String type;
	private String color;
	
	
	public Car(String brand, String type, String color) {
		super();
		this.brand = brand;
		this.type = type;
		this.color = color;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public String getType() {
		return type;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", type=" + type + ", color=" + color + "]";
	}
	
	

}
