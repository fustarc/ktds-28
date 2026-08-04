package com.ktdsuniversity.edu.oop.collection.list.cafe;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.comiccafe.ComicsBook;

public class Visitor {

	/*private String name;*/
	
	/**
	 * 고객의 소지금
	 */
	private int cash;
	
	private List<ComicsBook> books;
	
	public Visitor(/*String name,*/int cash) {
		/*this.name = name;*/
		this.books = new ArrayList<>();
		this.cash = cash;
		
	}
	
	public void rent(ComicsBookCafe cafe, int bookId) {
		
		// cafe가 소지하고 있는 0번 인덱스의 만화책이 대여중인가?		
		List<ComicsBook> cafeBooks = cafe.getBooks();
		if (bookId < 0 || bookId >= cafeBooks.size()) {
			System.out.println("존재하지 않는 만화책입니다.");
			return;
		}
		
		
		
		ComicsBook book = cafeBooks.get(bookId);
		// playtoon이 소지중인 "슬램덩크 1권" 이 대여중인가?
		if ( book.getIsRented()) {
			System.out.println("이미 대여중인 만화책입니다.");
		} else {
		// playtoon이 소지중인 "슬램덩크 1권"의 대여비는 얼마인가?	
			int fee = book.getRentalFee();
			if (fee <= this.cash) {
				
			
			
				// 고객이 대여한 책 목록에 추가한다.
				//for (int i = 0; i < this.books.size(); i++) {
					this.books.add(book);
					this.cash -= fee;
					cafe.takeRentFee(fee);
					book.rent();
				}
			else {
				System.out.println("대여비가 모자랍니다.");
			}
			
				
			
		}
					
	}
	
	public void returnBook(int bookId) {
			
			//고객이 반납할 책
			ComicsBook book = this.books.get(bookId);
			
			//책의 대여상태를 false로 변경
			if(book != null) {
				book.returnBook();
			}
			
			
			// 고객이 대여한 책을 목록에서 제거
			this.books.remove(bookId);
		}
	
	
	public void printBooks() {
		System.out.println("고객이 대여한 책 목록");
		
		
		for(int i = 0; i < this.books.size(); i++) {

				System.out.println("만화책 번호: " + i);
				System.out.println("만화책 이름: " + this.books.get(i).getBookTitle());
			
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* public void rentBook(ComicsBookCafe cafe, ComicsBook book) {
		if (cash < book.getRentalFee()) {
			System.out.println("요금이 부족합니다.");
			return;
		}
		
		if (book.getIsRented()) {
			System.out.println("책이 이미 대여중입니다.");
			return;
		}
		
		cash -= book.getRentalFee();
		cafe.rentBook(book);
	}
	
	public void returnBook(ComicsBookCafe cafe, ComicsBook book) {
		
		cafe.returnBook(book);
	}
	
	public void printInfo() {
		System.out.println("고객명: " + name );
		System.out.println("잔액: " + this.cash);
	}*/
}
