import java.util.Scanner;

public class Controll04 {

	public static void main(String[] args) {
		/*
		 * 사용자가에게 관리자,회원, 비회원 중 하나를 입력받아 각 등급이 행할 수 있는 권한을 출력하세요.
		 * 단, 관리자는 회원관리, 게시글관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		 * 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		 * 비회원은 게시글 조회만 가능합니다.
		 * 
		 * ex
		 * 권한일 확인하고자 하는 회원 등급 : (관리자)
		 * 회원관리, 게시글관리, 게시글 작성, 게시글 조회, 댓글 작성
		 */
		

		
		/*
		 Scanner input = new Scanner(System.in);
		String grade,str="";
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		 grade = input.nextLine();
		if(grade.equals("관리자")) {
	
			System.out.println("회원관리, 게시글관리, 게시글 작성, 게시글 조회, 댓글 작성");
		}
		else if(grade.equals("회원")) {
			
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}
		else if(grade.equals("비회원")) {

			System.out.println("게시글 조회");
		}
		else
			System.out.println("잘못입력했습니다.");
			*/
		/*
		switch(grade) {
		case "관리자" : 
			str +="회원관리,게시글관리"; 
			
		case "회원" :
			str +=(str.equals("")?"":", ")+"게시글 작성, 댓글 작성";
			
		case "비회원" : 
			str += (str.equals("")?"":",") +"게시글 조회";
			break;
		default :
			System.out.println("잘못입력했습니다.");
		}
		System.out.println(str);
		*/
		
		
		/* 단, 관리자는 회원관리, 게시글관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		 * 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		 * 비회원은 게시글 조회만 가능합니다.*/
	     
		 
		 
	}

}
