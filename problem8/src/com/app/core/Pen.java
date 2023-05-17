package com.app.core;

import java.time.LocalDate;

public class Pen {

	private static int idGenerator;
	private int id;
	private String brand;
	private String color;
	private InkColor inkColor;
	private String Material;
	private int stock;
	private LocalDate stockListingDate;
	private LocalDate stockUpdateDate;
	private double price;
	private double discounts;
	
	
	
	static {
		idGenerator = 1;
	}
	
	public Pen( String brand, String color, InkColor inkColor, String material, int stock,
			LocalDate stockListingDate, LocalDate stockUpdateDate, double price, double discounts) {
		super();
		this.id = idGenerator++;
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		Material = material;
		this.stock = stock;
		this.stockListingDate = stockListingDate;
		this.stockUpdateDate = stockUpdateDate;
		this.price = price;
		this.discounts = discounts;
	}

      public Pen(int id) {
    	  this.id = id;
      }

	


	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}


	public LocalDate getStockListingDate() {
		return stockListingDate;
	}


	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public double getDiscounts() {
		return discounts;
	}

	public void setDiscounts(double discounts) {
		this.discounts = discounts;
	}

	@Override
	public String toString() {
		return "Pen id=" + id   +" brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", Material=" + Material
				+ ", stock=" + stock + ", stockListingDate=" + stockListingDate + ", stockUpdateDate=" + stockUpdateDate
				+ ", price=" + price + ", discounts=" + discounts + "]\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return this.id == ((Pen)obj).id;
	}
	
	
}
