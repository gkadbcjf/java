package com.kh.Polymorphism;

public class Run {
	
	public static void main(String[] ars) {
		/*
		 * 
		 *  	클래스 참조변수	=	new 클래스 생성자;
		 *  (부모클래스가 올 수 있다)	/	(자식클래스라면 위치할 수 있다)
		 *  실제로 어디까지 접근이 가능한가/	(실제로 어떤 형태로 메모리가 생성이 되는가)
		 */
		
		
		Cake c1 =new CheeseCake();
		CheeseCake c2 = new StrawberryCheeseCake();
		StrawberryCheeseCake c3 =new StrawberryCheeseCake();
		c1.yummy();
		System.out.println();
		c2.yummy();
		System.out.println();
		

				
		//업캐스팅 : 자식클래스의 객체가 부모 클래스의 타입으로 형변환일어남
		//다운캐스팅 : 업캐스팅 반대, 업캐스팅 된것을 다시 되돌리는 것
		//부모클래스의 객체가 자식 클래스의 타입으로 형변환일어나는 것
		
		//다른 타입의 객체들을 부모 타입으로 형변환 시켜(업캐스팅) 하나의 묶음으로 사용
		Cake []cake = new Cake[5];
		 
		
		
	}
	
}
