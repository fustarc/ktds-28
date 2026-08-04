package com.ktdsuniversity.edu.oop.exceptions;

public class GoodsMain {
	
	public static void main(String[] args) {
		GoodsHolder capsuleHolder = null;
		while (capsuleHolder == null) {
			int randomCount = (int) (Math.random() * 1000) - 300;
			try {
				
			capsuleHolder = new GoodsHolder(randomCount);
			} catch (HolderInitiateException hie) {
				System.out.println(hie.getMessage());
			}
		}
		
		//GoodsHolder capsuleHolder = new GoodsHolder(-1);
		
		capsuleHolder.addGoods("네스프레소 솔티드 캐러멜 커피", "8900"); //0
		capsuleHolder.addGoods(null, "팔천구백원");   //1
		capsuleHolder.addGoods("", "3000000000");       //2
		capsuleHolder.addGoods("    ", "8000");           //3
		capsuleHolder.addGoods("일리 에스프레소", "7900"); 
		
		capsuleHolder.printGoods();
		
		capsuleHolder.printGoodsAt(-1);
		capsuleHolder.printGoodsAt(0);
		capsuleHolder.printGoodsAt(1);
		capsuleHolder.printGoodsAt(2);
		capsuleHolder.printGoodsAt(3);
		capsuleHolder.printGoodsAt(99);
		
		capsuleHolder.removeGoods(0);
		capsuleHolder.removeGoods(1);
		capsuleHolder.removeGoods(2);
		capsuleHolder.removeGoods(3);
		capsuleHolder.removeGoods(-1);
		capsuleHolder.removeGoods(99);
		
		
		
		capsuleHolder.printGoods();
		
	}
}
