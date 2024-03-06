package com.kh.Test240123;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 사용자로부터 이름 수학점수/국어점수/영어점수를 입력받아
		// 평균을 실수로 구하세요.

		// 위에서 입력받은 정보로 객체를 생성할 수 있는 Student를 작성하세요.
		// 평균을 구하는 메소드, 모든 필드정보를 보여주는 메소드를 포함하여 작성합니다.

		// 해당프로그램을 작성합니다.
		// ==============성적관리 프로그램================
		// 1. 성적입력
		// 2. 모든학생 성적확인
		// 3. 학생성적검색
		// 9. 종료
		// 메뉴를 입력하세요 : 1
		// -> 1번 입력수 이름 수학점수/국어점수/영어점수를 입력받아 객체배열에 저장
		// -> 2번 입력시 객체배열에 저장된 모든 객체정보 표시
		// -> 3번 입력시 이름을 입력받아 해당 이름의 학생 검색 후 정보출력
		// -> 9번 입력시 종료
		/*
		int menu = 0, count = 0;
		Student[] std = new Student[100];

		while (menu != 9) {
			System.out.println("==============성적관리 프로그램================");
			System.out.print("1. 성적 입력\n2. 모든학생 성적확인\n3. 학생성적 검색\n" + "9. 종료\n메뉴를 입력하세요 : ");
			menu = input.nextInt();

			switch (menu) {
			case 1:
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
					break;
				} else {
					System.out.print("수학 점수 입력 : ");
					int math_score = input.nextInt();
					System.out.print("영어 점수 입력 : ");
					int eng_score = input.nextInt();
					System.out.print("국어 점수 입력 : ");
					int go_score = input.next
					Int();

					std[count] = new Student(name, math_score, eng_score, go_score);
					count++;
					break;
				}
			case 2:
				if (count == 0) {
					System.out.println("등록된 학생이 없습니다! 학생을 입력해 주세요.");
				} else {
					System.out.println("<<모든 학생 성적>>");
					for (int i = 0; i < count; i++) {
						System.out.println(std[i].toString());

					}
				}
				break;

			case 3:
				check = 0;
				System.out.print("검색할 학생 이름을 입력하세요 : ");
				String search = input.next();
				for (int i = 0; i < count; i++) {
					if (search.equals(std[i].getName())) {
						System.out.println("!학생 정보!");
//						System.out.printf("이름 : %s, 수학 점수 : %d, 영어 점수 : %d, 국어 점수 : %d \n전체 평균 : %.1f \n",
//								std[i].getName(),std[i].getMath_score(),std[i].getEng_score(),std[i].getGo_score(),std[i].get_avg());
						System.out.println(std[i].toString() + "\n평균 점수 : " + std[i].get_avg());
						check = 1;
					}

				}
				if (check == 0)
					System.out.println("찾으시는 학생이 없습니다.");

				break;
			case 9:
			

				System.out.println("프로그램을 종료합니다.");

			}
		}*/
		
//		StudentManagement std = new StudentManagement();
//		std.startProgram();
		new StudentManagement().startProgram();
	}

}
