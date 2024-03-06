import java.util.Scanner;

public class Loop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1,num2;
		
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			num1 = input.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = input.nextInt();
			if(num1 <1 || num2<1 ) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
			else 
				break;
		}
		
		for(int i=(num1<num2?num1:num2); i<=((num1>num2)?num1:num2); i++) { 
			System.out.print(i+" ");
		}
		
		//=====================================================
		/*
		Scanner sc =new Scanner(System.in);
		int num3,num4,min,max;
		System.out.println("첫 번째 숫자 : ");
		num3 = sc.nextInt();
		
		while(num3<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			num3 =sc.nextInt();
		}
		
		System.out.println("두 번째 숫자 : ");
		num4 = sc.nextInt();
		
		while(num4 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			num4 = sc.nextInt();
		}
		
		min=(num3 <num4 ? num3 : num4);
		max=(num3 >num4 ? num3 : num4);
		
		for(int i=min; i<=max; i++) {
			System.out.println(i+ " ");
		}
		*/
	}

}
