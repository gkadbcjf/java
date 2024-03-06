import java.util.Scanner;

public class Test240119 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		// 정수형 변수 age를 입력받아 7세 이하면 어린이, 19세 이하면 청소년 20세이사이면 성인을 출력하세요.
	
		System.out.print("나이 입력 : ");
		int age =input.nextInt();
		System.out.println(age<=7 ?"어린이":age>7&&age<=19?"청소년":"성인");
		*/
		
		
		
		
		/*
		// 정수 num1,num2두 개를 입력받아 두 수 사이에 있는 3의 배수의 모든 합을 구하세요.
		int max,min, sum=0;
		System.out.print("정수 2개 입력 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		 
		max =num1>num2? num1:num2;
		min =num1<num2? num1:num2;
		for(int i = min; i<=max; i++) {
			if(i% 3==0)
				sum+=i;
		}
		System.out.println("합 : " + sum);
		*/
		
		
		
		
		
		
		
		/*
		// 정수 num1과 num2를 입력받아 두 수 사이에 있는 모든 홀수의 합과 짝수의 합을 각각 구하세요.
		System.out.print("정수 2개 입력 : ");
		int num1 = input.nextInt(); 
		int num2 = input.nextInt();
		int max, min,sum_hol=0, sum_jak=0;
		for(int i = num1<num2? num1:num2; i<=(num1>num2? num1:num2); i++) {
			if(i% 2 != 0)
				sum_hol+=i;
			else
				sum_jak+=i;
		}
		System.out.println("홀수 합 : " + sum_hol +", 짝수 합 :" +sum_jak);
		*/
		
		
		
		
		
		
		/*
		// 첫째줄에 데이터의 개수 n개를 입력받고
		// 사용자로부터 n개의 정수를 입력받아 입력받은 반대로 출력하세요.
		// ex)정수 입력  : 5
		// 숫자 입력 : 1 7 5 9 4
		// 반대로 출력 : 4 9 5 7 1
		System.out.print("정수 입력 : ");
		int n = input.nextInt();
		int []arr = new int[n];
		
		System.out.print("숫자 입력 : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] =input.nextInt();
		}
		
		System.out.print("반대로 출력 : ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		*/
		
		
		
		
		
		
		
		
	 	char [][] arr1 = new char[4][];
	 	char [] arrr = new char[5];
	
		int apb = 'a';
		System.out.print("행의 크기 : ");
		int h = input.nextInt();
		char [][]arr = new char[h][];
		for(int i=0; i<arr.length; i++) {
			System.out.print(i +"행의 열 크기 : ");
			int k = input.nextInt();
			arr[i]= new char[k];
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (char)apb;
				apb +=1;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//input.close();
		

	}

}
