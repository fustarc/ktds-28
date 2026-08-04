package com.ktdsuniversity.edu.oop.comiccafe;

public class ComicsBook {
	
	/** 만화책 이름 */
	private String bookTitle;
	/** 만화책 대여비용 */
	private int rentalFee;
	/** 만화책 대여여부 */
	private boolean isRented;
	
	/**
	 * 만화책의 정보
	 * @param bookTitle 책의 제목
	 * @param rentalFee 책 대여료
	 * @param isRented 책 대여 여부
	 */
	public ComicsBook(String bookTitle, int rentalFee, boolean isRented) {
		this.bookTitle = bookTitle;
		this.rentalFee = rentalFee;
		this.isRented = false;
	}
	
	public String getBookTitle() {
		return this.bookTitle;
	}
	
	public boolean getIsRented() {
		return this.isRented;
	}
	
	public int getRentalFee() {
		return this.rentalFee;
	}
	
	public void rent() {
		this.isRented = true;
	}
	
	public void returnBook() {
		this.isRented = false; 
	}
	
	/*
	public String getBookTitle() {
		return this.bookTitle;
	}
	
	public int getRentalFee() {
		return this.rentalFee;
	}
	
	public boolean getIsRented() {
		return this.isRented;
	}
	
	public void rentBook() {
		this.isRented = true;
	}
	
	
	
	public void printInfo() {
		System.out.println("=======만화대여정보=======");
		System.out.println("만화책: " + bookTitle);
		System.out.println("대여비: " + rentalFee + "원");
		System.out.println("대여여부: " + (isRented ? "대여중" : "대여가능"));
	}
	*/
}
