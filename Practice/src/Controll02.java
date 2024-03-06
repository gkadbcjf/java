import java.util.Scanner;

public class Controll02 {

	public static void main(String[] args) {
		//실수형으로 국어, 영어, 수학 세과목의 점수를 입력받아 총점과 평균을 계산하고
		//합격인지 불합격인지 나타내는 프로그램을 작성하세요.
		//(합격 조건 : 세과목 점수가 각각 40점 이상 그리고 평균이 60점이상일 경우)
				
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
				int korean, math, english, sum;
				double avg;
				System.out.print("국어 : ");
				korean = input.nextInt();
				System.out.print("수학 : ");
				math = input.nextInt();
				System.out.print("영어 : ");
				english = input.nextInt();
				sum =korean+math+english;
				avg = sum /3;
				if(korean >=40 && math>=40 && english>=40 &&avg>=60) {
					System.out.println("국어 : "+ korean);
					System.out.println("수학 : "+ math);
					System.out.println("영어 : "+ english);
					System.out.println("합계 : "+ sum);
					System.out.println("평균 : " + avg);
					System.out.println("축하합니다, 합격입니다.");
				}
				else
					System.out.println("불합격입니다.");
				
				
	}

}
