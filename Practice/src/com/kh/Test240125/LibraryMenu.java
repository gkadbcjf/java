package com.kh.Test240125;

import java.util.Scanner;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	

	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		lc.insertMember(new Member(name,age,gender));
		
		int num = 0;
		while (num != 9) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지\n2. 도서 전체 조회\n3. 도서 검색 \n4. 도서 대여하기\n9. 프로그램 종료하기 ");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println(lc.myInfo().toString());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("프로그램 종료합니다.");
				break;
			}
			System.out.println();
		}
		
		return;
	}

	public void selectAll() {
		for (int i = 0; i < lc.getbList().length; i++) {
			if (lc.getbList()[i] instanceof CookBook) {
				boolean isCoupon = ((CookBook) lc.getbList()[i]).isCoupon();
				System.out.println(i + "번 도서 : " + lc.getbList()[i].getTitle() + " / " + lc.getbList()[i].getAuthor()
						+ " / " + lc.getbList()[i].getPublisher() + " / " + isCoupon);
			} else {
				if (lc.getbList()[i] instanceof AniBook) {
					int getaccessAge = ((AniBook) lc.getbList()[i]).getAccessAge();
					System.out
							.println(i + "번 도서 : " + lc.getbList()[i].getTitle() + " / " + lc.getbList()[i].getAuthor()
									+ " / " + lc.getbList()[i].getPublisher() + " / " + getaccessAge);
				}
			}
		}
		
	}

	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyward = sc.next();

		for (int i = 0; i < lc.getbList().length; i++) {
			
				if ( lc.getbList()[i].getTitle().contains(keyward)) {
	
					if (lc.getbList()[i] instanceof CookBook) {
						boolean isCoupon = ((CookBook) lc.getbList()[i]).isCoupon();
						System.out.println(
								i + "번 도서 : " + lc.getbList()[i].getTitle() + " / " + lc.getbList()[i].getAuthor()
										+ " / " + lc.getbList()[i].getPublisher() + " / " + isCoupon);
					} else {
						if (lc.getbList()[i] instanceof AniBook) {
							int getaccessAge = ((AniBook) lc.getbList()[i]).getAccessAge();
							System.out.println(
									i + "번 도서 : " + lc.getbList()[i].getTitle() + " / " + lc.getbList()[i].getAuthor()
											+ " / " + lc.getbList()[i].getPublisher() + " / " + getaccessAge);
						}
					
						
				}
			}

		}
		System.out.println();
	}
	
	
	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		
		switch(lc.rentBook(num)) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
		case 1:
			System.out.println("나이 제한으로 대여 불가능합니다.");
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
		}
		
	}
	
	
	
	
	

}
