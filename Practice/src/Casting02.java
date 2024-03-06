import java.util.Scanner;

public class Casting02 {

	public static void main(String[] args) {
		//실수형으로 국어, 영어, 수학 세과목의 점수를 입력받아 총점과 평균을 출력하세요.
		//이 때 총점과 평균의 정수형으로 처리하세요.
		
		/*
		 * ex.
		 * 국어 : 90.0
		 * 수학 : 90.0
		 * 영어 : 90.0
		 * 
		 * 총점 : 270
		 * 평균 : 90
		 */
		Scanner  input = new Scanner (System.in);
		double korean, math, english;
		int sum, avg;
		System.out.print("국어 : ");
		korean = input.nextDouble();
		System.out.print("수학 : ");
		math = input.nextDouble();
		System.out.print("영어 : ");
		english = input.nextDouble();
		sum =(int)(korean +math+english);
		avg = sum /3;
		System.out.println("총점 : "+ sum);
		System.out.println("평균 : " + avg);

	}

}
