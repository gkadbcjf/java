package com.kh.practice01;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {
		
	}
	public String afterToken(String str) {
		//str = str.trim();
		String af_str="";
		StringTokenizer stn = new StringTokenizer(str, " ");
		while(stn.hasMoreTokens()) {
			af_str+=stn.nextToken();
		}
		return af_str;
	}
	public String firstCap(String input) {
//		String ip =input.toUpperCase();
//		input =input.replace(input.charAt(0), ip.charAt(0));
		
		if( input == null || input.isEmpty()) {
			return input;
		}
		String str =input.substring(0,1).toUpperCase() + input.substring(1);
		
		return str;
	}
	
	public int findChar(String input, char one) {
		int count =0;
//		for(int i=0; i<input.length(); i++) {
//			if(input.charAt(i) == one) {
//				count+=1;
//			}
//		}
		for(char c : input.toCharArray()) {
			if(c == one)
				count++;
		}
		
		return count;
	}
	
}
