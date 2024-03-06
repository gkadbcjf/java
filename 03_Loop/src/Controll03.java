import java.util.Scanner;

public class Controll03 {

	public static void main(String[] args) {
		//아이디와 비밀번호를 입력받아 지정해둔 아이디와 비밀번호와 비교해서
		//로그인 성공 시 로그인 성공
		//아이디가 틀렸을 시 "아이디가 틀렸습니다."
		//비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다."를 출력하세요
	
		Scanner input = new Scanner(System.in);
		String id = "myId";
		String pswd = "myPassward";
		String id2,pswd2;
		System.out.println("아이디 입력 : ");
		id2 = input.nextLine();
		System.out.println("비밀번호 입력 : ");
		pswd2 =input.nextLine();
		
	

		
		/*
		String id ="myId";
		String pwd ="myPassword";
		String id2="";
		String pwd2="";
		Scanner input = new Scanner(System.in);
		
		while(!pwd2.equals(pwd)  && !id2.equals(id)) {
		System.out.print("아이디 : ");
		id2 = input.nextLine();
		
		System.out.print("비밀번호 : ");
		pwd2 =input.nextLine();
		if(id2.equals(id)) {
			if(pwd.equals(pwd2)) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		}
		*/
		
		
		
	}

}
