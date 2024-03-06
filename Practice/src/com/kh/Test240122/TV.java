package com.kh.Test240122;

public class TV {
	String name;
	int year;
	int size;
	private int price;
	public TV(String name, int year, int size, int price) {
		
		this.name = name;
		this.year = year;
		this.size = size;
		this.price = price;
	}
	public void show() {
		System.out.println("삼성에서 만든" + this.year +"년 " + size +"인치 TV" );
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
