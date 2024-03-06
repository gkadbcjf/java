package com.kh.Test240207;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MemberMenu {
	MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("========== KH 사이트 ==========");
		while (true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 회원가입 \n2. 로그인 \n3. 같은 이름 회원 찾기 \n9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				joinMembership();
				break;
			case 2:
				logIn();
				memberMenu();
				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void memberMenu() {
		System.out.println("******* 회원 메뉴 *******");
		while (true) {
			System.out.println("1. 비밀번호 바꾸기 \n2. 이름 바꾸기 \n3. 로그아웃");
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

	public void joinMembership() {
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String password = sc.next();
			System.out.print("이름 : ");
			String name = sc.next();
			sc.nextLine();
			Member m = new Member(password, name);
			boolean tf = mc.joinMembership(id, m);
			if (tf) {
				System.out.println("성공적으로 회원가입 완료하였습니다.");
				break;
			} else
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
	}

	public void logIn() {
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String password = sc.next();
			sc.nextLine();
			String str = mc.logIn(id, password);
			if (str != null) {
				System.out.println( str+ "님, 환영합니다!");
				break;
			} else
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주새요.");
		}

	}

	public void changePassword() {
		/*
		 * 아이디와 비밀번호, 변경할 비밀번호를 받아 mc의 chagePassword()로 보냄. 받은 결과 값이 true면 “비밀번호 변경에
		 * 성공했습니다.”, false면 “비밀번호 변경에 실패했습니다. 다시 입력해주세요.” 출력 후 반복
		 */
		while(true) {
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("현재 비밀번호 : ");
		String password = sc.next();
		System.out.print("새로운 비밀번호 : ");
		String newpwd = sc.next();
		sc.nextLine();
		boolean tf =mc.changePassword(id, password, newpwd);
		if (tf) {
			System.out.println("비밀번호 변경에 성공했습니다.");
			break;
		} else
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
		}
	}

	public void changeName() {
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("현재 비밀번호 : ");
			String password = sc.next();
			System.out.println("현재 설정된 이름 : "+mc.logIn(id, password));
			System.out.print("변경할 이름 : ");
			String nwname= sc.next();
			sc.nextLine();
			mc.changeName(id, nwname);
			if (mc.logIn(id, password) != null) {
				System.out.println("이름 변경에 성공하였습니다.");
				break;
			} else
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
			}
	}

	public void sameName() {
		/*검색할 이름을 받고 mc의 sameName()메소드로 넘김.
		반환 값을 가지고 entrySet()을 이용하여 ‘이름-아이디’ 형식으로 출력*/
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		sc.nextLine();
		Set entrySet =mc.sameName(name).entrySet();
		Iterator itEntry =entrySet.iterator();
		while(itEntry.hasNext()) {
			Entry entry =(Entry)itEntry.next();
			String key =(String)entry.getKey();
			String mem = (String)entry.getValue();
			System.out.println(mem+"-"+key);
		}
		
		
		/*
		TreeMap result = new TreeMap(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
		});
		if(result.isEmpty()) {
			System.out.println("회원을 찾지 못하였습니다.");
		}else {
			
			for(Object entry:result.entrySet()) {
				Map.Entry<String, String>en = (Entry)entry;
				System.out.println(en.getValue()+"-"+en.getKey());
			}
		}
		*/
		
	}

}
