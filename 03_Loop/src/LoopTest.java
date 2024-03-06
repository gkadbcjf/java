import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("반복문 시작전");
		//for (초기식; 조건식; 증감심;
		
		/*
		for(int i=0; i<5; i++) {
			System.out.println("반복문 실행 : " + i);
		}
		System.out.println("반복문 종료...");
		*/
		
		/*
		int i=1;
		while(i<3) {
			System.out.println("반복문 실행 : "+i);
			i++;
		}
		*/
		
		int menu=0;
		while(menu !=7) {
		System.out.print("1. 입력 \n2. 수정 \n3. 조회 \n4. 삭제 \n7. 종료 \n"
				+ "메뉴번호를 입력하세요 : ");
		 menu = input.nextInt();
	
		if(menu ==1) {
			System.out.println("입력메뉴입니다.");
		}
		else if(menu == 2) {
			System.out.println("수정메뉴입니다.");
		}
		else if(menu == 3) {
			System.out.println("조회메뉴입니다.");
		}
		else if(menu == 4) {
			System.out.println("삭제메뉴입니다.");
		}
		else if(menu == 7) {
			System.out.println("프로그램이 종료됩니다.");
		}
		else
			System.out.println("잘못 입력하였습니다."); 
		}
	}

}
