package com.ktdsuniversity.edu.oop.exam.classmakingexam;

public class Seller {
	int price;
	int stock;
	int sales;
	
 /**
 * 셀러 클래스입니다
 */
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

 public void printInfo() {

  System.out.println("===== 판매자 =====");

  System.out.println("상품 단가 : " + price + "원");

  System.out.println("재고 : " + stock + "개");

  System.out.println("매출 : " + sales + "원");

  }

	
}
