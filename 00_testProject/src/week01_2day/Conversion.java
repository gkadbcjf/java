package week01_2day;

public class Conversion {
	/*
	 * 형 변환
	 * 자료형을 다른 자료형으로 반환해 주는 것
	 * 
	 * 값처리 원칙
	 * 대입연산시 같은 자료형만 대입 가능하다.
	 * 일반 연산시 같은 종류의 자료형으로만 연산이 가능하다.
	 * 두가지 이상의 자료형을 연산시 결과는 한가지 자료형으로 나와야한다.
	 * 
	 * 자동형변환
	 * 두개 이상의 자료형을 연산할 떄 하나의 자료형으로 일치시켜야 연산이 가능하다.
	 * 하여 데이터 손실이 적은 방향으로 컴파일러가 직접 형변환을 해주는 것
	 * 
	 * 강제 형변환
	 * 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환하는 것
	 * 자동으로 컴파일러가 해주지 않기 때문에 프로그래머가 명시적으로 진행한다.
	 * ->데이터의 손실을 감수하고 강제 변환
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double pi =3.1415;
		 int wholeNumber=(int)pi;
		 System.out.println(pi+", "+wholeNumber);

		 long num1 = 3000000007L;
		 int num2 = (int)num1;
		 System.out.println(num1+", "+num2);
		 
		 short num11 = 1;
		 short num22 = 2;
		 short num3 =(short)(num11+num22);
		 System.out.println(num3);
	}

}
