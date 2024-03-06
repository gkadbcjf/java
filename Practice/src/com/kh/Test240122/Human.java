package com.kh.Test240122;

public class Human {
	String name;
	int money;
	static int count =0;
	
	public Human(String name, int moneyt) {
		this.name= name;
		this.money = money;
		this.count++;
	}
	
	//buy라는 메소드 작성
	// TV객체를 넘겨받아 구매가 가능하다면 구매가 가능합니다.
	//money가 부족하다면 예산초과입니다.
	
	public void buy(TV tv) {
		if(this.money < tv.getPrice()) {
			
			System.out.println("예산초과입니다.");
		}
		else {
			tv.setPrice(tv.getPrice()-this.money);
			System.out.println("구매가 가능합니다.");
		}
	}

}
