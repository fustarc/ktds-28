package com.ktdsuniversity.edu.oop.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.exceptions.Goods;

public class ListExam {

	public static void main(String[] args) {
		
		/*
		
		// 정수를 관리하는 리스트 생성
		// java.util.list
		// java.util.ArrayList
		// Ctrl + Shift + o
		List<Integer> decimalList = new ArrayList<>();
		
		// 리스트에 몇 개의 정수가 있나?
		int size = decimalList.size();
		System.out.println(size + " 개의 정수가 있음");
		
		// 리스트에 정수 하나를 추가
		decimalList.add(1200); // 0 index
		decimalList.add(2400); // 1 index
		
		// 리스트내에 몇개의 정수가 있나?
		size = decimalList.size();
		System.out.println(size + " 개의 정수가 있음");
		
		// 리스트의 0번 인덱스 값을 가져온다
		int value0 = decimalList.get(0);
		System.out.println(value0);
		
		// 리스트의 1번 인덱스 값을 가져온다
		int value1 = decimalList.get(1);
		System.out.println(value1);
		
		// 리스트의 2번 인덱스 값을 가져온다
		if (decimalList.size() > 2) {
			int value2 = decimalList.get(2);
			System.out.println(value2);			
		}
		
		// 리스트의 0번 인덱스를 삭제한다
		// 리스트의 0번 인덱스를 삭제하고, 해당 인덱스에 있던 값을 반환시킨다.
		int removedValue = decimalList.remove(0);
		System.out.println(removedValue + " 삭제됨");
		
		// 삭제한 이후의 리스트 개수를 출력
		size = decimalList.size();
		System.out.println(size + " 개의 정수가 있음");
		
		// 리스트의 1번 인덱스를 가져온다
		value1 = decimalList.get(0);
		System.out.println(value1); // IndexOutOfBoundsException 발생
		
		// 리스트에 10개의 랜덤 값을 추가한다.
		decimalList.add((int)(Math.random() * 1000));
		decimalList.add((int)(Math.random() * 1000));
		decimalList.add((int)(Math.random() * 1000));
		decimalList.add((int)(Math.random() * 1000));
		decimalList.add((int)(Math.random() * 1000));
		decimalList.add((int)(Math.random() * 1000));
		decimalList.add((int)(Math.random() * 1000));
		decimalList.add((int)(Math.random() * 1000));
		decimalList.add((int)(Math.random() * 1000));
		decimalList.add((int)(Math.random() * 1000));
		
		System.out.println( decimalList.size() + " 개의 정수가 있음");
		
		// 리스트에 있는 모든 데이터를 지우기
		decimalList.clear();
		
		System.out.println( decimalList.size() + " 개의 정수가 있음");
		
		// 리스트에 100, 200, 300, 400, 500, 600 숫자를 순서대로 할당한다.
		decimalList.add(100);
		decimalList.add(200);
		decimalList.add(300);
		decimalList.add(400);
		decimalList.add(500);
		decimalList.add(600);
		
		// 리스트에 100 이 존재하는가?
		if (decimalList.contains(100)) {
			System.out.println("100이 존재합니다.");
		}
		// 리스트에 200 이 존재하는가?
		if (decimalList.contains(200)) {
			System.out.println("200이 존재합니다.");
		}
		// 리스트에 305 가 존재하는가?
		if (decimalList.contains(305)) {
			System.out.println("305가 존재합니다.");
		}
		// 리스트에 들어있는 모든 항목을 출력한다.
		System.out.println(decimalList);
		
		for (int i = 0; i < decimalList.size(); i++) {
			System.out.println(i + " 번째 숫자 => " + decimalList.get(i));
		}
		
		*/
		
		
		Goods newGoods = new Goods("상품1", 500);
		Goods otherGoods = new Goods("상품1", 500);		
		System.out.println(newGoods == otherGoods); // false
		
		Goods cloneGoods = otherGoods;
		System.out.println(cloneGoods == newGoods); // false
		System.out.println(cloneGoods == otherGoods); // true
		
		System.out.println("goods equals: " + newGoods.equals(otherGoods)); // true
		
		int n1 = 100;
		int n2 = 100;
		System.out.println(n1 == n2);
		
		
		List<Goods> goodsList = new ArrayList<>();
		
		// goodsList에 Goods 인스턴스를 추가한다.
		goodsList.add(new Goods("상품1",500));
		// goodsList에 Goods 인스턴스를 추가한다.
		goodsList.add(new Goods("상품2",2200));
		// goodsList에 Goods 인스턴스를 추가한다.
		goodsList.add(new Goods("상품3",3200));
		
				
		// goodsList의 0번째 리스트에 있는 Goods 인스턴스를 가져와 출력한다.
		Goods goods1 = goodsList.get(0);
		System.out.println(goods1.getName());
		// goodsList의 1번째 리스트에 있는 Goods 인스턴스를 가져와 출력한다.		
		Goods goods2 = goodsList.get(1);
		System.out.println(goods2.getName());
		// goodsList의 2번째 리스트에 있는 Goods 인스턴스를 가져와 출력한다.		
		Goods goods3 = goodsList.get(2);
		System.out.println(goods3.getName());
		// goodsList의 모든 Goods 인스턴스를 출력한다 ( for 를 이용 )
		for (int i = 0; i < goodsList.size(); i++) {
			Goods goodsname = goodsList.get(i);
			System.out.println(i + " 번 상품: " + goodsname.getName() + " 입니다.");
		}
		
		// goodsList 에서 상품의 이름이 " 상품 1 " 이고 가격이 500인 상품이 존재하는가?
		boolean haveGoods = goodsList.contains(new Goods("상품1",500));
		System.out.println(haveGoods);
		
		// goodsList 에서 상품의 이름이 " 상품 1 " 이고 가격이 500인 상품이 존재하는가?
		boolean haveGoods2 = goodsList.contains(new Goods("상품11",5000));
		System.out.println(haveGoods2);
		
		
	}
	
	
	
}
