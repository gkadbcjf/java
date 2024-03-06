package com.kh.EX01;

public class Run {

	public static void main(String[] args) {
		/*
		//객체는 특정할 수 있어야 함
		//두 개의 인스턴스 객체 생성
		BankAccount lee = new BankAccount();  //myAcnt1라는 BankAccount의 참조변수 생성
		BankAccount choi = new BankAccount();
		
		//각각의 인스턴스를 대상으로 예금을 진행
		lee.deposit(5000);
		choi.deposit(3000);
		
		//각각의 인스턴스를 대상으로 출금 진행
		lee.withdraw(2000); 
		choi.withdraw(2000);
		
		//각각의 인스턴스 객체의 전액을 조회
		lee.checkMyBalance();  //3000
		choi.checkMyBalance(); //1000
		
		System.out.println(lee.balanceEquals(choi));
		
		
		
		
		int num =1;
		BankAccount t= new BankAccount();
		t.test(num); // 주소 값이 아닌 1이라는 값을 준다.
		
		System.out.println(num);
		System.out.println();
		
		String st ="hi";
		BankAccount t1= new BankAccount();
		
		t1.test(st); 
		System.out.println("main : "+ st.hashCode());
		System.out.println(st);
		*/
		
		
		BankAccount choi = new BankAccount("12-456-78", "123456-789456", 10000);
		BankAccount park = new BankAccount("12-446-78", "122256-789456");

	}

}
