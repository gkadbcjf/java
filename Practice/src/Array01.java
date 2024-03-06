import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자에게 입력받은 양의 정수만큼 배열의 크기를 할당하고
		//1부터 입력받은 값까지 배열에 초기화한 후 출력하세요.
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int []arr =new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
