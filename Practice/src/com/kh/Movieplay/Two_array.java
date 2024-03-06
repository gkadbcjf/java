package com.kh.Movieplay;

public class Two_array {
	char[][] st;
	
	public Two_array() {
		st=new char[4][7];
		for(int i=0; i<st.length; i++) {
			for(int j=0; j<st[i].length; j++) {
				st[i][j] = 'o';
			}
		}
	}
	
	public void two_change(int i2,int j2) {
		this.print_Twoarray1();
		System.out.print("무슨 열의 몇 번 좌석을 선택하시겠습니까? ");
		for(int i=0; i<st.length; i++) {
			for(int j=0; j<st[i].length; j++) {
				if(st[i2][j2] == st[i][j])
					st[i][j] ='x';
			}
		}
	}
	public void print_Twoarray1() {
		System.out.println("<<좌석을 선택하세요>>");
		System.out.print("");
		
		
		char sk='A';
		for (int i = 0; i < st.length; i++) {
            for (int j = 0; j < st[i].length; j++) {
            	if(j==0) {
            		System.out.print(sk+"("+i+")"+"|");
            		sk++;
            	}
                System.out.print(st[i][j] + " ");
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
