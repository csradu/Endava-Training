package com.endava.services;

public class Product {
	
	/**
	 * Represents the price of the product
	 */
	private double price;

	public Product(double price) {
		this.price = price;
	}
	
	/**
	 * 
	 * @return Returns the value of the product
	 */
	public double getPrice() {
		return price;
	}
}
