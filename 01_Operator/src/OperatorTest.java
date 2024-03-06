public class OperatorTest {

	public static void main(String[] args) {
		int num1 =7;
		int num2 =3;
//		System.out.println(" num1/num2 = "+ (num1/num2));
//		System.out.println(" num1/num2 = " + (7.0/3)); 
		
		num1 +=num2;  // num1 = num1 + num2
					  // num1 = 7 + 3 복합대입연산자..★
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1 %= num2; // num1 = num1 % num2;
					  // num1 = 7 % 3;
		
		System.out.println(num1);
		System.out.println(num2);
		
		
	 	// ++num 전위연산일 경우 먼저 연산진행 후 코드실행
		// num++ 후위연산일 경우 먼저 코드실행 후 연산진헹
		System.out.println();
		int num3 =0;
		System.out.println(num3++);
		System.out.println(++num3);
		System.out.println(num3--);
		System.out.println(--num3);
	}

}
