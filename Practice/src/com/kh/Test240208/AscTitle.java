package com.kh.Test240208;

import java.util.Comparator;

public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		int num=o1.getTitle().compareTo(o2.getTitle());
			if(num==0) {
				return o1.getSinger().compareTo(o2.getSinger());
			}
			
		return num;
	}
	
}
