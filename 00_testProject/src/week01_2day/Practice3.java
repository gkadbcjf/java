package week01_2day;
import java.util.Scanner;

public class Practice3 {
	/*
	 * 키보드로 가로, 세로 값을 실수형으로 입력받아 사각혀으이 면적과 둘레를 계산하여 출력하세요.
	 * 공식) 면적 : 가로 * 세로
	 *      둘레 : (가로+세로)*2
	 */
	public static void main(String[] args) {
//		Scanner input =new Scanner(System.in);
//		System.out.print("가로 : ");
//		double num1 =input.nextDouble();
//		System.out.print("세로 : ");
//		double num2 =input.nextDouble();
//		System.out.println("면적 :"+ (num1*num2));
//		System.out.println("둘레 :"+2*(num1+num2));
		
		Scanner sc =new Scanner(System.in);
		float width,height;
		System.out.print("가로 : ");
		width =sc.nextFloat();
		
		System.out.print("세로 : ");
		height = sc.nextFloat();
		
		//System.out.println("면적 : "+(width *height));
		//System.out.println("둘레 : "+2*(width+height));
		System.out.printf("면적 : %.3f \n",width*height);
		System.out.printf("둘레 : %.3f",2*(width+height));
	}

}
