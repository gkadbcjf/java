package com.kh.Test240208;

import java.util.Objects;

public class Music {
	private String title;
	private String singer;
	
	public Music() {
		super();
	}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return singer + " - " + title ;
	}

	@Override
	public int hashCode() {
		String str =singer +title;
		return str.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Music) {
			Music other =(Music)obj;
			if(other.getSinger().equals(this.getSinger())&&
					other.getTitle().equals(this.getTitle()))
				return true;
			else
				return false;
		}
		return false;
	}
	
	
}
