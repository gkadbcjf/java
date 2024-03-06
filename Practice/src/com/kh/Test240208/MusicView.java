package com.kh.Test240208;

import java.util.List;
import java.util.Scanner;

public class MusicView {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();

	public void mainMenu() {
		while (true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정 ");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못입력했습니다. 다시입력해주세요.");
			}
		}
		// TODO Auto-generated method stub

	}

	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		int result = mc.addList(new Music(title, singer));
		System.out.println(result == 1 ? "추가 성공" : "추가 실패");
		System.out.println();

		// 곡 명과 가수 명을 사용자에게 입력 받는다.
		// MusicController에 addList()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔창에 출력
	}

	public void addAtZero() {

		// 곡 명과 가수 명을 사용자에게 입력 받는다.
		// MusicController에 addAtZero()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔 창에 출력
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		int result = mc.addAtZero(new Music(title, singer));
		System.out.println(result == 1 ? "추가 성공" : "추가 실패");
		System.out.println();

	}

	public void printAll() {

		// MusicController에 printAll() 반환 값을 출력한다.
		System.out.println("****** 전체 곡 목록 출력 ******");
		List list = mc.printAll();
		for (Object o : list) {
			System.out.print(o + ", ");
			
		}
		System.out.println();

	}

	public void searchMusic() {

		// 사용자에게 곡 이름을 받고 MusicController에 있는 searchMusic으로 값을 넘긴다.
		// searchMusic()의 반환 값에 따라 반환 값이 없으면 “검색한 곡이 없습니다.”
		// 반환 값이 있으면 “검색한 곡은 000(곡 명, 가수 명) 입니다.” 콘솔 창에 출력
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		Music result = mc.searchMusic(title);
		if (result != null)
			System.out.printf("검색한 곡은 %s(%s, %s)입니다.", title, result.getTitle(), result.getSinger());
		else
			System.out.println("검색한 곡이 없습니다.");
		System.out.println();
	}

	public void removeMusic() {
		// 사용자에게 삭제할 곡의 이름을 직접 받고 MusicController에 removeMusic으로
		// 값을 넘긴다. removeMusic()의 반환 값에 따라 반환 값이 없으면 “ 삭제할 곡이 없습니다.”
		// 반환 값이 있으면 “000(곡 명, 가수 명)을 삭제 했습니다” 콘솔 창에 출력
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		Music result = mc.removeMusic(title);
		if(result != null)
		System.out.printf("%s(%s, %s)을 삭제 했습니다.", title, result.getTitle(), result.getSinger());
		else
			System.out.println("삭제할 곡이 없습니다");
		System.out.println();
	}

	public void setMusic(){
		// 사용자에게 수정할 곡을 입력 하여 MusicController에 setMusic으로 검색 할 수 있게
		// 값을 넘기며 수정할 곡 명과 가수 명을 받아 setMusic으로 값을 넘긴다.
		// 검색 결과 값이 없으면 “수정할 곡이 없습니다.”, 검색 결과 값이 있고
		// 수정 했으면 “000(곡 명, 가수 명)의 값이 변경 되었습니다.” 콘솔 창에 출력
		System.out.println("****** 특정 곡 정보 수정 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		System.out.print("수정할 곡 명 : ");
		String new_title = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String new_singer = sc.nextLine();
		
		Music new_m= new Music(new_title,new_singer);
		Music result = mc.setMusic(title,new_m);
		if(result != null)
		System.out.printf("%s(%s, %s)의 값이 변경 되었습니다.", title, result.getTitle(), result.getSinger());
		else
			System.out.println("수정할 곡이 없습니다");
		System.out.println();
		}
	

	public void ascTitle(){
	
		// MusicController에 ascTitle()의 값에 따라 성공 시 “정렬 성공”, 실패 시 “정렬 실패”
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		int result =mc.ascTitle();
		System.out.println(result==1?"정렬 성공":"정렬 실패");
		System.out.println();
		}
	

	public void descSinger(){
		
		// musicController에 descSinger()의 값에 따라 성공 시 “정렬 성공”, 실패 시 “정렬 실패”
		System.out.println("****** 가수 명 내림차순 정렬 ******");
		int result =mc.descSinger();
		System.out.println(result==1?"정렬 성공":"정렬 실패");
	System.out.println();
		}

}
