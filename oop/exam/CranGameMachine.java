package com.ktdsuniversity.edu.oop.exam;

public class CranGameMachine {
	boolean isInsertCoin;
	int dolls;
	
	public void insertCoin() {
//		if (dolls > 0) {
//			isInsertCoin = true;
//		}
		isInsertCoin = dolls > 0;
	}
	
	public int doGame() {
		if (isInsertCoin) {
			int coin = (int) (Math.random() * 2);
			dolls -= coin;
			isInsertCoin = false;
			
			return coin;
		}
		return 0;
	}
	public static void main(String[] args) {
		CranGameMachine machine = new CranGameMachine();
		machine.isInsertCoin = false;
		machine.dolls = 10;
		
		while (machine.dolls > 0) {
			machine.insertCoin();
			int dolls = machine.doGame();
			System.out.println("결과 : " + dolls);
			System.out.println("남은 인형 : " + machine.dolls);
		}
		
	}
	
	
}


