package com.ktdsuniversity.edu.oop.exam.encapsulationexam;

public class Restaurant {
	public static void main(String[] args) {
		//음식 및 주류 생성
		
		/** 음식 이름, 포만감, 취기해소 순 */
		Dish meat = new Dish("소고기", 25, 0);
		Dish veggie = new Dish("채소/과일", 13, 5);
		Dish fish = new Dish("생선", 7, 0);
		
		/** 주류 이름, 포만감 해소, 취기증가 순 */
		Alcohol whiskey = new Alcohol("위스키", 7, 40);
		Alcohol soju = new Alcohol("소주", 7, 17);
		Alcohol cognag = new Alcohol("꼬냑", 7, 40); 
		Alcohol beer = new Alcohol("맥주", -8, 6);
		
		// 동반자 없이 방문한 손님
		Customer alone = new Customer("혼밥", 16, new Customer[0]);
		Customer adult = new Customer("어른", 23, new Customer[0]);
		Customer drinker = new Customer("애주가", 25, new Customer[0]);
		
		// 보호자 동반으로 온 그룹 생성
		Customer[] familyGroup = new Customer[] { adult };
		
		// 보호자와 함께 방문한 미성년자 손님
		Customer minorWithAdult = new Customer("가족", 15, familyGroup);
		
		System.out.println("레스토랑 영업 시작");
		
		// 미성년자 혼자 음주
        System.out.println("혼자 온 미성년자 음주");
        alone.drink(beer);

        // 보호자 동반으로 음주
        System.out.println("보호자 동반 미성년자 음주");
        minorWithAdult.drink(beer);

        // 식사
        System.out.println("식사");
        adult.eat(meat); 
        adult.eat(meat); 
        adult.eat(meat); 
        adult.eat(meat); 
        adult.eat(meat); 
        adult.eat(meat); 

        // 음주
        System.out.println("음주");
        drinker.drink(whiskey); // 취기 40% / 포만감 -7%
        drinker.drink(whiskey); // 취기 80% / 포만감 -7%
        drinker.drink(soju);    // 취기 60% 초과 상태라 거절됨

        // 채소 먹어서 취기 감소시키기 (80% - 5% = 75%)
        drinker.eat(veggie);
		
	}
}
