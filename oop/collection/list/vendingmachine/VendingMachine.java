package com.ktdsuniversity.edu.oop.collection.list.vendingmachine;

import com.ktdsuniversity.edu.oop.vendingmachine.Item;

/**
 * 자판기
 * 음료가 들어있는 자판기에 돈을 넣고 음료의 번호를 입력하면
 * 음료가 추출된다.
 * 거스름돈이 남았을 경우 사용자에게 돌려준다.
 */
public class VendingMachine {

	ItemHolder holder;

	public VendingMachine(ItemHolder holder) {
		this.holder = holder;
	}
	
	// 자판기에 새로운 라면을 추가한다.
	public void addNewItem() {
		this.holder.items.add(new Item("ITEM-1", "진라면 매운맛", 4800, 5));
		this.holder.items.add(new Item("ITEM-2", "불닭 매운면", 4300, 3));
		this.holder.items.add(new Item("ITEM-3", "진라면 순한맛", 4800, 7));
		this.holder.items.add(new Item("ITEM-4", "진라면 약간매운맛", 4800, 2));
		this.holder.items.add(new Item("ITEM-5", "진라면 매운맛", 4800, 2));
	
	
	}
	
	public static void main(String[] args) {

		/*
		ItemHolder 라면홀더 = new ItemHolder();
		VendingMachine 한강라면 = new VendingMachine(라면홀더);
		한강라면.addNewItem(new Item("ITEM-4", "진라면 약간매운맛", 4800, 2));
		
		VendingMachine 한강라면2호 = new VendingMachine(라면홀더);
		this.holder.items.add(4, new Item("ITEM-4", "진라면 약간매운맛", 4800, 2));
		*/
		
	}
	
}