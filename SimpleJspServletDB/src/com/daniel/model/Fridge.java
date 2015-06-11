package com.daniel.model;

import java.util.ArrayList;

/**
 * File module, class Fridge.java
 * class of fridge
 * Modified by Anna on 2015-06-11.
 */

public class Fridge {
	private ArrayList<Product> products;
	private int userID;

	public void setUserID(int userID) {
	        this.userID = userID;
	    }
	public int getUserID() {
	        return userID;
	    }
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}

}
