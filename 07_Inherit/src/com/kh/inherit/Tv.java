package com.kh.inherit;

public class Tv extends Product{

	private int inch;  //크기

	public Tv(String brand, String productpCode, String productpName, int price, int inch) {
		super(brand, productpCode, productpName, price);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() + ", inch : "+ this.inch;
	}
	
	
}
