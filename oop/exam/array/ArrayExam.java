package com.ktdsuniversity.edu.oop.exam.array;

import java.util.Arrays;

public class ArrayExam {
	
	public static void printArraysValue(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + "번째 인덱스의 값 : " + numbers[i]);
		}
	}

	public static void main(String[] args) {
		//배열을 정의하고 생성하는 3가지 방법
		//1. 자료형[] 배열이름 = new 자료형[배열길이];
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 10;
		nums[2] = 10;
		// => 가장 고전적인 방법
		
		//2. 자료형[] 배열이름 = new 자료형[] {각 인덱스에 들어갈 값을};
		//.......................0...1...2...3...4...5...6...7
		int[] nums2 = new int[] {50, 30, 60, 10, 20, 55, 7, 88};
		Arrays.sort(nums2);
		for (int i = 0; i < nums2.length; i++) {
			System.out.println(nums2[i]);
		}
		
		//System.out.println(nums2.length); // 8
		//길이를 제한시키지 않음
		
		//3. 자료형[] 배열이름 = { 각 인덱스에 들어갈 값들 };
		//.............0...1...2...3...4...5...6...7...8..9
		int[] nums3 = {100,200,300,400,500,600,700,800,10,20,};
		//System.out.println(nums3.length);
		//간편해보이지만 쓸 수 없는 케이스들도 있음 / 사용 방법이 제한적
		
		
		//OK
		//printArraysValue(new int[3]);
		
		//OK
		//printArraysValue(new int[] {1,2,3,4,5,6,7,8});
	
		//X
		//printArraysValue({1,2,3,4,5,6,7,8});
		//지역변수에만 사용할 수 있고, 임시변수(파라미터)에는 사용할 수 없음
	}
}
