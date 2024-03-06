package com.kh.EX01;

public class BankAccountPO {
	//필드
	static int balance = 0; // 예금잔액

	public static void main(String []args) {
		deposit(10000);
		checkMyBalance();
		withdraw(3000);
		checkMyBalance();
	}	
	public static int deposit(int amount) { // 입금
		balance += amount;
		return balance;
	}
	
	public static int withdraw(int amount) { // 출금
		balance -= amount;
		return balance;
	}
	public static void checkMyBalance() { // 예금 조회
		//withdraw(balance);
		System.out.println("잔액 : " + balance);
		//return balance;
	}

}
