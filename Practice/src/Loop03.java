import java.util.Scanner;

public class Loop03 {

	public static void main(String[] args) {
		/*
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("숫자 : ");
			num = input.nextInt();
			if(num>10)
				System.out.println("9이하의 숫자를 입력해주세요.");
			else if(num<1)
				System.out.println("1이상 입력해주세요..");
			else
				break;
		}
		
		for(int i=num; i<10; i++) {
			System.out.printf("=====%d===== \n",i);
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d \n",i,j,i*j);
			}
		}*/
		
		
		/* 가로로
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("숫자 : ");
			num = input.nextInt();
			if(num>10)
				System.out.println("9이하의 숫자를 입력해주세요.");
			else if(num<1)
				System.out.println("1이상 입력해주세요..");
			else
				break;
		}
		
		for(int i=num; i<10; i++) {
			System.out.printf("=====%d===== ",i);
		}
		System.out.println();
		for(int i=1; i<10; i++) {
			for(int j=num; j<10; j++) {
				if(i*j<10)
					System.out.printf("%d * %d = %d   ",j,i,i*j);
				else
				System.out.printf("%d * %d = %d  ",j,i,i*j);
			}
			System.out.println();
		}
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		//잘못된 값이 입력되었을 때 반복해서 다시 입력
		while(dan>9 || dan <1) {
			System.out.println("1이상 9이하의 숫자만 입력해주세요 : ");
			dan =sc.nextInt();
		}
		
		for(int i= dan; i<= 9; i++) { 
			System.out.println("====="+i+"단=====");
			for(int j= 1;j <=9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}
	
}
