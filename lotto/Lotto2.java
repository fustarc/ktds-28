package com.ktdsuniversity.edu.oop.exam.lotto;

import java.util.Random;

public class Lotto2 {
	
	public static void main(String[] args) {
		int[] lottoNumbers = new int[6];
		Random random = new Random();
		int count = 0;
		
		while (count < 6){
			int number = random.nextInt(45) + 1;
			boolean isDuplicate = false;
			
			for (int i = 0; i < count; i++) {
				if(lottoNumbers[i] == number) {
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate) {
				lottoNumbers[count] = number;
				count++;
			}
		}
		
		System.out.print("로또 번호: [ ");
		for(int i = 0; i < lottoNumbers.length; i++) {
			System.out.print(lottoNumbers[i]);
			
			if (i < lottoNumbers.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.print(" ]");
	}
}
