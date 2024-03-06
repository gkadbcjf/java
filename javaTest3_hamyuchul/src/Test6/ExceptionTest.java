package Test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("정수 입력: : ");
		int num =input.nextInt();
		
		Calculator cc =new Calculator();

		double sum_1=cc.getSum(num);
		if(sum_1 ==-1) {
			System.out.println(new InvalidException("입력 값에 오류가 있습니다."));
			
		}
		else
			System.out.println("결과 값 : " + sum_1);
		
	}

}
