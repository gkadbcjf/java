package com.kh.inherit;

public class SmartPhone extends Product{

	private String mobileAgency; //통신사

	public SmartPhone(String brand, String productpCode, String productpName, int price, String mobileAgency) {
		super(brand, productpCode, productpName, price);
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() + ", [ ★mobileAgency★ ] : " + this.mobileAgency;
	}
	
	
}
