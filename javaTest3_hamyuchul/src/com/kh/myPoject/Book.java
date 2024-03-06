package com.kh.myPoject;

public class Book {
	String booknum;
	String title;
	String author;
	String genre;


	public Book() {
		super();
	}

	public Book(String booknum, String title, String author, String genre) {
		super();
		this.booknum = booknum;
		this.title = title;
		this.author = author;
		this.genre = genre;
	}
	

	public String getBooknum() {
		return booknum;
	}

	public void setBooknum(String booknum) {
		this.booknum = booknum;
	}

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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {

		return "<" + genre + ">" + "[책 번호 : " + booknum + ", title : " + title + ", author="
				+ author + "]";

	}

}
