package com.Chapter4.E4_7;

public class Battery extends Product {
	private boolean rechargeable;
	public Battery() {
	super();
	}
	public Battery(String name, double price) {
	super(name, price);
	}
	// Getters and Setters
	public boolean isRechargeable() {
		return rechargeable;
	}
	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}
	
	
}
