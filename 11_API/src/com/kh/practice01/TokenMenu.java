package com.kh.practice01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenMenu {
	Scanner sc = new Scanner(System.in);
	TokenController tc =new TokenController();
	
	public void mainMenu() {
		int num=0;
		
		
		while(num != 3) {
		System.out.println("1. 지정 문자열\n2. 입력 문자열\n3. 프로그램 끝내기");
		System.out.print("메뉴 번호 : ");
		num = sc.nextInt();
			switch(num) {
			case 1:
				tokenMenu();
				break;
			case 2:
				inputMenu();
				break;
			
			case 3:
				System.out.println("프로그램을 종료합니다.");
				return;
			
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
				break;
			}
		}
	}
	
	public void tokenMenu() {
		String str ="J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : " +str);
		System.out.println("토큰 처리 전 개수 : " +str.length());
		
		String aft_str = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : "+aft_str);
		System.out.println("토큰 처리 후 개수 : "+ aft_str.length());
		
		System.out.println("모두 대문자로 변환 : " +aft_str.toUpperCase()+"\n");
		
	}
	
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		
		str = tc.firstCap(str);
		System.out.println("첫 글자 대문자 : " +str );
		
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		
		
		System.out.println(ch + "문자가 들어간 개수 : " +tc.findChar(str, ch)+"\n");
	}
}
