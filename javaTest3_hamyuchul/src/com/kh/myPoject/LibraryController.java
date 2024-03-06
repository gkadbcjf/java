package com.kh.myPoject;

import java.util.ArrayList;
import java.util.HashMap;

public class LibraryController {
	ArrayList<Book> aryb = new ArrayList<Book>();
	Member m = new Member();

	public LibraryController() {
		aryb.add(new Book("kh.L1", "참을 수 없는 존재의 가벼움", "박용리", "철학"));
		aryb.add(new Book("kh.L2", "불확실한 자본", "마티아스 말더", "철학"));
		aryb.add(new Book("kh.L3", "스토커", "강경태", "공포"));
		aryb.add(new Book("kh.L4", "그 매우 장황한 사람", "마티아스 말더", "공포"));
		aryb.add(new Book("kh.L5", "추억은 나의 또 다른 이름", "피아 베레즈", "로맨스"));
		aryb.add(new Book("kh.L6", "우리의 밤은 당신의 낮보다 아름답다", "메리 히긴스 클라스", "로맨스"));
		aryb.add(new Book("kh.L7", "그녀의 이름은 무엇인가요", "피아 베레즈", "로맨스"));
		aryb.add(new Book("kh.L8", "나무를 위한 노래", "백석", "소설"));
		aryb.add(new Book("kh.L9", "죽여 마땅한가", "박완서", "소설"));
		aryb.add(new Book("kh.L10", "백설공주", "그리마르크와일드", "소설"));

	}

	public int countBook() { //도서관 책 존재여부
		return aryb.size();
	}

	public boolean rentBook(String bookname) { // 책 빌리기
		int check = 0;
		for (int i = 0; i < aryb.size(); i++) {
			if ((aryb.get(i)).getTitle().equals(bookname)) {
				check = 1;
				int result =new LibraryService().rentBook(bookname);//db에 사용자가 빌린 책 삭제
				if(result >0) {
					System.out.printf("%s 책을 빌리셨습니다★", aryb.get(i).getTitle());
					m.setBk(aryb.get(i));
					aryb.remove(i);
					return true;
				}
			}
		}
		if (check != 1) {
			System.out.println("찾으시는 책이 존재하지않습니다. 다시입력해주세요.");
			return false;
		}
		return false;

	}

	public void viewRentBook() { // 빌린 책 보기
		if (!m.getBk().isEmpty()) {
			for (int i = 0; i < m.getBk().size(); i++) {
				System.out.println(m.getBk().get(i));
			}
		}
		else
			System.out.println("회원님의 빌린책은 존재하지 않습니다.");
	}
	

	
	public boolean returnBook(String bookname) { // 책 반납
		int check = 0;
		for (int i = 0; i < aryb.size(); i++) {
			if (m.getbook(i).getTitle().equals(bookname)) {
				check = 1;
				int result =new LibraryService().returnBook(m.getbook(i));
				if(result>0) {
					System.out.printf("★%s 책을 반납하셨습니다.★\n", m.getbook(i).getTitle());				
					aryb.add(m.getbook(i));
					m.removeBk(m.getbook(i));
					return true;
				}
			
			}
		}
		if (check != 1) {
			System.out.println("찾으시는 책이 존재하지않습니다. 다시입력해주세요.");
			return false;
		}
		return false;
	}

	public void viewLibraryBook() { // 도서관 전체 책 보기
		if (!aryb.isEmpty()) {
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
			for (Book b : aryb) {
				System.out.println(b);
			}
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
		} else
			System.out.println("도서관에 책이 존재하지 않습니다...");
	}



}
