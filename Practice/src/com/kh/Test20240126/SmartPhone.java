package com.kh.Test20240126;

public abstract class SmartPhone implements TouchDisplay, CellPhone {
	private String maker;

	public SmartPhone(/*String maker*/) { //상속의 의해서만 생성자로 불러올 수 있기 때문에 내용이 없어도 된다.
		/*
		super();
		this.maker = maker; // SmartPhone에서 매개변수를 받을 경우
		*/
	}

	public abstract String printInformation();

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

}
