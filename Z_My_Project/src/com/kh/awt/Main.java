package com.kh.awt;

import java.util.Scanner;

public class Main {
	/*
	 * č c= 
	 * ć c- 
	 * dž dz= 
	 * đ d- 
	 * lj lj 
	 * nj nj 
	 * š s= 
	 * ž z=
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str = input.next();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'c' && i + 1 < str.length()) {
				if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
				
					i+=1;
				
				}
				
			}

			else if (ch == 'd' && i + 1 < str.length()) {
				if (str.charAt(i + 1) == 'z' && i  < str.length()-2) {
					if (str.charAt(i + 2) == '=') {
						
						i+=2;
						
					}
				} else if (str.charAt(i + 1) == '-') {
					
					i+=1;
				
				}
			}

			else if ((ch == 'l' || ch == 'n') && str.charAt(i + 1) == 'j' && i+1  < str.length()) {
			
				i+=1;
			
			}

			else if ((ch == 's' || ch == 'z') && str.charAt(i + 1) == '=' && i + 1 < str.length()) {
				
				i+=1;
				
			}
			
			count++;
		}
		System.out.println(count);
	}

}
