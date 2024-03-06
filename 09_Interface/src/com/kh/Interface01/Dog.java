package com.kh.Interface01;

//에러 3가지 : 컴파일 과정, 런타임 에러, 논리 에러 
public class Dog implements Animal,Baby {

	@Override
	public void move() {
		System.out.println("촐랑촐랑 뜁니다.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("촵촵촵 먹습니다.");
	}

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("왈릉로알왈왈랄ㅇ르랄");
	}

}
