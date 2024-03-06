
public class Casting03 {

	public static void main(String[] args) {
		//선언및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+,-,*,/)과 형변환을 이용하여
		//다음과 같은 값이 나오도록 코드를 작성하세요.
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum =3.0f;
		double dNum = 2.5;
		char ch = 'A';
		System.out.println((int)dNum);  //2
		System.out.println(iNum1/iNum2);  //2

		System.out.println((double)iNum1);	//10.0
		System.out.println(iNum2*dNum);
		
		System.out.println(dNum);	//2.5
		System.out.println((double)iNum1/iNum2);
		
		System.out.println((int)fNum);	//3
		System.out.println((int)(iNum1/fNum));

		System.out.println(iNum1/fNum);	//3.333333
		System.out.println((double)iNum1/fNum);//3.333333333333333335
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(ch+iNum1);
		System.out.println((char)(ch+iNum1));
		
		
		
		
		

	}

}
