package com.ktdsuniversity.edu.oop.exam.encapsulationexam;

public class Customer {
	private String name;
	private int age;
	private int fullness;
	private int drunkenness;
	private Customer[] companion;
	
	/**
	 * Customer 생성자
	 * @param name 고객명
	 * @param age 고객 연령(음주 가능 연령인지 확인)
	 * @param companion 동반자 배열
	 */
	public Customer(String name, int age, Customer[] companion) {
		this.name = name;
		this.age = age;
		this.fullness = 0;
		this.drunkenness = 0;
		this.companion = companion;
	}
	
	/**
	 * 음식물 섭취
	 * @param dish / dish 로 getter 불러오기 
	 */
	public void eat(Dish dish) {
		//포만감이 100 이상일 경우
		if(this.fullness >= 100) {
			System.out.println("포만감이 100%를 초과하여 더 이상 먹을 수 없습니다.");
			return;
		}
		
		this.fullness += dish.getFullnessIncrease();
		this.drunkenness -= dish.getDrunkennessDecrease();
		//숙취가 음수값이 되지 않게
		if (this.drunkenness < 0 ) {
			this.drunkenness = 0;
		}
		
		System.out.println(dish.getName() + "먹었습니다. 포만감: " + this.fullness + "%, 숙취: " + this.drunkenness + "%");
	
	}
	
	public void drink(Alcohol alcohol) {
		//나이 검사
		if (this.age < 19) {
			boolean isAdultTogether = false;
			
			//동반자 나이 검사
			for (int i = 0; i < companion.length; i++) {
				//companion[] 배열에 있는 보호자의 나이를 getter로 구해오기
				if (companion[i] != null && companion[i].getAge() >= 19) {
					isAdultTogether = true;
					break;
				}
			}
			
			if (!isAdultTogether) {
				System.out.println("미성년자는 보호자 동반 없이 주류를 이용할 수 없습니다.");
				return;
			}
			
			//취기가 60% 이상일 경우
			if(this.drunkenness >=60 ) {
				System.out.println("숙취가 60%를 초과하여 더 이상 술을 드실 수 없습니다.");
				return;
			}
			
			this.drunkenness += alcohol.getDrunkennessIncrease();
			this.fullness -= alcohol.getFullnessDecrease();
			//포만감이 음수값이 되지 않게
			if (this.fullness < 0) {
				this.fullness = 0;
			}
			
			System.out.println(alcohol.getName() + "을 마셨습니다. 숙취: " + this.drunkenness + "%, 포만감: " + this.fullness + "%");
		}
		
		
		}
	
	
	public String getName() {
		return this.name;
	}
	
	
	public int getAge() {
		return this.age;
	}
	
	public int getFullness() {
		return this.fullness;
	}
	
	public int getDrunkenness() {
		return this.drunkenness;
	}
	
}
