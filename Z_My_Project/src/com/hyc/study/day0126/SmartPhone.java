package com.hyc.study.day0126;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	private String maker; //제조사 정보

	public SmartPhone() {
		
	}
	
	public abstract String printInformation(); 
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	
}
