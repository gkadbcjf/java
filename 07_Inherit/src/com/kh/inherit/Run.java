package com.kh.inherit;

public class Run {
	/*
	 *  *상속의 장점
	 *  -보다 적은 야으이 코드로 새로운 클래스 작성 가능
	 *  -코드를 공통으로 관리하기 때문에 코드의 추가나 변경이 용이(프로그램의 생산성과 유지보수성이 좋아짐)
	 *  
	 *  *상속의 특징
	 *  -클래스간의 상속에 있어서는 다중상속이 불가(즉, 부모는 하나다)
	 *  -부모클래스에 정의되어있는 protected필드는 자식클래스에서 직접접근이 가능하다.
	 *  -자식객체는 부모클래스에 있는 메소드를 마치 내것처럼 호출이 가능하다.
	 *   + 부모클래스의 정의된 기능이 맘에들지 않다면 내 마음대로 수정할 수 있다.(오버라이딩)
	 *  -명시되어있지 않지만 모든 클래스 (자바에서 제공하는 클래스, 직접만든클래스)는 Object클래스의
	 *   후손이다! - >Object클래스에 있는 메소드를 마음대로 호출이 가능하다.
	 *   -> 오버라이딩에서 재정의도 가능하다.  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t = new Tv("엘지", "t-01", "엄청얇은티비", 35000000, 65);
		Desktop d= new Desktop("삼성", "d-01", "엄청고사양테스크탑", 2600000, true);
		SmartPhone s = new SmartPhone("애플", "p-01", "아이폰", 1300000, "KT");
		
		/*
		 *  새 클래스의 공통적인 빌드와 메소드들이 존재함
		 *  이런 중복된 코드들을 따로 "부모"클래스로 한 번만 정의해두면 중복된 코드들을 줄일 수 있다.
		 *  => 수정과 같은 유지보수 요청이 들어왔을 떄 일일이 찾아서 수정할 필요 없이
		 *     한번만 정의해둔 부모클래스만 수정하면 전체적으로 반영이 된다.
		 * 
		 *  
		 */
		System.out.println(t.information());
		System.out.println(d.information());
		System.out.println(s.information());
		
	
	}
}
