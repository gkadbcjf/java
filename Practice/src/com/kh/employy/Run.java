package com.kh.employy;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		new EmployeeMenu().EmployeeMainMenu();
		
		  
	
//		Scanner input = new Scanner(System.in);
//		Employee[] emList = new Employee[100];
//		
//		/*
//		1. 사원추가 9. 프로그램 종료 메뉴 번호를 누르세요 : (정수하나 입력받기)	*/
//	
//		
//		int number;
//		int count=0;
//		while(true) {
//		System.out.println("1. 사원추가");
//		System.out.println("9. 프로그램 종료");
//		System.out.print("메뉴 번호를 누르세요 : ");
//
//		number = input.nextInt();
//
//		switch (number) {
//		case 1:
//			/*
//			 * 사원번호, 이름, 성별, 휴대폰번호, 
//			 * 추가 정보를 더 입력하시겠습니까?(y/n) 
//			 * y일때만 부서, 연봉, 보너스율 입력받고 
//			 * 해당 데이터를 활용하여 사원추가
//			 */
//			
//			System.out.print("사원 번호 : ");
//			String empNo = input.next();
//			System.out.print("이름 : ");
//			String name = input.next();
//			System.out.print("성별 : ");
//			char gender = input.next().charAt(0);
//			System.out.print("휴대폰 번호 : ");
//			String phone = input.next();
//			
//			System.out.print("추가 정보를 더 입력하시겠습니까(y/n) : ");
//			char yn = input.next().toLowerCase().charAt(0);
//			
//			if(yn =='y') {
//				System.out.print("부서 : ");
//				String dept = input.next();
//				System.out.print("연봉 : ");
//				String salary = input.next();
//				System.out.print("보너스율 : ");
//				double bonous = input.nextDouble();
//	
//				emList[count++] = new Employee(empNo, name, gender, phone, dept, yn, bonous);
//					
//			}
//			else {
//				emList[count++] = new Employee(empNo, name, gender, phone);
//			}
//			
//			
//			
//			break;
//		case 9:
//		
//		}
//		} 

		// number라는 변수에 int형 값을 하나 입력받아 출력해라
		/*
		 * Scanner input =new Scanner(System.in);
		 * 
		 * 
		 * //입력받은 값 number가 100보다 작은 정수이면 "100이하" 출력 //100이면 "100" 100이상이면
		 * "100을 초과하였습니다. 다시 입력해주세요."를 출력한 후 //100이하가 입력될 때 까지 반복한다. int number=0;
		 * while(true) { System.out.print("번호 입력  : "); number = input.nextInt();
		 * if(number<=100) { System.out.println((number<100)?"100이하":100); break; } else
		 * System.out.println("100을 초과하였습니다. 다시 입력해주세요,"); }
		 * 
		 * //1부터 입력받은 number까지의 값을 전부 더한 값을 구해라 //ex) number = 5 1+2+3+4+5 =>15출력 int
		 * sum=0; System.out.print("number = "); for(int i=1; i<=number; i++) { sum+=i;
		 * if(i ==number) { System.err.println(i +" => "+sum); } else System.out.print(i
		 * +" + "); }
		 * 
		 * //길이가 100인 int형 1차원배열 arr을 생성하고 //1~number까지의 수를 순서대로 배열에 저장하고 출력해라
		 * 
		 * int[] arr = new int[100]; for(int i=1; i<=number; i++) { arr[i-1] = i; }
		 * for(int i=0; arr[i] != 0; i++) { System.out.print(arr[i]+" "); }
		 * 
		 * 
		 * //Employee클래스를 작성해라 //empNo(int) name(String) gender(char) phone(String)
		 * //getter/setter 및 toString 작성
		 * 
		 * //Employee를 담을 수 있는 길이가 5인 객체배열을 생성하고 임의에 값으로 객체5개를 생성해 //각 배열의 인덱스 값을 초기화해라
		 * Employee[] arr_emp = new Employee[5]; arr_emp[0] = new Employee("삼성", "함유철",
		 * 'M', "010-5314-1412"); arr_emp[1] = new Employee("구글", "유철함", 'M',
		 * "010-3013-2024"); arr_emp[2] = new Employee("애플", "유함철", 'M',
		 * "010-1114-1999"); arr_emp[3] = new Employee("카카오", "철유함", 'M',
		 * "010-0202-1950"); arr_emp[4] = new Employee("현대", "함철유", 'M',
		 * "010-3737-1987");
		 */

	}

}
