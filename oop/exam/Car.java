package com.ktdsuniversity.edu.oop.exam;

public class Car {

	
	// 멤버변수
	// 클래스의 인스턴스가 "독립적으로" 가지고 있는 정보들
	boolean isEngineStart;
	int speed;
	public int zero100Sec;
	
	//생성자 추가
	public Car(int zero100Sec) {
		this.zero100Sec = zero100Sec;		
		System.out.println("생성자를 호출했습니다.");
		System.out.println(this);		
		this.pressEngineStartButton();
		
				
	}	
	
	
	// 인스턴스 메소드 (이하 메소드) 정의
	// 엔진 켜기 / 끄기
	public void pressEngineStartButton() {
		// 이 메소드를 호출하는 인스턴스의 isEngineStart가 false 라면 true => true 라면 false 로
		// 논리연산자 not 사용 경우 isEngineStart = !isEngineStart;
		
		if (isEngineStart) {
			//시동이 켜져있다면 끈다
			isEngineStart = false;
			speed = 0;
		}
		else {
			//시동이 꺼져있다면 켠다
			isEngineStart = true;
			speed = 10;
		}
	}
	
	// 가속페달을 밟는다
	// 페달을 밟는 압력 만큼 속도가 증가한다
	public void pressGasPedal(int pressure) {
		if (isEngineStart) {
			speed += pressure;
		}
	}
	
	// 브레이크 페달을 밟는다
	// 페달을 밟는 압력 만큼 감속한다
	public void pressBrakePedal(int pressure) {
		if (isEngineStart) {
			speed -= pressure;
		}
	}
	
	@Override
	public String toString() {
		// 출력의 형태를 정의. 
		return this.zero100Sec + "";
	}
	
	
	public static void main(String[] args) {
		
		// Car 클래스를 이용해 다음을 생성
		// Car 타입의 kona 인스턴스를 생성
		Car kona = new Car(8);

		// Car 타입의 carnival 인스턴스를 생성
		Car carnival = new Car(12);
		
		System.out.println(kona); // 8
		System.out.println(carnival); // 12
		String name = "asdfasdga";
		System.out.println(name); // asdfasdga
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("asdfasdga");
		System.out.println(buffer); // asdfasdga
		
		//kona의 시동을 켠다
		kona.pressEngineStartButton();
		
		//브레이크 페달을 약하게 몇차례 밟는다
		kona.pressBrakePedal(3);
		kona.pressBrakePedal(3);
		
		//가속 페달을 3회 강하게 밟는다
		kona.pressGasPedal(150);
		kona.pressGasPedal(150);
		kona.pressGasPedal(150);
		
		//브레이크 페달을 아주 강하게 밟는다
		kona.pressBrakePedal(300);
		
		//kona의 시동을 끈다
		kona.pressEngineStartButton();
		
		
		// 인스턴스는 자신의 멤버변수의 값을 할당하거나 출력할 수 있다.
//		kona.isEngineStart = true;
//		kona.speed = 100;
//		carnival.isEngineStart = false;
//		carnival.speed = 70;
		
		// 시동을 걸지 않고 가속페달을 밟는다
		carnival.pressGasPedal(150);
		
		// 시동을 걸지 않고 브레이크 페달을 밟는다
		carnival.pressBrakePedal(200);
		
		// carnival의 시동을 건다
		carnival.pressEngineStartButton();
		
		// carnival의 가속 페달을 밟는다
		carnival.pressGasPedal(40);
		
		// carnival의 브레이크 페달을 밟는다
		carnival.pressBrakePedal(50);
		
		// carnival의 시동을 종료한다
		carnival.pressEngineStartButton();
		
		
		System.out.println(kona.isEngineStart);
		System.out.println(kona.speed);
		
		System.out.println(carnival.isEngineStart);
		System.out.println(carnival.speed);
		
	}
}
