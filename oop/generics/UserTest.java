package com.ktdsuniversity.edu.oop.generics;

public class UserTest {
	
	public static void main(String[] args) {
		User<Integer, String> user01 = new User<>(1, "가나다");
		int id = user01.getId();
		String name = user01.getName();
		
		User<Integer, Long> user02 = new User<>(2, 34L);
		int id2 = user02.getId();
		long name2 = user02.getName();
		
		System.out.println(id + " 와 " + name + " 입니다. ");
		System.out.println(id2 + " 와 " + name2 + " 입니다. ");
		
		
	}
	
	
}
