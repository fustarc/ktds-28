package com.ktdsuniversity.edu.oop.exam.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto1 {
	public static void main(String[] args) {
		List<Integer> lottoNumbers = new ArrayList<>();
		Random random = new Random();
		
		while (lottoNumbers.size() < 6) {
			int number = random.nextInt(45) + 1;
			
			if(!lottoNumbers.contains(number)) {
				lottoNumbers.add(number);
			}
		}
		
		System.out.println("로또 번호: " + lottoNumbers);	
	}
}
