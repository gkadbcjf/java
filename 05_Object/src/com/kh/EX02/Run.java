package com.kh.EX02;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
			//choi객체 생성 최지원, 15살, 영어 :60, 수학 : 70, 국어 : 80
			//kim객체 생성 김도현, 17살, 영어 :95 , 수학 :85, 국어 :80
		//수 국 영
		Scanner input = new Scanner(System.in);
		
		
		/*
		Student choi =new Student("최지원",15,70,80,60);
		Student kim = new Student("김도현",17,85,80,95);
		choi.print()
		int avg= (choi.getEnScore()+choi.getKoScore() +choi.getMathScore())/3;
		System.out.println(choi.getName()+"님의 성적 평균 : " +avg);
		int avg2= (kim.getEnScore()+kim.getKoScore() +kim.getMathScore())/3;
		System.out.println(kim.getName()+"님의 성적 평균 : " +avg2);
		
		
		//choi의 모든 과목의 평균을 출력해라
		System.out.println(choi.getEvg());
		
		//kim의 모든 과목의 평균을 출력
		System.out.println(kim.getEvg());
		*/
		
		
		
		/*
		
		// 사용자로부터 이름, 나이, 영어점수 수학점수 국어점수를 입력받아
		// 평균을 구하고 출력하는 프로그램 작성
		// ex)  이름 : 최지원
		//		나이 : 80
		//		영어점수 : 80
		//		수학점수 : 100
		//		국어점수 : 100
		// 최지원님의 평균 : 85점 
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age, en, ko, math;
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("나이 : ");
		age =sc.nextInt();
		System.out.print("영어 : ");
		en =sc.nextInt();
		System.out.print("수학 : ");
		math =sc.nextInt();
		System.out.print("국어 : ");
		ko =sc.nextInt();
		
		Student st1 = new Student(name,age,math,en,ko);
		kh.isEvalute(st1);
		System.out.println(st1.getName() + "님의 평균 : " + st1.getEvg());
		*/
		University kh = new University("KH대학교",75,60,60);
		Student choi = new Student("최지원",15,70,60,80);
		
		//choi학생객체는 kh대학교에 입학이 가능한지 검사하여
		//가능하다면 "합격입니다"
		//불가능하다면 "불합격입니다"
		//를 출력하는 프로그램 작성
		
		if(kh.getEnCut()<= choi.getEvg()) {
			if(kh.getEnCut()<=choi.getEnScore() && kh.getKoCut() <=choi.getKoScore()) {
				System.out.println("합격입니다");
			}
			else
				System.out.println("불합격입니다.");
		}
		else
			System.out.println("불합격입니다.");
		
		System.out.println(kh.isEvaluate(choi)?"합격입니다.":"불합격입니다.");
		
		
		
		/*
		
		System.out.println((kh.getEnCut()<= choi.getEvg())?
				((kh.getEnCut()<=choi.getEnScore() && kh.getKoCut() <=choi.getKoScore())?
						"합격입니다":"불합격입니다."):"불합격입니다.");
		
		*/
		
		
		
		
		
		
		
	
		
		
	}

}
