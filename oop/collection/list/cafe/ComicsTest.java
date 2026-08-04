package com.ktdsuniversity.edu.oop.collection.list.cafe;

import com.ktdsuniversity.edu.oop.comiccafe.ComicsBook;

public class ComicsTest {

	
	public static void main(String[] args) {
		ComicsBookCafe cafe = new ComicsBookCafe();
		cafe.addBook(new ComicsBook("만화책 1권", 500, false));
		cafe.addBook(new ComicsBook("만화책 2권", 500, false));
		cafe.addBook(new ComicsBook("만화책 3권", 500, false));
		cafe.addBook(new ComicsBook("만화책 4권", 500, false));
		cafe.addBook(new ComicsBook("만화책 5권", 500, false));
		cafe.addBook(new ComicsBook("만화책 6권", 500, false));
		cafe.addBook(new ComicsBook("만화책 7권", 500, false));
		cafe.addBook(new ComicsBook("만화책 8권", 500, false));
		
		
	}
	
}
