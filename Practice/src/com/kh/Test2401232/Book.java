package com.kh.Test2401232;

public class Book {
	// 필드는 private로 한다. 외부로의 접근을 차단한다.
	private String title;
	private String author;
	private String date;
	private int number;
	
	//생성자
	public Book(String title, String author, String date, int number) {
		this.title = title;
		this.author = author;
		this.date = date;
		this.number = number;
	}
	
	
	//private으로 선언은 필드에 접근하기위헤 getter/setter메서드 사용
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	

	

}
