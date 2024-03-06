import java.util.Scanner;

public class A_if02 {

	public static void main(String[] args) { //main메소드 영역
		Scanner input =new Scanner(System.in);
		//나이를 입력받아
		// 13세 이하 : 어린이
		// 13세 초과 19세 이하: 청소년
		// 19세 초과 : 성인
		// xx세는 xxx에 속합니다.
		
		/*	
		int age;
		String type;
		System.out.print("나이(정수만) : ");
		age = input.nextInt();
		*/
		
		//if문만 이용해서
		/*if(age <= 13) {
			type ="어린이";
		}
		if(age >= 13 && age <=19) {
			type ="청소년";
		}
		if (age > 19){
			type="성인";
		}
		*/
		
		
		/*
		if(age <= 13) {
			type ="어린이";
		}
		else if(age <= 19 && age >13) {
			type = "청소년";
		}
		else type ="성인";
		
		System.out.println(age +"세는 " + type+"에 속합니다.");
		*/
		
		//=========================================================
		
		//성별을 (m/f)(대소문자 상관없음)로 입력받아 남학생인지 여학생인지
		//출력하는 프로그램을 작성하세요
		//성별(m/f) :
		//여학생입니다 / 남학생입니다 / 잘못입력하셨습니다.
		
		/*
		char gender;
		System.out.print("성별(m/f) : ");
		gender = input.next().charAt(0);
		
		if(gender == 'f' || gender == 'F') {
			System.out.println("여학생입니다.");
		}
		else if(gender =='m' || gender == 'M') {
			System.out.println("남학생입니다.");
		}
		else {
			System.out.println("잘못입력하셨습니다.");
			return; //해당 메소드 자체를 빠져나간다.
		}
		*/
		
		//=============================================================
		
		//정수(양수)를 입력받아
		//짝수인지 홀수인지 출력하는 프로그램 작성
		//정수(양수) 입력 : ()
		//짝수다 / 홀수다 / 양수가 아닙니다. 잘못입력하셨습니다.
		
		 int num;
		System.out.print("정수(양수) 입력 : ");
		num = input.nextInt();
		if(num > 0 ) {
			if( num % 2 ==0) {
				System.out.println("짝수다.");
			}
			else
				System.out.println("홀수다.");	
		}
		else
			System.out.println("잘못입력하셨습니다."); 
	
	
		
	
	}

}
