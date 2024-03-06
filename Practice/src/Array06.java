import java.util.Scanner;

public class Array06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		int num;
		while(true) {
			System.out.print("정수 : ");
			num = input.nextInt();
			if( num % 2 != 0 &&num>2) 
				break;
			else
				System.out.println("다시 입력하세요.");
		}
		int []arr =new int[num];
		for(int i=0; i<arr.length/2; i++) {
			arr[i] =i+1;
		}
		for(int i=0; i<arr.length/2+1; i++) {
			arr[arr.length/2+i]=arr.length/2-i+1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	
		 */
		
		System.out.println("정수 : ");
		int num =input.nextInt();
		int[]arr =new int[num];
		int mid = num /2;
		int count =0;
		/*
		arr[0]=1;
		for(int i=1; i<=mid; i++) {
			arr[i] =arr[i-1] + 1;
		}
		for(int i= mid+1; i<arr.length; i++) {
			arr[i] =arr[i-1]-1;
		}
		*/
		for(int i = 0; i<arr.length; i++) {
			if(i<=mid) {
				arr[i] = ++count;
			}
			else {
				arr[i] = --count;
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
