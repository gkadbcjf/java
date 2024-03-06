package com.kh.myPoject;

import java.util.ArrayList;

public class Member {
	String name;
	String password;
	ArrayList <Book> bk =new ArrayList<Book>();
	
	public ArrayList<Book> getBk() {  //bk반환
		return bk;
	}
	
	public Book getbook(int n) {  //bk안에 있는 책 반환
		for(int i=0; i<bk.size(); i++) {
			if(i==n)
				return bk.get(i);
		}
		return null;
	}
	
	public void setBk(Book b) {
		this.bk.add(b);
	}
	
	public void removeBk(Book b) {
		bk.remove(b);
	}
	
	public Member(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public Member() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", password=" + password + "]";
	}
	
	
	
}
