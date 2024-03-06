import java.util.Scanner;

public class Test240118 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		/*
		//실수 num1과 num2를 사용자로부터 입력받아  + % / 3가지의 결과를 출력해라
		
		double num1,num2;
		System.out.print("첫 번째 숫자 입력하세요 : ");
		num1 = input.nextDouble();
		System.out.print("두 번째 숫자 입력하세요 : ");
		num2 = input.nextDouble();
		System.out.println(num1+num2);
		System.out.println(num1%num2);
		System.out.println(num1/num2);
		*/
		
		
		/*
		// 정수형 변수 num3를 사용자로부터 입력받아 100보다 작으면 100이하
		// 100보다크고 200보다 작으면 200이하
		// 200보다 크고 300보다 작으면 300이하를 출력하고
		// 그것도아니면 300초과를 출력해라
		System.out.print("정수 입력 : ");
		int num3 = input.nextInt();
		if(num3<100)
			System.out.println("100이하");
		else if(num3>100 && num3<=200)
			System.out.println("200이하");
		else if(num3>200 && num3<=300)
			System.out.println("300이하");
		else
			System.out.println("300초과");
		 */
		
		
		
		/*
		//수학, 영어, 국어 성적을 입력받아 평균이 60점이상이면 합격입니다.
		//60보다 작으면 불합격입니다. 출력
		System.out.print("수학, 영어, 국어 성적입력 : ");
		int math = input.nextInt();
		int english =input.nextInt();
		int hangle = input.nextInt();

		System.out.println((math+english +hangle)/3>=60?"합격입니다.":"불합격입니다.");
		*/
		
		
		
		/*
		//국어성적을 입력받아 50점이하는 f학점 50점초과 60점이하는 d학점
		//60점초과 70점이하는 c학점
		//70점초과 80점이하는 b학점
		//80점초과는 a학점 출력하는 프로그램을 작성해라
		System.out.print("국어성적 입력 :");
		int hangle2 = input.nextInt();
		if(hangle2 <=50)
			System.out.println("f학점");
		else if(50<hangle2 && hangle2<=60)
			System.out.println("c학점");
		else if(60<hangle2 && hangle2<=70)
			System.out.println("c학점");
		else if(70<hangle2 && hangle2<=80)
			System.out.println("c학점");
		else
			System.out.println("a학점");
	*/
		
		
		
		/*
		//크기가 9인 1차원배열 arr1을 작성하고 구구단 2단을 각 인덱스에 대입해라
		// ex) arr1[0] ="2 * 1 = 2 ;"
		String[]arr1 = new String[9];
		for(int i=0; i<arr1.length; i++) 
			arr1[i]= "2 * " + (int)(i+1) + " = " + (int)(2 * (int)(i+1));
		for(int i=0; i<arr1.length; i++)
			System.out.println(arr1[i]);
		
		
		
		//크기가 9인 1차원배열 arr2을 작성하고 구구단 3단을 각 인덱스에 대입해라
		// ex) arr2[0] ="3 * 1 = 3 ;"
		String[]arr2 = new String[9];
		for(int i=0; i<arr1.length; i++) 
			arr1[i]= "3 * " + (int)(i+1) + " = " + (int)(3 * (int)(i+1));
		*/
		
		
		
		
		//크기가 [8][9]인 2차원배열 arr3을 작성하고 구구단 2~9단을 각 인덱스에 대입해라
		// ex) arr3[0][0] ="2 * 1 = 2 ;"
		String [][]arr3 =new String[8][9];
		
		//구구단의 한 단을 배열에 저장하는 반복문
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				int dan = i + 2;
				int su = j + 1;
				arr3[i][j] = dan + " * " + su + " = " + 
						dan * su;
			}
			
		}
		for(int i=0; i<arr3.length; i++) {
			System.out.println("===" + (i+2) + "단======");
			for(int j=0; j<arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
			}
			System.out.println();
		}
		

	}

}
