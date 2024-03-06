import java.util.Scanner;

public class ControllAndLoop01 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 문자열을 입력받고 문자열의 검색될 문자를 입력받아 해당문자가 몇 개 있는지 출력하세요.
		 * 그리고 다시하시겠습니까? : 표시해준 뒤 y를 입력하면
		 * 다시 반복하고 다른문자를 입력하면 종료
		 * 
		 * 문자열 : banana
		 * 문자 : a
		 * banana안에 포함된 a의 개수 : 3
		 * 다시 하시겠습니까?(y/n) : y
		 * 
		 * 문자열 : banana
		 * 문자 : a
		 * banana안에 포함된 a의 개수 : 3
		 * 
		 */
		Scanner input = new Scanner(System.in);
		char check=' ';
		do {
			
			System.out.print("문자열 : ");
			String str = input.next();
				
			System.out.print("문자 : ");
			char apb = input.next().charAt(0);
			
			
			int count =0;
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) == apb) {
					count++;
				}
			}
			System.out.printf("%s안에 포함된 %c의 개수 : %d \n",str,apb,count);
			System.out.print("다시 하시겠습니까?(y/n) : ");
			 check = input.next().charAt(0);
		
		}while(check !='n');

	}

}
