package com.kh.myPoject;

import java.util.Scanner;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	LibraryController bc = new LibraryController();

	public void mainMenu() {
		System.out.println("==========<< KH 사이트 >>==========\n");
		while (true) {
			System.out.println("---------------------------------");
			System.out.println("|           *메인 메뉴*            |");
			System.out.println("---------------------------------");
			System.out.println("1. 회원가입 \n2. 로그인 \n3. 전체 회원 조회 \n9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				joinMembership();
				break;
			case 2:
				logIn();
				memberLibraryMenu();
				break;
			case 3:
				printMember();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void joinMembership() {
		while (true) {
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("|           *회원 가입*            |");
			System.out.println("---------------------------------");
			System.out.print("아이디 입력 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 입력 :");
			String password = sc.nextLine();
			System.out.print("이름 입력 : ");
			String name = sc.nextLine();
			boolean bf = mc.joinMembership(id, new Member(name, password));

			if (bf) {
				System.out.println("★성공적으로 회원가입 완료했습니다★");
				break;
			} else
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}

	}
	
	
	public void logIn() {
		while (true) {
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("|           *로그인 화면*          |");
			System.out.println("---------------------------------");
			System.out.print("아이디 입력 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 입력 :");
			String password = sc.nextLine();

			String bf = mc.login(id, password);
			if (bf == null)
				System.out.println("틀린 아이디 또는 비밀번호 입니다. 다시 입력해주세요.");
			else {
				System.out.printf("%s님, 환영합니다!\n", bf);
				break;
			}
		}

	}
	
	public void printMember() { // 회원 전체조회

		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("|          *전체 회원 조회*         |");
		System.out.println("---------------------------------");
		mc.printMember();

	}
	
	



	public void memberLibraryMenu() {
		while (true) {
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("|         *회원 도서관 메뉴*         |");
			System.out.println("---------------------------------");
			System.out.println("1. 회원 정보 수정 \n2. 대여한 책 목록 보기 \n3. 책 빌리기 \n4. 책 반납하기 \n5. 도서관 전체 책 목록 보기 \n9. 로그아웃");
			System.out.print("메뉴 번호 입력 : ");

			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				memberModifyMenu();
				break;
			case 2:
				viewRentBook();
				break;
			case 3:
				rentBook();
				break;
			case 4:
				returnBook();
				break;
			case 5:
				viewLibraryBook();
				break;

			case 9:

				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}

		}
	}
	
	public void memberModifyMenu() {

		while (true) {
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("|         *회원 수정 메뉴*          |");
			System.out.println("---------------------------------");
			System.out.println("1. 비밀번호 바꾸기 \n2. 이름 바꾸기 \n3. 도서관 메뉴로 돌아가기");
			System.out.print("메뉴 번호 입력 : ");

			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("로그아웃 되었습니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}

		}
	}

	

	public void changePassword() {
		String id, old_password;
		while (true) {
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("|          *비밀번호 변경*          |");
			System.out.println("---------------------------------");
			System.out.print("아이디 입력 : ");
			id = sc.nextLine();
			System.out.print("현재 비밀번호 입력 :");
			old_password = sc.nextLine();
			String bf = mc.login(id, old_password);
			if (bf == null)
				System.out.println("틀린 아이디 또는 비밀번호 입니다. 다시 입력해주세요.");
			else {
				break;
			}
		}
		while (true) {
			System.out.println("[ 비밀번호 변경중... ]");
			System.out.print("새로운 비밀번호 입력 :");
			String new_password = sc.nextLine();

			boolean bf = mc.changePassword(id, old_password, new_password);
			if (!bf)
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			else {
				System.out.println("★비밀번호 변경에 성공했습니다★");
				break;
			}
		}

	}

	public void changeName() {
		String id, password;
		while (true) {
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("|          *이름 변경[확인]*        |");
			System.out.println("---------------------------------");
			System.out.print("아이디 입력 : ");
			id = sc.nextLine();
			System.out.print("비밀번호 입력 :");
			password = sc.nextLine();
			String bf = mc.login(id, password);
			if (bf == null)
				System.out.println("틀린 아이디 또는 비밀번호 입니다. 다시 입력해주세요.");
			else {
				System.out.println("계정이 확인되었습니다!");
				break;
			}
		}
		if (mc.login(id, password) == null) {
			System.out.println("이름 변경에 실패했습니다.");
		} else {
			while (true) {
				System.out.println();
				System.out.println("---------------------------------");
				System.out.println("|          *이름 변경 중*          |");
				System.out.println("---------------------------------");
				System.out.println("현재 설정된 이름 : " + mc.login(id, password));
				System.out.print("변경할 이름 입력 :");
				String new_id = sc.nextLine();
				if (mc.login(id, password).equals(new_id)) {
					System.out.println("기존 이름과 동일합니다 다시 입력해주세요.");
				} else {
					mc.changeName(id, new_id);
					System.out.println("★이름 변경에 성공했습니다★");
					break;
				}
			}
		}

	}
	
	
	
	public void rentBook() { // 책 빌리기
		while (true) {
			if (bc.countBook() == 0) {
				System.out.println("도서관에 책이 없어 빌릴 수 없습니다...");
			}
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("|           *책 빌리기*            |");
			System.out.println("---------------------------------");
			System.out.print("책 목록을 보시겠습니까?(y/n) : ");
			String str = sc.nextLine();
			if (str.toLowerCase().equals("y"))
				bc.viewLibraryBook();
			System.out.print("빌릴 책 제목을 입력해 주세요 : ");
			String book_num = sc.nextLine();
			boolean tf = bc.rentBook(book_num);
			if (tf)
				break;

		}

	}

	public void viewRentBook() { // 빌린 책 보기bc
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("|          *회원 책 목록*          |");
		System.out.println("---------------------------------");
		bc.viewRentBook();
	}

	public void returnBook() { // 책 반납bc
		while (true) {
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("|          *회원 책 반납*          |");
			System.out.println("---------------------------------");
			System.out.print("반납하실 책 이름을 적어주세요 : ");
			String bookname = sc.nextLine();
			Boolean tf = bc.returnBook(bookname);
			if (tf) {
				System.out.println("성공적으로 반납하셨습니다.");
				break;
			} else
				System.out.println("반납에 실패하셨습니다. 책 이름 확인 후 다시 입력해주세요.");

		}
	}

	public void viewLibraryBook() { // 도서관 전체 책 보기bc
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("|            *책 목록*            |");
		System.out.println("---------------------------------");
		bc.viewLibraryBook();

	}

}
