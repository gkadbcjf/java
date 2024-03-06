import java.util.Scanner;

public class Test240117 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		//사용자로부터 정수형 변수 num1과 num2를 입력받아 큰 값에서 작은 값을 뺀 결과를 출력하세요.
		
		int num1 =input.nextInt();
		int num2 =input.nextInt();
		System.out.println(num1>num2?num1-num2:num2-num1);
		
		//85에서 10까지 수를 1씩 줄여가며 모든 사이에 숫자를 출력하세요.
		for(int i=85; i>9; i--) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		*/
		
/*
		//임의의 숫자 하나(1~5)를 생성하고 이를 맞추는 프로그램 작성
		//몇 번만에 맞췄는지를 출력하세요.
		//ex)
		//컴퓨터가 생각하는 수는 : 4(사용자입력)
		//컴퓨터가 생각하는 수는 : 2(사용자입력)
		//정답입니다 2번만에 맞추셨습니다.
		int target =1;
		int compu = (int)(Math.random()*5 +1);
		while(true) {
			System.out.print("컴퓨터가 생각하는 수는 : ");
			int user =input.nextInt();
			if(compu == user) {
				System.out.printf("정답입니다. %d번만에 맞추셨습니다.",target);
				break;
			}
			else
				target++;
		}
		
		
		/*
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		//순서대로 대입하고 그 값을 출력하세요.
		int[] len = new int[10];
		for(int i=0; i<len.length; i++) {
			len[i] = i+1;
		}
		for(int i=0; i<len.length; i++) {
			System.out.print(len[i]+" ");
		}
	*/
		
		/*
		//로또 추첨 번호를 예상하는 프로그램 작성
		//임의의 숫자를 1에서 45까지 총 6개 추첨하여 당첨번호를 구합니다.
		//중복된 숫자는 있으면 안된다.
		int[] num = new int[6];
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45 +1);
			for(int j=0; j<i; j++) {
				if(num[i] == num[j]) {
					System.out.println("중복발견!!");
					num[i]= (int)(Math.random()*45 +1);
					System.out.printf("%d번째 %d를 %d로 변경합니다. \n",i+1,num[j],num[i]);
					
				}
			} //33 13 33
			
		}
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}	
		
		System.out.println("중복발견!!");
		System.out.printf("%d번째 %d를 %d로 변경합니다. \n",i+1,num[j],num[i]);
		*/

		
		/*
		int []arr =new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*6+1);
			if(i>0) {
				for(int j=0; j<i; j++) {
					if(arr[i]==arr[j]) {
						i--;
						break; 
					}
				}
			}
		}
		
		// 2 1 5 2
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		*/
		
		
		//로또 추첨 번호를 예상하는 프로그램 작성
		//임의의 숫자를 1에서 45까지 총 6개 추첨하여 당첨번호를 구합니다.
		//중복된 숫자는 있으면 안된다.
		int[] arr =new int[6];
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*6+1);
			if(i>0) {
				for(int j=0; j<i; j++) {
					if(arr[i] == arr[j]) {
						i--;
						break;
					}
				}
			}
		}
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+ " ");
		
	}
}
