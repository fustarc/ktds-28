package com.ktdsuniversity.edu.oop.enums.food;

public class Dishes {

	public static void main(String[] args) {
		Food bigMac = new Food("빅맥", 900, FoodType.FASTFOOD);
		System.out.println(bigMac);
		
		Food apple = new Food("사과", 500, FoodType.FRUIT);
		System.out.println(apple);
		
		Food stake = new Food("스테이크", 1500, FoodType.MEET);
		System.out.println(stake);
			
		
	}
}
