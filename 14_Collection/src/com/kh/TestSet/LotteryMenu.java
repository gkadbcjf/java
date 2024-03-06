package com.kh.TestSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();

	public void mainMenu() {
		System.out.println("========== KH 추첨 프로그램 ==========");
		while (true) {

			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 추첨 대상 추가\n2. 추첨 대상 삭제\n3. 당첨 대상 확인\n4. 정렬된 당첨 대상 확인\n5. 당첨 대상 검색\n9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void insertObject() {
		System.out.print("추가할 추첨 대상 수 : ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("휴대폰 번호('-'빼고) : ");
			String phone = sc.next();
			;

			if (!lc.insertObject(new Lottery(name, phone))) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--;
			}

		}
		System.out.println(n + "명 추가 완료했습니다.");

	}

	public void deleteObject() {
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();

		System.out.println(lc.deleteObject(new Lottery(name, phone)) ? "삭제완료했습니다." : "존재하지 않는 대상입니다.");
	}

	public void winObject() {
		if (lc.winObject() != null) {
			System.out.println(lc.winObject());
		} else
			System.out.println("당첨결과가 없습니다.");
	}

	public void sortedWinObject() {
		TreeSet<Lottery> sortedList = lc.sortedWinObject();
		if (sortedList.isEmpty()) {
			System.out.println("당첨결과가 없습니다.");
		} else {
			Iterator<Lottery> it = sortedList.iterator();
			while (it.hasNext()) {
				Lottery l = (Lottery) it.next();
				System.out.println(l);
			}
		}
	}

	public void searchWinner() {
		System.out.print("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();

		System.out.println(
				lc.searchWinner(new Lottery(name, phone)) ? "축하합니다. 당첨 목록에 존재합니다." : "안타깝지만 당첨 목록에 존재하지 않습니다.");
	}
}
