import java.util.Random;
import java.util.Scanner;

public class Test240116 {

	public static void main(String[] args) {
		//정수형 변수 num1, num2를 사용자로부터 입력받아
		// + - * / % 의 결과값을 각각 출력하세요.
		Scanner input = new Scanner(System.in);
/*		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.printf("%d + %d = %d \n",num1,num2, num1+num2);
		System.out.printf("%d - %d = %d \n",num1,num2, num1-num2);
		System.out.printf("%d * %d = %d \n",num1,num2, num1*num2);
		System.out.printf("%d / %d = %d \n",num1,num2, num1/num2);
		System.out.println(num1 +" % "+num2 +" = "+(num1%num2)); */ //%%
		
		//가위바위보를 진행합니다. user1의 가위,바위,보 정보와
		//user2의 가위,바위,보 정보를 받아 누가 이겼는지 출력하세요.
		//가위바위보 정보는 숫자로 입력받습니다(가위 =1,바위=2,보=3)

/*		System.out.print("user1의 가위바위보 (가위=1,바위=2,보=3) : ");
		int user1 = input.nextInt();
		System.out.print("user2의 가위바위보 (가위=1,바위=2,보=3) : ");
		int user2 = input.nextInt();
		if(user1 > user2) {
			if(user1 == 3 && user2 ==1)
				System.out.println("user2가 이겼습니다!");
			else 
				System.out.println("user1이 이겼습니다!");
		}
		else if(user1 < user2) {
			if(user1 == 1 && user2 ==3)
				System.out.println("user1가 이겼습니다!");
			else 
				System.out.println("user2이 이겼습니다!");
		}
		else
			System.out.println("비겼습니다!");
		*/
		
		
		//15~111까지의 수를 순서대로 출력하세요
		
		/*for(int i=15; i<112; i++) {
			System.out.print(i + " ");
		}*/
		
		
		//숫자를 입력받아 * 2인 숫자를 출력하세요.
		//유저가 숫자가 0을 입력할 때까지 반복하세요.
		/*int n=0;
		while(true) {
			System.out.print("숫자 입력(0입력시 종료) : ");
			n = input.nextInt();
			if( n == 0)
				break;
			System.out.println(n * 2);
		}
		*/
		
		
		//user3의 가위바위보 정보를 입력받고
		//컴퓨터의 랜덤한 가위바위보 정보를 생성해
		//누가 이겼는지 출력하세요
		//가위바위보 정보는 숫자로 입력받습니다(가위 =1,바위=2,보=3)
		//해당 행위를 user3이 5를 입력받을 때까지 반복하세요.
		


		//user3의 가위바위보 정보를 입력받고
		//컴퓨터의 랜덤한 가위바위보 정보를 생성해
		//누가 이겼는지 출력하세요
		//가위바위보 정보는 숫자로 입력받습니다(가위 =1,바위=2,보=3)
		//해당 행위를 user3이 5를 입력받을 때까지 반복하세요.
		
		int user3,compu;
		while(true) {
			System.out.print("가위바위보를 입력하세요(가위=1,바위=2,보=3, 종료=5):");
			user3 = input.nextInt();
			if(user3 == 5) {
				System.out.println("가위바위보를 종료합니다.");
				break;
			}
			compu=(int)(Math.random()*3+1);
			if(user3 >compu && user3<4 ) {
				System.out.println((user3==3&&compu==1)?"컴퓨터가 이겼습니다! [ computer : " + compu +" ] \n"
						:"유저가 이겼습니다★ [ computer : " + compu+" ]\n"+ "");
			}
			else if(user3 <compu && user3 >0) {
				System.out.println((user3 ==1 && compu ==3)?"유저가 이겼습니다★ [ coumputer : " + compu +" ] \n"
						:"컴퓨터가 이겼습니다! [ computer : " + compu+" ]\n");
			}
			else if(user3==compu)
				System.out.println("무승부입니다!\n");
			else
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.\n");
		}
		
		
		
	}

}
