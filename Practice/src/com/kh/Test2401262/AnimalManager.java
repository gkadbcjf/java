package com.kh.Test2401262;

public class AnimalManager {
	/*
	 * 추상클래스
	 * - 미완성된 클래스
	 * - 객체생성이 불가(단, 레퍼런스 변수(참조변수)선언이 가능)
	 * - 일반필드 + 일반메소드 [+추상메소드]
	 * => 추상메소드를 가진 클래스는 반드시 추상클래스로 명시해야 됨
	 * 
	 * * 추상메소드가 궃이 없어도 추상클래스를 사용할 수 있을까?
	 *  > 개념적 : 단지 이 클래스가 미완성된 클래스다 라는 걸 알리기 위해서
	 * 	> 프로그래밍적 : 객체 생성이 불가 하게끔 하고자 할 때
	 * 
	 * * 추상메소드가 있는 추상클래스를 사용하는 이유
	 * - 부모클래스에서 추상메소드가 존재할 경우
	 * 	 자식클래스에서는 강제로 오버라이딩헤서 동일한 패턴의 메소드를 가지게 한다.
	 *   => 각 자식 클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면 할 때
	 *   
	 */
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Animal[] animal =new Animal[5];
		animal[0] = new Dog("뽀삐","골든리트리버",10); //이름 종 몸무개
		animal[1] = new Cat("망고","짬타이거","군대","노랑");  //이름 종 위치 색깔
		animal[2] = new Dog("유노웟","블랙더그",5);
		animal[3] = new Cat("암썡","블랙타이거","후드","검정");
		animal[4] = new Cat("빠끄스컬~","랩고양이","이태원","연두색");
//		for(int i=0; i<animal.length; i++) {
//			animal[i].speak();
//		}
		for(Animal a : animal) {
			a.speak();
		}
	}

}
