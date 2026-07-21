package com.ktdsuniversity.edu.oop.exam.classmakingexam;

public class Buyer {
	int cash;
	int itemBasket;
	
	
	
	public Buyer(int cash, int itemBasket) {
		this.cash = cash;
		this.itemBasket = itemBasket;
				
	}
	
	public void buy(Seller seller, int requestCount) {
		int actualCount = requestCount;
		if (actualCount > seller.getStock()) {
			actualCount = seller.getStock();
		}
		
	}
}
