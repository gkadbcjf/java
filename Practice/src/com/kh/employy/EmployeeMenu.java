package com.kh.employy;

import java.util.Scanner;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();

	//메인화면을 출력하는 메소드
	public void EmployeeMainMenu() {
		int number;
		int count = 0;
		while (true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원전체 출력");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 찾기");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");

			number = sc.nextInt();
			sc.nextLine();
			switch (number) {
			case 1:
				/*
				 * 사원번호, 이름, 성별, 휴대폰번호, 추가 정보를 더 입력하시겠습니까?(y/n) y일때만 부서, 연봉, 보너스율 입력받고 해당 데이터를
				 * 활용하여 사원추가
				 */
				this.insertEmp();

				break;
			case 2:
				this.printEmp();
				break;
			case 3:
				deleteEmp();
				break;
				/*
				 * 전체 사원을 출력->
				 * 삭제할 사원의 사원번호를 입력해주세요. : ?
				 * 몇 번째 사원을 삭제하시겠습니까?
				 * 
				 * 
				 * 정말 삭제하시겠습니까?(y/n)
				 * y => 가장 최근에 등록된 사원을 삭제하고
				 * 삭제된 사원 정보 : 정보 출력
				 * n을 누르면 그대로 다시 돌아옵니다.
				 */
			case 4:
				findEmp();
				break;
			case 9:
				System.out.println("프로그램종료");
				return;
			default : 
				System.out.println("잘못입력했습니다.");
				//break;
			
			}
		}
	}
	
	//회원을 추가하기위한 매소드
	public void insertEmp() {
		System.out.print("사원 번호 : ");
		String empNo = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		System.out.print("휴대폰 번호 : ");
		String phone = sc.next();
		
		System.out.print("추가 정보를 더 입력하시겠습니까(y/n) : ");
		char yn = sc.next().toLowerCase().charAt(0);
		sc.nextLine();
		
		if (yn == 'y') {
			System.out.print("부서 : ");
			String dept = sc.next();
			System.out.print("연봉 : ");
			int salary = sc.nextInt();
			System.out.print("보너스율(소수점으로) : ");
			double bonous = sc.nextDouble();

			ec.insert(empNo, name, gender, phone, dept, salary, bonous);

		} else {
			ec.insert(empNo, name, gender, phone, "부서없음", 0, 0.0);
		}

	}
	
	public void printEmp() {
		System.out.println("================ 사원목록 ================");
		ec.print();
	}
	
	public void deleteEmp() {
//		System.out.print("정말 삭제하시겠습니까?(y/n)");
//		char yn = sc.next().toLowerCase().charAt(0);
//		if( yn == 'y') {
//			ec.delete();
//		}
		this.printEmp();
		System.out.print("삭제할 사원의 번호를 입력해주세요. : ");
		String epno = sc.next();
		ec.deleteEmpNo(epno);
			
	}
	
	public void findEmp() {
		System.out.print("정보를 출력할 사원의 사번을 입력하세요 : ");
		String str_emp = sc.next();
		ec.findEmpNo(str_emp);
		
		
			 
	}
}
