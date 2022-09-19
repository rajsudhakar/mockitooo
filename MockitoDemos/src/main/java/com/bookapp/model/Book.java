package com.bookapp.model;

public class Book {
private Integer bppkId;
private String title;
private String author;
private double price;
public Integer getBppkId() {
	return bppkId;
}
public void setBppkId(Integer bppkId) {
	this.bppkId = bppkId;
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [bppkId=" + bppkId + ", title=" + title + ", author=" + author + ", price=" + price + "]";
}
public Book(Integer bppkId, String title, String author, double price) {
	super();
	this.bppkId = bppkId;
	this.title = title;
	this.author = author;
	this.price = price;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}

}
