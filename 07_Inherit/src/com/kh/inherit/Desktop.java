package com.kh.inherit;

public class Desktop extends Product {
	private boolean allinOne;  //일체형인지

	public Desktop(String brand, String productpCode, String productpName, int price, boolean allinOne) {
		super(brand, productpCode, productpName, price);
		this.allinOne = allinOne;
	}

	public boolean isAllinOne() {
		return allinOne;
	}

	public void setAllinOne(boolean allinOne) {
		this.allinOne = allinOne;
	}

	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() + ", allinOne : " + this.allinOne
				;
	}

	

	
}
