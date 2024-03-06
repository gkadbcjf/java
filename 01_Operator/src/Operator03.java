
public class Operator03 {
	/*
	 * 산술연산자 (이항 연산자 == 두 개의 값을 가지고 연산한다)
	 * + - * / %
	 * 
	 * * / % > + - 
	 * 
	 * 복합 대입 연산자
	 * 산술연산자와 대입 연산자가 결합되어있는 형태
	 * 연산처리 속도가 빨라지므로 사용하는 걸 권장!
	 * 
	 * += -= /= *= %=
	 * 
	 * a = a + 3    =>    a += 3;
	 * a = a - 3    =>    a -= 3;
	 * a = a * 3    =>    a *= 3;
	 * a = a / 3    =>    a /= 3;
	 * a = a % 3    =>    a %= 3;
	 */
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		int c = (++a) +b; //16
		int d = c / a;  //16/6 =2
		int e = c % a; // 4
		int f = e++; // 4  e=5
		int g = (--b) + (d--); //9 +2 =11   d=1,b=9
		int h = 2; 
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);  //6+ 9/(15/4)*(11-1)%(6+2)=>6+6=12
		//a=7, b=9 , c=15 d=1, e=6, f=4, g=10, h=2 i=12
		
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b);
//		System.out.println(a % b);
		System.out.println("a : " + a); //7
		System.out.println("b : " + b); //9
		System.out.println("c : " + c); //15
		System.out.println("d : " + d); //1
		System.out.println("e : " + e); //6
		System.out.println("f : " + f); //4
		System.out.println("g : " + g); //10
		System.out.println("h : " + h); //2
		System.out.println("i : " + i); //12
		

	}

}
