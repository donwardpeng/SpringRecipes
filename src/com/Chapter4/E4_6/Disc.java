package com.Chapter4.E4_6;

public class Disc extends Product {
	private int capacity;
	public Disc() {
	super();
	}
	public Disc(String name, double price) {
	super(name, price);
	}
	// Getters and Setters
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	}

