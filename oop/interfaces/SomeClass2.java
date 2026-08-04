package com.ktdsuniversity.edu.oop.interfaces;

public class SomeClass2 implements SomeInterface {

	@Override
	public void doSomething1() {
		System.out.println("또 뭔갈 가져옵니다.1");
		
	}

	@Override
	public void doSomething2() {
		System.out.println("또 뭔갈 가져옵니다.2");
		
	}

	@Override
	public void doSomething3() {
		System.out.println("그만 가져오세요.");
		
	}

	@Override
	public int getSomething() {
		
		return Integer.MIN_VALUE;
	}

	@Override
	public String getString() {

		return "문자를 반환합니다.";
	}

}
