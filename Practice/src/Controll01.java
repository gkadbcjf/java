import java.util.Scanner;

public class Controll01 {

	public static void main(String[] args) {
		// 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 " ㅇㅇ 메뉴입니다"를,
		//종료 번호를 누르면 "프로그램이 종료됩니다."를 출력하세요.
		
		/*
		 * ex.
		 * 
		 * 1. 입력
		 * 2. 수정
		 * 3. 조회
		 * 4. 삭제
		 * 7. 종료
		 * 메뉴번호를 입력하세요 : 4
		 * 삭제 메뉴입니다.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("1. 입력 \n2. 수정 \n3. 조회 \n4. 삭제 \n7. 종료 \n"
				+ "메뉴번호를 입력하세요 : ");
		int menu = input.nextInt();
		/*
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
			System.out.println("잘못 입력하였습니다."); */
		
		switch(menu) {
		case 1:                                          
			System.out.println("입력메뉴입니다.");       
			break;
		case 2:                                          
			System.out.println("수정메뉴입니다.");      
			break;
		case 3:                                          
			System.out.println("조회메뉴입니다.");       
			break;
		case 4:                                          
			System.out.println("삭제메뉴입니다.");       
			break;
		case 7:                                          
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:                                         
			System.out.println("잘못 입력하였습니다.");
		}
	}

}
