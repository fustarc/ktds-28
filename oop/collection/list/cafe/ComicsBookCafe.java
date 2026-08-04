package com.ktdsuniversity.edu.oop.collection.list.cafe;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.comiccafe.ComicsBook;

public class ComicsBookCafe {
	
	
	//private ComicsBook book1;
	private int money;
	
	private List<ComicsBook> books;
	
	
	public ComicsBookCafe() {
		this.books = new ArrayList<>();
		
		//this.book1 = new ComicsBook("슬램덩크 1권", 2500, false);
	}
	
	public void addBook(ComicsBook book) {
		this.books.add(book);
	}
	
	
	public void displayBooks() {
		System.out.println("====만화책 목록====");
		for (int i = 0; i < this.books.size(); i++) {
			
			ComicsBook book = this.books.get(i);
			
			/*
			 * 옛날 방식
			 * 
			if (book == null) {
				continue;
			}
			*/
			
			if ( book != null) {
			String state = "대여 가능";
			if (book.getIsRented()) {
				state = "대여 중";
			}

			System.out.println("만화책 번호: " + i);
			System.out.println("만화책 이름: " + book.getBookTitle());
			System.out.println("만화책 대여 상태: 대여중/ 대여가능)");
			System.out.println("만화책 대여비: " + book.getRentalFee());
		
			}
		}
	}
	
	public void takeRentFee(int fee) {
		this.money += fee;
	}
	
	public List<ComicsBook> getBooks() {
		return this.books;
	}
	
	/*
	// 만화책을 대여
	public void rentBook(ComicsBook book) {
		//책이 이미 대여되어 있을 경우
		if (book.getIsRented()) {
			System.out.println("대여된 책입니다.");
			return;
		}
		
		//책이 대여 가능한 상태일경우
		
		book.rentBook();
		this.money += book.getRentalFee();
		System.out.println(book.getBookTitle() + "대여 성공 및 대여료 " + book.getRentalFee() + "가 결제되었습니다.");
		}
		
	public void returnBook(ComicsBook book) {
		//책이 이미 반납되어 있을 경우
		if (!book.getIsRented()) {
			System.out.println("이미 반납된 책입니다.");
			return;
		}
		
		book.returnBook();
		System.out.println(book.getBookTitle() + "반납 완료되었습니다.");
	}
	
	public void cafeIndex() {
		this.book1.printInfo();
	}
	
	public void cafeMoney() {
		System.out.println("카페 매출: " + this.money + "원");
	}
	*/
}

