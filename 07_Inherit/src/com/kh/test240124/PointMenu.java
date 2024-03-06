package com.kh.test240124;

import java.util.Scanner;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	
	public void mainMenu() {
		int num=0;
		while(num != 9) {
			System.out.println("===== 메뉴 =====");
			System.out.print("1. 원\n2. 사각형\n9. 끝내기\n");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			if(num != 1 && num !=2 && num != 9) {
				System.out.println("다시입력하세요.");
			}
			else {
				switch(num) {
				case 1:
					this.circleMenu();
					break;
				case 2:
					this.retangleMenu();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					break;
					//System.exit(0);
				}
			}
				
			return;	
		}
	}
	
	public void circleMenu() {
		int num = 0;
		while(num != 9) {
			System.out.println("===== 원 메뉴 =====");
			System.out.print("1. 원 둘레\n2. 원 넓이\n9. 메인으로\n");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			if(num != 1 && num !=2 && num != 9) {
				System.out.println("다시입력하세요.");
			}
			else {
				switch(num) {
				case 1:
					this.calcCircum();
					break;
				case 2:
					this.calcCircleArea();
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					this.mainMenu();
					break;
					
				}
			}
				
				
		}
	}
	
	public void retangleMenu() {
		int num = 0;
		while(num != 9) {
			System.out.println("===== 메뉴 =====");
			System.out.print("1. 사각형 둘레\n2. 사각형 넓이\n9. 메인으로\n");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			if(num != 1 && num !=2 && num != 9) {
				System.out.println("다시입력하세요.");
			}
			else {
				switch(num) {
				case 1:
					this.calcPerimeter();
					break;
				case 2:
					this.calcRectArea();
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					this.mainMenu();
					break;
					
				}
			}
				
				
		}
	}
	
	public void calcCircum() {
			System.out.print("x 좌표 : ");
			int x = sc.nextInt();
			System.out.print("y 좌표 : ");
			int y = sc.nextInt();
			System.out.print("반지름 : ");
			int z = sc.nextInt();
			cc =new CircleController();
			System.out.println(cc.calcCircum(x, y, z));
		
			
			
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int z = sc.nextInt();
		cc =new CircleController();
		System.out.println(cc.calcArea(x, y, z));
		
		
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int h = sc.nextInt();
		System.out.print("너비 : ");
		int w = sc.nextInt();
		
		rc = new RectangleController();
		System.out.println(rc.calcPerimeter(x, y, h, w));
		
	}
	
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		
		int h = sc.nextInt();
		System.out.print("너비 : ");
		int w = sc.nextInt();
		rc = new RectangleController();
		System.out.println(rc.calcArea(x, y, h, w));
	}
	
	
	
}
