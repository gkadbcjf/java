package com.a.mystudy;

import java.util.Scanner;

public class LibraryMenu {
	LibraryController lc;
	Scanner sc;

	
	
	public LibraryMenu() {
	
		this.lc = new LibraryController();
		this.sc = new Scanner(System.in);
	}

	public void mainMenu() {
		
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().toLowerCase().charAt(0);

		Member m = new Member(name,age,gender);
		lc.insertMember(m);
		
		
		while (true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지\n2. 도서 전체 조회\n3. 도서 검색 \n4. 도서 대여하기 \n9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println(lc.myInfo().toString());  
				break;
			case 2:
				this.selectAll();
				break;
			case 3:
				this.searchBook();
				break;
			case 4:
				this.rentBook();
				break;
			case 9:
				System.out.println("프로그램 종료합니다.");
				sc.close();
				return;
			default:
				System.out.println("잘못 입력했습니다.");
				break;

			}
		}

	}

	public void selectAll() {
		
		Book[]bList = lc.selectAll();
		for(int i=0; i<bList.length; i++) {
			System.out.println(i+"번 도서: " + bList[i].toString());  
		}
	}

	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keword = sc.next();
		
		Book[] searchList = lc.searchBook(keword);
		for(int i=0; searchList[i] != null; i++) {
			System.out.println(i+"번 도서: " + searchList[i].toString());
		}
	}

	public void rentBook() {
		this.selectAll();
		System.out.print("대여할 도서 번호 선택   : ");
		int index  = sc.nextInt();
		
		switch(lc.rentBook(index)) {
		case 0 :
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능합니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
			break;
		}
	}
}
