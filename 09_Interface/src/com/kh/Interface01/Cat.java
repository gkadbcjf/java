package com.kh.Interface01;

public class Cat implements Animal{

	@Override
	public void move() {
		System.out.println("사뿐사뿐 걸어가");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("냠냠 먹습니다.");
	}

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("때껄룩 미야옹");
	}
	
}
