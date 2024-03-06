package com.kh.Test240123;

import java.util.Scanner;

public class StudentManagement { // 학생관리 프로그램
	Scanner input;
	Student[] std; // 학생 목록
	static int count = 0;

	public StudentManagement() {
		this.input = new Scanner(System.in);
		this.std = new Student[100];
	}

	public int printMenu() {
		System.out.println("==============성적관리 프로그램================");
		System.out.print("1. 성적 입력\n2. 모든학생 성적확인\n3. 학생성적 검색\n4. 마지막저장정보 삭제 \n5. 조건검색 \n" + "9. 종료\n메뉴를 입력하세요 : ");
		int menu = input.nextInt();
		input.nextLine();
		return menu;
	}

	public void startProgram() {
		int menu = 0;
		while (menu != 9) {
			menu = this.printMenu();

			switch (menu) {
			case 1: // 성적입력
				this.insertScore();
				break;
			case 2: // 모든학생 성적확인
				this.all_student();
				break;
			case 3: // 이름으로 학생 검색 후 정보 출력
				this.find_stduent();
				break;
			case 4: // 마지막으로 저장된 정보 삭제
				this.lastGradeDelete();
				break;
			case 5: //
				this.printGradeByCondition();
				break;
			case 9:
				System.out.println("프로그램 종료합니다.");
				input.close();
				break;

			}
		}
	}

	public void insertScore() {
		int check = 0;
		System.out.println("<<성적 입력하기>>");
		System.out.print("이름 입력 :");
		String name = input.next();

		for (int i = 0; i < count; i++) {
			if (std[i].getName().equals(name)) {
				check = 1;
			}
		}
		if (check == 1) {
			System.out.println("해당 이름을 가진 학생이 있습니다.");
			return;
		} else {
			System.out.print("수학 점수 입력 : ");
			int math_score = input.nextInt();
			System.out.print("영어 점수 입력 : ");
			int eng_score = input.nextInt();
			System.out.print("국어 점수 입력 : ");
			int go_score = input.nextInt();

			std[count] = new Student(name, math_score, eng_score, go_score);
			count++;
			return;
		}
	}

	public void all_student() {
		if (count == 0) {
			System.out.println("등록된 학생이 없습니다! 학생을 입력해 주세요.");
		} else {
			System.out.println("<<모든 학생 성적>>");
			for (int i = 0; i < count; i++) {
				System.out.println(std[i].toString());

			}
		}
	}

	public void find_stduent() {
		int check = 0;
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String search = input.next();
		for (int i = 0; i < count; i++) {
			if (search.equals(std[i].getName())) {
				System.out.println("!학생 정보!");
//				System.out.printf("이름 : %s, 수학 점수 : %d, 영어 점수 : %d, 국어 점수 : %d \n전체 평균 : %.1f \n",
//						std[i].getName(),std[i].getMath_score(),std[i].getEng_score(),std[i].getGo_score(),std[i].get_avg());
				System.out.println(std[i].toString() + "\n평균 점수 : " + std[i].get_avg());
				check = 1;
			}

		}
		if (check == 0)
			System.out.println("찾으시는 학생이 없습니다.");

	}

	public void lastGradeDelete() {
		if (count == 0) {
			System.out.println("삭제할 성적이 없습니다.");
			return;
		} else {
			std[count - 1] = null;
			count--;
		}
	}

	public void printGradeByCondition() {
		// 1. 평균 2. 수학 3. 국어 4. 영어
		// (다른번호 입력시 잘못입력하셨습니다. 출력하고 성적관리프로그램으로 돌아가기)
		// 조회할 조건 입력 : 1
		// 기준점수(이상) : 50
		// 기준점수(이하) : 30

		// 50이상 30이하의 평균 학생
		// --------------
		int max=0, min=0,num=0;
		System.out.println("1. 평균  2. 수학  3. 국어  4.영어");
		while (true) {
			
			System.out.print("조회할 조건 입력 : ");
			num = input.nextInt();
			if(num<=4 &&num>=1) {
				break;
			}
			else
				System.out.println("잘못입력했습니다 다시 입력해주세요.");
		}
		System.out.print("기준 점수(이상) : ");
		min = input.nextInt();
		System.out.print("기준 점수(이하) : ");
		max = input.nextInt();

		System.out.printf("<<%d이상 %d이하 평균학생>>\n", min, max);
		System.out.println("----------------------------");
		switch (num) {
	
		case 1:
			for (int i = 0; i < count; i++) {
				if (max <= std[i].getAvg() && min >= std[i].get_avg()) {
					System.out.println(std[i].toString());
				}
			}
			break;
			
			
		case 2:
			for (int i = 0; i < count; i++) {
				if (max <= std[i].getMath_score() && min >= std[i].getMath_score()) {
					System.out.println(std[i].toString());
				}
			}
			break;
		case 3:
			for (int i = 0; i < count; i++) {
				if (max <= std[i].getGo_score() && min >= std[i].getGo_score()) {
					System.out.println(std[i].toString());
				}
			}
			break;
		case 4:
			for (int i = 0; i < count; i++) {
				if (max <= std[i].getEng_score() && min <= std[i].getEng_score()) {
					System.out.println(std[i].toString());
				}
			}
			break;
	
		}
		

	}
}
