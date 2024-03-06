package Test11;

import java.util.Comparator;

public class Decending implements Comparator<Integer>{

	@Override
	public int compare(Integer o1 , Integer o2) {
		
		//return o1.compareTo(o2); 가능
		return o1>o2?-1:(o1 == 02)? 0:1; //내림차순으로 o1>o2이면 내림 o1<o2이면 오름
	}
	
}
