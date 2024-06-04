package com.bean;

public class BookBean {
	private String AuthorName;
	private String BookName;
	
	private AuthorBean author;
	private BookBean(AuthorBean a1)
	{
		this.author=a1;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	
	
}
