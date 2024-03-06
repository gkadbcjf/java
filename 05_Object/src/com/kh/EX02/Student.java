package com.kh.EX02;
//이름 나이 수학점수 영어점수 국어점수를 데이터로 가지고있는 객체를 만들기위한
		//클래스를 작성해라
		//데이터는 직접 접근을 허용하지않고 모두 간접적으로 set/get해줄 수 있도록 작성해라
		//모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자를 작성
public class Student {
	//필드 영역
	private String name;
	private int age;
	private int mathScore;
	private int koScore;
	private int enScore;
	
	//생성자 영역
	public Student(String name, int age, int mathScore, int koScore, int enScore) {
		
		this.name = name;
		this.age = age;
		this.mathScore = mathScore;
		this.koScore = koScore;
		this.enScore = enScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getKoScore() {
		return koScore;
	}

	public void setKoScore(int koScore) {
		this.koScore = koScore;
	}

	public int getEnScore() {
		return enScore;
	}

	public void setEnScore(int enScore) {
		this.enScore = enScore;
	}

	//메소드영역
	public void print() {
		System.out.printf("이름 :%s %d살, 영어 : %d, 수학 : %d, 국어 : %d \n",name,age,enScore,mathScore,koScore);
	
	}
	
	public int getEvg() {
		int avg = (this.enScore+this.koScore+this.mathScore)/3;
		return avg;
	}
	
	
	
	
	
}
