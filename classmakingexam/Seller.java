package com.ktdsuniversity.edu.oop.exam.classmakingexam;

public class Seller {
	int price;
	int stock;
	int sales;
	
	public Seller(int price, int stock, int sales) {
		this.price = price;
		this.stock = stock;
		this.sales = sales;
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getStock() {
		return stock;
	}
	
	public int getSales() {
		return sales;
	}
	
	public void processSales(int count) {
		this.stock -= count;
		this.sales += (count * this.price);
	}
	
}
