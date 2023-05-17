package com.app.pet;

import java.util.Objects;

// Pet ( petId, name, category, unitPrice, stocks)
public class Pet {

	private int petId;
	private String name;
	private CategoryEnum category;
	private int unitPrice;
	private int stocks;
	
	
	public Pet(int petId, String name, CategoryEnum category, int unitPrice, int stocks) {
		this.petId = petId;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
	}

	public Pet(String name) {
		this.name = name;
	}


	@Override
	public boolean equals(Object obj) {
	
		return this.getName().toLowerCase().equals(((Pet)obj).getName().toLowerCase());
	}

	public int getPetId() {
		return petId;
	}


	public void setPetId(int petId) {
		this.petId = petId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public CategoryEnum getCategory() {
		return category;
	}


	public void setCategory(CategoryEnum category) {
		this.category = category;
	}


	public int getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}


	public int getStocks() {
		return stocks;
	}


	public void setStocks(int stocks) {
		this.stocks = stocks;
	}


	@Override
	public String toString() {
		return "Pet petId=" + petId + ", name=" + name + ", category=" + category + ", unitPrice=" + unitPrice
				+ ", stocks=" + stocks;
	}
	
	
	
}
