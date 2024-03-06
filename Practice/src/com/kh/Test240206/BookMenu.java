package com.kh.Test240206;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	public void mainMenu() {
		while (true) {
			System.out.println("== Welcome KH Library ==");
			System.out.println("1. 새 도서 추가\n2. 도서 전체 조회\n3. 도서 검색 조회 \n4. 도서 삭제\n5. 도서 명 오름차순 정렬" + "\n9. 종료\n");
			System.out.print("메뉴 번호 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				this.ascBook();
				break;
			case 9:
				System.out.println("프로그램 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");

			}
		}
	}

	public void insertBook() {
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책정보를 입력해주세요.");
		System.out.print("도서명 입력 : ");
		String title =sc.nextLine();
		System.out.print("저자명 입력 : ");
		String author =sc.next();
		System.out.print("장르 입력(1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
		int category =sc.nextInt();
		System.out.print("가격 입력 : ");
		int price =sc.nextInt();
	
		if(category ==1) {
			bc.insertBook(new Book(title,author,"인문",price));
		}
		else if(category ==2) {
			bc.insertBook(new Book(title,author,"자연과학",price));
		}
		else if(category ==3) {
			bc.insertBook(new Book(title,author,"의료",price));
		}
		else if(category ==4) {
			bc.insertBook(new Book(title,author,"기타",price));
		}
		else
			System.out.println("잘못입력했습니다.");
	
		
	}

	public void selectList() {
		ArrayList<Book> bookList =bc.selectList();
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		}
		else {
			for(Book b:bookList) {
				System.out.println(b.toString());
			}
		}
	
	}

	public void searchBook() {
		System.out.println("===== 도서 검색 =====");
		System.out.print("검색 키워드 : ");
		String keyword = sc.next();
		ArrayList<Book> searchList =bc.searchBook(keyword);
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}
		else {
			for(Book b:searchList) {
				System.out.println(b.toString());
			}
		}
	}

	public void deleteBook() {
		System.out.println("===== 도서 삭제 =====");
		System.out.print("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자 명 : ");
		String author =sc.nextLine();
		
		Book remove =bc.deleteBook(title, author);
		if(remove != null) {
			System.out.println("성공적으로 삭제했습니다.");
		}
		else
			System.out.println("삭제할 도서를 찾지 못했습니다.");
	}

	public void ascBook() {
		if(bc.ascBook()==1)
			System.out.println("정렬에 성공하였습니다");
		else
			System.out.println("정렬에 실패하였습니다.");
	}
}
