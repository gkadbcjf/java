package com.kh.Test240206;

import java.util.Comparator;

public class Compr implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		if(o1.getTitle().compareTo(o2.getTitle())>=1)
			return 1;
		else if(o1.getTitle().compareTo(o2.getTitle())==0)
			return 0;
		else
			return 1;

	}

}
