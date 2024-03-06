import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = input.nextInt();
		int []arr = new int[num];
		int sum=0;
		for(int i=0; i<arr.length; i++) { 
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
			arr[i] = input.nextInt();
			sum+=arr[i];
		}

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.print("총합 : "+sum);
	}

}
