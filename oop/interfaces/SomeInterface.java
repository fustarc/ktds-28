package com.ktdsuniversity.edu.oop.interfaces;

public interface SomeInterface {

	/*
	public static final 인터페이스에 한해 상수 선언 시 해당 부분 생략 가능*/ int PRICE = 300;
	
	
	void doSomething1(); //추상 메소드: 메소드의 정의만 존재하고 바디( {  } )가 없는 형태 
	void doSomething2();
	void doSomething3();
	int getSomething();
	String getString();
	
}
