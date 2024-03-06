import java.util.Scanner;

public class Loop04 {

	public static void main(String[] args) {
		/*
		Scanner input = new Scanner(System.in);
		String str;
		int num1,num2;
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			str =input.nextLine();
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("정수1 : ");
			num1 = input.nextInt();
			System.out.print("정수2 : ");
			num2 = input.nextInt();
			input.nextLine();
			
			if(str.equals("+"))
				System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			else if(str.equals("-"))
				System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
			else if(str.equals("*"))
				System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
			else if(str.equals("/")) {
				if(num2 <=0)
					System.out.println("0으로 나눌 수 없습니다.\n");
				else
					System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
			}
			else if(str.equals("%"))
				System.out.printf("%d %% %d = %d\n",num1,num2,num1%num2);
		
			else
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
		}*/
		//=================================================================
		
		Scanner sc = new Scanner(System.in);
		String str;
		int num1,num2;
		while(true) {
		System.out.print("연산자(+, -, *, /, %) : ");
		str = sc.next();
		if(str.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		System.out.print("정수1 : ");
		num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		num2 = sc.nextInt();
		
		switch(str) {
		case"+":
			System.out.println(num1 +" + "+num2+" = "+(num1+num2));
			break;
		case"-":
			System.out.println(num1 +" - "+num2 + " = "+(num1-num2));
			break;
		case"*":
			System.out.println(num1 +" * "+num2+" = "+(num1*num2));
			break;
		case"/":
			if(num2 ==0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				break;
			}
			System.out.println(num1 +" / "+num2+" = "+(num1/num2));
			break;
		case"%":
			System.out.println(num1 +" % "+num2+" = "+(num1%num2));
			break;
		default:
			System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				
		}
	
		}
		
	}

}
