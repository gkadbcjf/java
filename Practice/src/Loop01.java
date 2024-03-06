import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		while(true) {
		
			int num = input.nextInt();
		
			if(num >= 1) {
				for(int i=1; i<=num; i++) {
					System.out.print(i+" ");
				}break;
			}
			else
				System.out.print("1이상의 숫자를 입력해주세요 : ");
		}
		//////////////////////////////////
		int num;
		System.out.println("1이상의 숫자를 입력하세요 : ");
		num = input.nextInt();
		
		while(num<1) {
			System.out.println("1이상의 숫자를 입력해주세요 : ");
			num = input.nextInt();
		}
		for(int i=0; i<=num; i++) {
			System.out.print(i + " ");
		}
		
	}

}
