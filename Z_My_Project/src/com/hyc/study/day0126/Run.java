package com.hyc.study.day0126;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneController pc = new PhoneController();
		String[]arr_str = pc.method();
		for(String str : arr_str) {
			System.out.println(str);
		}
	
	}

}
