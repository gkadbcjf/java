package com.kh.generics_collection실습문제;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
//View역할
public class FarmMenu {
	Scanner sc = new Scanner(System.in);
	FarmController fc = new FarmController();

	public void mainMenu() {
	
		System.out.println("========== KH 마트 ==========");
		while (true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 직원 메뉴\n2. 손님 메뉴\n9. 종료");
			System.out.print("메뉴 번호 선택 : ");

			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void adminMenu() {
	
		while (true) {
			System.out.println("******* 직원 메뉴 *******");
			System.out.println("1. 새 농산물 추가\n2. 종류 삭제\n3. 수량 수정\n4. 농산물 목록\n9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				addNewKind();
				break;
			case 2:
				removeKind();

				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printFarm();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void customerMenu() {
		
		printFarm();
		while (true) {

			System.out.println("******* 고객 메뉴 *******");
			System.out.println("1. 농산물 사기\n2. 농산물 빼기\n3. 구입한 농산물 보기\n9. 메인으로 돌아가기 ");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				buyFarm();
				break;
			case 2:
				removeFarm();
				break;
			case 3:
				printBuyFarm();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
			printFarm();
		}

	}

	// 1-1. 새 농산물 추가용 view 메소드
	public void addNewKind() {
	
		while (true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("수량 : ");
			int amount = sc.nextInt();
			switch (num) {
			case 1:
				Fruit f = new Fruit("과일", name);
				if (fc.addNewKind(f, amount)) {
					System.out.println("새 농산물이 추가되었습니다.");
					return;
				} else {
					System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
					break;
				}

			case 2:
				Vegetable v = new Vegetable("야채", name);
				if (fc.addNewKind(v, amount)) {
					System.out.println("새 농산물이 추가되었습니다.");
					return;
				} else {
					System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
					break;
				}

			case 3:
				Nut n = new Nut("견과", name);
				if (fc.addNewKind(n, amount)) {
					System.out.println("새 농산물이 추가되었습니다.");
					return;
				} else {
					System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
					break;
				}
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	// 1-2. 종류 삭제용 view 메소드
	public void removeKind() {

		while (true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("삭제할 종류 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			switch (num) {
			case 1:
				Fruit f = new Fruit("과일", name);
				if (fc.removeKind(f)) {
					System.out.println("농산물 삭제에 성공하였습니다.");
					return;
				} else {
					System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
					break;
				}

			case 2:
				Vegetable v = new Vegetable("야채", name);
				if (fc.removeKind(v)) {
					System.out.println("농산물 삭제에 성공하였습니다.");
					return;
				} else {
					System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
					break;
				}

			case 3:
				Nut n = new Nut("견과", name);
				if (fc.removeKind(n)) {
					System.out.println("농산물 삭제에 성공하였습니다.");
					return;
				} else {
					System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
					break;
				}
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}

	}

	// 1-3. 수량 수정용 view 메소드
	public void changeAmount() {

		while (true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("수정할 종류 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("수정할 수량 : ");
			int amount = sc.nextInt();
			switch (num) {
			case 1:
				Fruit f = new Fruit("과일", name);
				if (fc.changeAmount(f, amount)) {
					System.out.println("농산물 수량이 수정되었습니다.");
					return;
				} else {
					System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
					break;
				}

			case 2:
				Vegetable v = new Vegetable("야채", name);
				if (fc.changeAmount(v, amount)) {
					System.out.println("농산물 수량이 수정되었습니다.");
					return;
				} else {
					System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
					break;
				}

			case 3:
				Nut n = new Nut("견과", name);
				if (fc.changeAmount(n, amount)) {
					System.out.println("농산물 수량이 수정되었습니다.");
					return;
				} else {
					System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
					break;
				}
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	// 1-4. 농산물 목록 출력용 view 메소드
	public void printFarm() {

		System.out.println("현재 KH마트 농산물 수량");
		HashMap<Farm, Integer> hm = fc.printFarm();
		for (Object o : hm.keySet()) {
			if (o instanceof Fruit) {
				Fruit f = (Fruit) o;
				System.out.println(f.getKind() + " : " + f.getName() + "(" + hm.get(f) + ")");
			} else if (o instanceof Vegetable) {
				Vegetable v = (Vegetable) o;
				System.out.println(v.getKind() + " : " + v.getName() + "(" + hm.get(v) + ")");
			} else if (o instanceof Nut) {
				Nut n = (Nut) o;
				System.out.println(n.getKind() + " : " + n.getName() + "(" + hm.get(n) + "개)");
			}
		}
		
	}

	// 2-1. 농산물 구매용 view 메소드
	public void buyFarm() {

		while (true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("구매 종류 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.print("구매할 것 : ");
			String name = sc.nextLine();

			switch (num) {
			case 1:
				Fruit f = new Fruit("과일", name);
				if (fc.buyFarm(f)) {
					System.out.println("구매에 성공하였습니다.");

					return;
				} else {
					System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
					break;
				}

			case 2:
				Vegetable v = new Vegetable("야채", name);
				if (fc.buyFarm(v)) {
					System.out.println("구매에 성공하였습니다.");

					return;
				} else {
					System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
					break;
				}

			case 3:
				Nut n = new Nut("견과", name);
				if (fc.buyFarm(n)) {
					System.out.println("구매에 성공하였습니다.");

					return;
				} else {
					System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
					break;
				}
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		

	}

	// 2-2. 농산물 구매 취소용 view 메소드
	public void removeFarm() {
		
		while (true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("취소 종류 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			System.out.print("구매 취소할 것 : ");
			String name = sc.nextLine();

			switch (num) {
			case 1:
				Fruit f = new Fruit("과일", name);
				if (fc.removeFarm(f)) {
					System.out.println("구매 취소에 성공하였습니다.");

					return;
				} else {
					System.out.println("구매매 목록에 존재하지 않습니다. 다시 입력해주세요.");
					break;
				}

			case 2:
				Vegetable v = new Vegetable("야채", name);
				if (fc.removeFarm(v)) {
					System.out.println("구매 취소에 성공하였습니다.");

					return;
				} else {
					System.out.println("구매매 목록에 존재하지 않습니다. 다시 입력해주세요.");
					break;
				}

			case 3:
				Nut n = new Nut("견과", name);
				if (fc.removeFarm(n)) {
					System.out.println("구매 취소에 성공하였습니다.");

					return;
				} else {
					System.out.println("구매매 목록에 존재하지 않습니다. 다시 입력해주세요.");
					break;
				}
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		
	}

	// 2-3. 구입한 농산물 출력용 view 메소드
	public void printBuyFarm() {
		
		Iterator<Farm> ite = fc.printBuyFarm().iterator();

		while (ite.hasNext()) {
			Farm a = (Farm) ite.next();
			if (a instanceof Fruit) {
				Fruit f = (Fruit) a;
				System.out.println(f.getKind() + " : " + f.getName());
			} else if (a instanceof Vegetable) {
				Vegetable f = (Vegetable) a;
				System.out.println(f.getKind() + " : " + f.getName());
			} else if (a instanceof Nut) {
				Nut f = (Nut)a;
				System.out.println(f.getKind() + " : " + f.getName());
			}

		}
		System.out.println();

	}
}
