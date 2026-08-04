package com.ktdsuniversity.edu.oop.exam.string;

public class Exam {

	public static void main(String[] args) {
		
		// address 에 서울이 포함되어 있는지 확인		
		String address = "서울특별시 서초구 효령로 176";
		boolean isSeoul = address.contains("서울특별시");
		System.out.println(isSeoul);
		
		// address 가 176으로 끝나는지 확인		
		boolean isEndOfAddress = address.endsWith("176");
		System.out.println(isEndOfAddress);
		
		// name 이 ktdsUniversity 와 일치하는지 확인		
		String nameClass = "ktdsUniversity";
		boolean isSameName = nameClass.equals("ktdsUniversity");
		System.out.println(isSameName);
		
		// 대소문자 관계없이 name 이 ktdsUniversity 와 일치하는지 확인		
		boolean isSameNameB = nameClass.equalsIgnoreCase("ktdsuniversity");
		System.out.println(isSameNameB);
		
		// 문자 c 의 인덱스 찾기		
		String alphabet = "asdzdcdas";
		int letterCIndex = alphabet.indexOf('c');
		System.out.println(letterCIndex);
		
		// 문자 C 의 인덱스 찾기
		int letterCbIndex = alphabet.indexOf('C');
		System.out.println(letterCbIndex);
		
		// 문자열 cda 의 인덱스 찾기
		int letterCDAIndex = alphabet.indexOf("cda");
		System.out.println(letterCDAIndex);
		
		//str 이 비어있거나 공백으로만 이루어져있는지 확인하기
		String str = "  ";
		//since JAVA 11
		boolean findBlank = str.isBlank();
		System.out.println(findBlank);
		
		//str 이 공백으로 비워져있는지 확인하기
		boolean findEmpty = str.isEmpty();
		System.out.println(findEmpty);
		
		//messageGreet 와 name 을 , 로 연결하기
		String messageGreet = "안녕하세요. ";
		String nameMan = "홍길동님";
		String helloMessage = String.join(", ", nameMan, messageGreet);
		System.out.println(helloMessage);
		
		//message 에서 "a" 의 마지막 인덱스(위치) 찾기
		String messageLine = "asdsdgadh";
		int letterFindIndexA = messageLine.lastIndexOf('a');
		System.out.println(letterFindIndexA);
		
		// 값을 특정 부분에 대입한다
		int biggestNumber = Integer.MAX_VALUE;
		System.out.println(biggestNumber); //2147483647
		
		String numberString = "%,d".formatted(biggestNumber);
		System.out.println(numberString); //2,147,483,647
		
		// format binding (static method)
		String messageFormat = "%s 에서 교육하는 %s과정, %d시간 %일 과정, %f (%.2f) 진행했습니다.";

		
		
	}
	
}
