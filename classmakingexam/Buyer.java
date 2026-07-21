package com.ktdsuniversity.edu.oop.exam.classmakingexam;

public class Buyer {
	int cash;
	int itemBasket;
	
	
	
	public Buyer(int cash, int itemBasket) {
		this.cash = cash;
		this.itemBasket = itemBasket;
				
	}
	
	public void buy(Seller seller, int requestCount) {
		int purchaseCount = requestCount;
		if (purchaseCount > seller.getStock()) {
			purchaseCount = seller.getStock();
		}
		
  if (purchaseCount <= 0) {
   System.out.println("구매실패: 판매 재고 부족");
   return;
  }


   int totalPrice = purchaseCount * seller.getPrice();

   if (money < totalPrice) {
    System.out.println("구매실패: 보유 현금 부족");
    return;
   }

   seller.processSales(purchaseCount);
   money -= totalPrice;
   basket += purchaseCount;

   System.out.println("구매성공: " + purchaseCount + "개 구매");

   }

   



	}
}
