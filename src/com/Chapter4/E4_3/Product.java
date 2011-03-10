package com.Chapter4.E4_3;

public abstract class Product {
	private String name; 
	private double price; 
	public Product() {} 
	public Product(String name, double price) { 
		this.name=name; 
		this.price = price; 
		} 
	
	//GettersandSetters ... 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() { 
		return name+" "+price; 
		}
}
