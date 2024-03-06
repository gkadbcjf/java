package week01_2day;
import java.util.Scanner;

public class Practice1 {
	/*
	 * 이름,성별, 나이,키를 사용자에게 입력받아 각각의 값을 변수에 담고 출력하세요
	 * .charAt(index) : 문자열에서 내가 원하는 index의 글자를 가져온다. 
	 * index : 몇 번째 냐
	 */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String name;char gender;
	int age;
	double tall;

	System.out.print("이름을 입력하세요 : ");
	name = input.nextLine();

	System.out.print("성별을 입력하세요(남/여) : ");
	gender =input.next().charAt(0);
	
	System.out.print("나이를 입력하세요 : ");
	age = input.nextInt();
	
	System.out.print("키를 입력하세요(cm) : ");
	tall =input.nextDouble();
	//input.nextLine();
	//System.out.print("하이 : ");
	//String arg=input.nextLine();
	System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다^^ ",tall,age,gender,name);
		

	}

}
