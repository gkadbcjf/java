package com.hyc.study.day0126;

public class PhoneController {
	private String[] result;

	public PhoneController() {
		this.result = new String[2];
	}
	
	public String[]method() {
		Phone[] ph =  new Phone[2];
		ph[0] = new GalaxyNote9();
		ph[1] = new V40();
		for(int i=0; i<ph.length; i++) {
			if(ph[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)ph[i]).printInformation();
			}
			else if(ph[i] instanceof V40) {
				result[i] = ((V40)ph[i]).printInformation();
			}
		}
		return result;
	}
 	
}
