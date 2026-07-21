package com.ktdsuniversity.edu.oop.exam.classmakingexam;

public class Market {

    public static void main(String[] args) {

        // 판매자 생성
        Seller seller = new Seller(3000, 4, 0);

        // 구매자 생성
        Buyer buyer = new Buyer(10000, 0);

        // 초기 상태 출력
        System.out.println("=== 초기 상태 ===");
        seller.printInfo();
        buyer.printInfo();

        System.out.println();

        // 2개 구매 
        buyer.buy(seller, 2);

        seller.printInfo();
        buyer.printInfo();

        System.out.println();

        // 현 재고보다 많은 5개 구매 요청, 2개만 판매
        buyer.buy(seller, 5);

        seller.printInfo();
        buyer.printInfo();

        System.out.println();

        // 재고가 모두 소진된 상태에서 구매 시도
        buyer.buy(seller, 1);

        seller.printInfo();
        buyer.printInfo();

        System.out.println();

        // 돈이 부족할경우
        Buyer poorBuyer = new Buyer(4000, 0);

        poorBuyer.buy(seller, 2);

        seller.prin