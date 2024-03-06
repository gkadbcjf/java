
public class A_Method {
	public static void main(String[] ars) {
		//
		/*
		 * System.out.println("프로그램의 시작");
		double myHeight =172;
		hiEveryone(12,12.5); //12는 인자 (매개변수)
		hiEveryone(13,myHeight);
		byEveryone();
		System.out.println("프로그램 종료");
		
		int result;
		result =adder(4,5);
		System.out.println("4 + 5 = " + result);
		System.out.println("3.5 x 3.5 = " +square(3.5));
		
		divide(4,2);
		divide(6,2);
		divide(9, 0);
		 */
	
	
	}
	
 //여기 int ,double  반환형이라고 한다.
	//void 반환할게 없다.
	public static int adder(int num1,int num2) {
		int addResult =num1 +num2;
		int sum=1;
		return addResult;
	}
	
	public static double square(double num) {
		return num * num;
	}
	
	
	public static void divide(int num1, int num2) {
		if(num2 ==0 ) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("나눗셈 결과 : " + (num1/num2));
	}
	
	
	
	
	
	
	/*
	public static void hiEveryone(int age,double height) {
		System.out.println("제 나이는 "+age+"세 입니다.");
		System.out.println("저의 키는" + height +"cm 입니다.");
	}
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}
	*/
	
}

