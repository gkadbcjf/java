import java.util.Scanner;
import java.lang.Math;
public class A_for {
	/*
	 * <반복문>
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실헹코드를 반복적으로 수행시켜준다.
	 * 
	 * 크게 두 종류로 나뉜다( for문 / while문(do-while문) )
	 * 
	 *  for문
	 * for(초기식;조건식;증감식){    //반복 횟수를 지정하기 위헤 제시하는 것들
	 * 		반복적으로 실행시키고자하는 구문
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행하는 구문"
	 * 			(보통 반복문 안에서 사용될 변수를 선언 및 초기화하는 구문)
	 * 
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 * 			조건식이 true일 경우 해당 구문을 실행
	 *			조건식이 false가 되는 순간 반복을 멈추고 빠져나옴
	 *			(보통 초기식에 제시된 변수를 가지고 조건식을 정함)
	 *
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감연산자를 사용함)
	 * 
	 * *for을 만나는 순간
	 * 초기식 -> 조건식 검사 -> true일 경우 실행구문 실행 -> 증감식
	 * 			조건식 검사 -> true일 경우 실행구문 실행 ->증감식
	 * 			------------------해당 내용을 반복 ------------
	 * 			조건식 검사 -> false일 경우 실행구문 실행x ==>반복문 빠져나옴

	 * 
	 * tip. 알아둘점
	 *  for문 안에 초기식, 조건식, 증감식 각각 생략 가능하긴하다(단, ;은 반드시 입력)
	 */
	public static void main(String[] args) {
		/*
		//"안녕하세요" 5번 출력하세요.
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		
		for(int i = 0; i < 5; i++) { // i값이 0에서부터 4까지 매번 1씩 증가하는 동안 반복수행()
			System.out.println("안녕하세요");
		}
		*/
		
		/*
		// 1~5까지 순차적으로 출력하세요 ( 1 2 3 4 5 )
		for(int i=1; i <= 5; i++) {  // 1 2 3 4 5 
			System.out.print(i + " ");
		}
		System.out.println();
		
		//5~1까지 순차적으로 출력
		for(int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}
		*/
		
		Scanner input  = new Scanner(System.in);
		/*
		//정수 n을 입력받아 1부터 n까지 1씩 증가시키면서 출력해라
		// 정수입력 : 3
		// 1 2 3
		
		
		System.out.print("정수 입력 : ");
		int a = input.nextInt();
		for(int i=1; i<= a; i++) {
			System.out.print(i + " ");
		}
		*/
		
		//1부터 10사이의 홀수만 입력
		//1 3 5 7 9
		/*
		for(int i=1; i<10; i++) { 
			if(i %2 ==1)
			System.out.print(i +" ");
		}
		*/
		
		// 1에서부터 100까지 총 합계를 구해라
		// 방법1. 1+2+3+4+....100;
		
		// 방법2.
		/*
		 * int sum = 0;
		 * sum += 1;
		 * sum += 2;
		 * sum += 3;
		 * ...
		 * sum += 100;
		 * 
		 * 규칙을 찾자! sum변수에 누적해서 합신하는 것 반복적으로 진행됨
		 * 단, 누적해서 더하고자하는 값이 1에서부터 10까지 1씩 증가한다.
		 */
		
		/*
		int sum = 0;
		
		for(int i = 1; i < 11; i++) { // 1 2 3 4 5 6 7 8 9 10
			sum += i;
			
		}
		System.out.print("1부터 10까지의 모든 수의 합 : " + sum );
		*/
		
		//정수 n을 입력받아 1부터 n까지 1씩증가하며 모든 수를 더해서 출력해라
		//정수 입력 : 5
		// 1부터 5까지의 합 : 15
		
		/*
		int sum=0;
		System.out.print("정수 입력 : ");
		int n = input.nextInt();
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합 : %d",n,sum);
		*/
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random()메소드 호출해서 매번 다른 랜던값을 얻어낼 수 있다.
		 *
		 * Math.random() 호출시 ==> 0.0 ~ 0.999999999사이의 랜던값을 반환
		 * 
		 * int random = Math.random(); // double형이라서 안됨
		 * 
		 * int random = Math.random() * 10;
		 * 				(0.0 <=		<10.0)
		 * 
		 * int random = Math.random() * 10 + 1;
		 * 				(1.0 <= 	<11.0); => 1.0 ~ 10.99999999
		 * int rand = (int)(Math.random() * 10 + 1);
			System.out.println(rand);
		 */
		
		//random한 숫자 n을 생성해서 1부터 n까지 모두 더한 값을 출력하세요.
		//random 수 : 5
		//1~5까지의 합 : 15
		
		/*
		int sum=0;
		int n =(int)( Math.random() * 10 + 1 );
		System.out.println("random 수 : " + n);
		for(int i=1; i<=n; i++) {
			sum += i;			
		}
		System.out.printf("1~%d까지의 합 : %d",n,sum);
		*/
		
		// random(5~50)한 숫자 n을 생성해서 1부터 n까지의 숫자 중 짝수만 출력해라
		// random 수 : 10
		// 2 4 6 8 
		
		/*
		int n;
		n = (int)(Math.random() * 50 + 1);
		System.out.println("random 수 :" + n);
		for(int i=1; i< n; i++) {
			if(i % 2 == 0)
				System.out.print(i + " ");
		} */
		
		/*
		String str = "kerororr \n asda \n asd \n  a";
		 * 각 인덱스별 문자 뽑아서 출력
		 * 
		 * H => str.charAt(0)
		 * e => str.charAt(1) 
		 * l => str.charAt(2)
		 * l => str.charAt(3)
		 * o => str.charAt(4)
		 *
		 * 0번 인덱스에서부터 4번인덱스(마지막인덱스)까지 매번 1씩 증가하면서 반복 수행
		 * 
		 * 문자열.length() : 문자열의 길이를 구할 수 있다.
		 * 	for (int i = 0; i <str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		 */
			
		//사용자에게 문자열을 입력받아
		//해당 문자열의 짝수자리 글자만 출력
		//문자열을 입력 : hello
		
		/*
		System.out.print("문자열을 입력 : ");
		String str =input.nextLine();
		for(int i=0; i<str.length(); i++) {
			if(i % 2 == 1)
				System.out.print(str.charAt(i)+ " ");
		}
		*/
		
		//구구단 2단을 출력해보자
		/*
		 *  2 * 1 = 2
		 *  2 * 2 = 2
		 *  2 * 3 = 6
		 *  2 * 4 = 8
		 *  2 * 5 = 10
		 *  2 * 6 = 12
		 *  2 * 7 = 14
		 *  2 * 8 = 16
		 *  2 * 9 = 18 
		 */
		
		/*
		for(int i = 1; i < 10; i++) { 
			System.out.println("2 * "+ i + " = " + 2 * i);
		}*/
		
		//사용자로부터 단을 입력받아
		//사용자가 입력한 단을 출력하기
		//단 수(2~9)를 입력 : 3
		
		/*
		System.out.print("단 수(2~9)를 입력 : ");
		int n = input.nextInt();
		if(n >= 2 && n <= 9) {
			for(int i =1; i <= 9; i++) {
				System.out.printf("%d * %d = %d \n",n, i, n * i);
			}
		}
		else
			System.out.println("잘못 입력했습니다.");
		*/
		
		// 1 2 3 4 5 
		// 1 2 3 4 5 
		// 1 2 3 4 5 
		
		/*
		int num1,num2;  //num1 : 열 , num2 : 행
		num1 = input.nextInt();
		num2 = input.nextInt();
		for(int i= 0; i<num2; i++) {
			
			for(int j=1; j<= num1; j++) {
				System.out.print(j + " ");	
			}System.out.println();
		}
		*/
		
		/*
		for(int i =2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("|%d * %d = %d |",i,j,i*j);
				//System.out.println();
			}
			System.out.println();
		}
		*/
		
		
		
		System.out.println("                        <<구구단>>");
		
		String str= "    <%d단>";
		for(int i=2; i<6 ; i++) {
			
		  if(i ==3) {
				str = "         <%d단>";
			}
			else {

				str +=" ";
			}
		  System.out.printf(str,i);
		}
		System.out.println();
		System.out.println("|============||============||============||============|");
	
		for(int j=1;j<10;j++) {
		
			for(int i=2; i<6; i++) {
				if(i * j < 10)
					System.out.printf("| %d * %d = %d  |",i,j,i*j);
				else
					System.out.printf("| %d * %d = %d |",i,j,i*j);
						
			}
			System.out.println();
		
		}
		String str2= "     <%d단>";
		for(int i=6; i<10 ; i++) {
			
		  if(i ==7) {
				str2 = "         <%d단>";
			}
			else {
				str2 +=" ";
			}
		  System.out.printf(str2,i);
		}
		System.out.println();
		System.out.println("|============||============||============||============|");
		for(int j=1;j<10;j++) {
			for(int i=6; i<10; i++) {
				if(i * j < 10)
					System.out.printf("| %d * %d = %d  |",i,j,i*j);
				else
					System.out.printf("| %d * %d = %d |",i,j,i*j);
						
			}
			System.out.println();
		}
		System.out.println("|============||============||============||============|");
	}
		
}
