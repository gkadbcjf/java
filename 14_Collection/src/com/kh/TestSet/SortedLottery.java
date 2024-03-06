package com.kh.TestSet;

import java.util.Comparator;

public class SortedLottery implements Comparator<Lottery>{

	@Override
	public int compare(Lottery o1, Lottery o2) {
		
		int num =o1.getName().compareTo(o2.getName());
		
		if(num==0) {
			return o2.getPhone().compareTo(o1.getPhone());
		}
		/*
		 * 0보다 작은 값(음수) : o1이 o2보다 작을 때
		 * 0 : 같을 때
		 * 0보다 큰값(양수) : o1이 o2보다 크다.
		 */
		return num;
		
	}
	
}
