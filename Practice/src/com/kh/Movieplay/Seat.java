package com.kh.Movieplay;

public class Seat {
	char[][] st;
	final Seat[] st_arr = new Seat[5];
	
	public Seat() {
		st = new char[4][7];
		
		for(int i=0; i<st.length; i++) {
			for(int j=0; j<st[i].length; j++) {
				st[i][j] = 'o';
			}
		}
		
	}
	
	
	public char[][] getSt() {
		return st;
	}
	
	public void setSt(char[][] st) {
		this.st = st;
	}
	
	
	public void create_Twoarry() {
		for(int i=0; i<st_arr.length; i++) {
			st_arr[i] =new Seat();
		}
		
	}
	
	public void print_Twoarray() {
		System.out.println("<<좌석을 선택하세요>>");
		System.out.print("");
		
					
				
		char [][]print_arr;
	
		char sk='A';
		for(Seat arr : st_arr) {
			print_arr=arr.getSt();
			for (int i = 0; i < print_arr.length; i++) {
                for (int j = 0; j < print_arr[i].length; j++) {
                	if(j==0) {
                		System.out.print(sk+"("+i+")"+"|");
                		sk++;
                	}
                    System.out.print(print_arr[i][j] + " ");
                }
                System.out.println(); 
            }
			System.out.println("-------------------");
			System.out.print("    |");
			for(int i=0; i<7; i++) {
				System.out.print(i+" ");
			}
            System.out.println(); 
		}
		
	}
	
	public void change_Twoarray() {
		
	}
	
	
	
}
