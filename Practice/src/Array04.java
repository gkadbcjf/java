import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		/*
		 * "월"요일부터 "일"요일까지 요일에 대한 정보를 가지고 있는 배열을 하나 만들어 줍니다.
		 * 0~6까지의 숫자를 입력받아 해당 인덱스에 있는 요일을 출력하고 범위에 없는 숫자를 입력시
		 * 0~6사이의 숫자를 입력하세요 : 를 출력하고 다시 입력받습니다.
		 *  
		 */
		
		Scanner input = new Scanner(System.in);
		/*
		int num=0;
		char[] week = {'월','화','수','목','금','토','일'};
		System.out.print("숫자를 입력하세요 : ");
			while(true) {
				num = input.nextInt();
				int check=1;
				switch(num) {
				case 0:
					System.out.println("월요일");
					check=0;
					break;
				case 1:
					System.out.println("화요일");
					check=0;
					break;
				case 2:
					System.out.println("수요일");
					check=0;
					break;
				case 3:
					System.out.println("목요일");
					check=0;
					break;
				case 4:
					System.out.println("금요일");
					check=0;
					break;
				case 5:
					System.out.println("토요일");
					check=0;
					break;
				case 6:
					System.out.println("일요일");
					check=0;
					break;
				default:
					System.out.print("0~6까지의 숫자를 입력하세요 : ");
				
				}if(check==0)
					break;
			}
			*/
		//===============================================
			
		/*강사님코드
		  	Scanner sc =new Scanner(System.in);
			String[] week = {"일","월","화","수","목","금","토"};
			int num;
			
			System.out.print("0~6 사이 숫자 입력 : ");
			num =sc.nextInt();
			
			while( num < 0 || num >6) {
				System.out.print("0~6 사이 숫자만 입력 : ");
				num =sc.nextInt();
			}
			System.out.println(week[num]+"요(구르트)일");
		 */
		/*
		 *  문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개가 들어가 있는지
		 *  개수와 몇번쨰 인덱스에 위치하는지 인덱스를 출력하세요.
		 */
		System.out.print("문자열 입력 : ");
			String str = input.nextLine();
			char[] ch = new char[str.length()];
			for(int i=0; i<ch.length; i++) {
				ch[i] = str.charAt(i);
			}
			System.out.print("문자 입력 : ");
			char target = input.next().charAt(0);
			
			int count=0;
			
			System.out.print(str+"에 존재하는 "+target+"위치 : ");
			for(int i=0; i<ch.length; i++) {
				if(target == ch[i]) {
					count++;
					System.out.print(i+", ");
				}
				
			}
			System.out.println();
			
	
		    System.out.print(count);

	}

}
