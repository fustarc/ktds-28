package com.ktdsuniversity.edu.oop.exam.classmakingexam;

public class Buyer {
	int cash;
	int itemBasket;
	
	
	
	public Buyer(int cash, int itemBasket) {
		this.cash = cash;
		this.itemBasket = itemBasket;
				
	}
	
	public void buy(Seller seller, int requestCount) {
  // 실제 구매 가능한 수량을 계산한다
		int purchaseCount = requestCount;
  
		if (purchaseCount > seller.getStock()) {
			purchaseCount = seller.getStock();
		}
		
  // 재고가 없는 경우
  if (purchaseCount <= 0) {
   System.out.println("구매실패: 판매 재고 부족");
   return;
  }

  // 구매 금액 계산
   int totalPrice = purchaseCount * seller.getPrice();

  // 현금 보유량이 부족할 경우
   if (cash < totalPrice) {
    System.out.println("구매실패: 보유 현금 부족");
    return;
   }

  // 구매 성공시
   seller.processSales(purchaseCount);
   cash -= totalPrice;
   itemBasket += purchaseCount;

   System.out.println("구매성공: " + purchaseCount + "개 구매");

   }

   public void printInfo(){
     System.out.println("=====구매자=====");
     System.out.println("보유 금액: " + cash + "원");
     System.out.println("장바구니: " + itemBasket + "개");



	  }
}
