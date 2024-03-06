import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/*
		 *  문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개가 들어가 있는지
		 *  개수와 몇번쨰 인덱스에 위치하는지 인덱스를 출력하세요.
		 */
		
		Scanner input =new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = input.nextLine();
		
		char arr[] = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			arr[i]= str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch = input.next().charAt(0);
		
		int count=0;
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ",str,ch);
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == ch) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.println(ch+ " 개수 : " +count);
	}

}
