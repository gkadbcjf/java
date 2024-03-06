package com.kh.Polymorphism;

public class Cake {
	public void yummy() {	
		System.out.println("Yummy Cake");
	}
}

class CheeseCake  extends Cake{
	public void yummy() {
		super.yummy();
		System.out.println("yummy CheeseCake");
	} //Cake의 yummy를 오버라이딩
}

class StrawberryCheeseCake extends CheeseCake{
	public void yummy() {
		super.yummy();
		System.out.println("yummy StrawberryCheeseCake");
	} //그리고 CheeseCake의 yummy를 오버라이딩
}
