package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public class OrderDetails {
	IBookService bookService;

public void setBookService(IBookService bookService) {
	this.bookService=bookService;
}


//public String orderBook(int bookId) {
//	return null;

//public String addBook(Book book) {
//	return null;
//}

public String showMessage(String name) {
//	String result=bookService.greetMessage();
	String result=bookService.greetMessage();
	if(result.startsWith("P")) {
		return result.concat(" ").concat(name);
	}else 
	return "Wrong username";
}
	public List<Book> findByAuthor(String author) throws BookNotFoundException{
		List<Book> books=bookService.getAll();
		if(books==null)
			return null;
		if(books.isEmpty())
			throw new BookNotFoundException();
			return books.stream()
				.filter((name)->name.getAuthor().equals(author))
				.collect(Collectors.toList());
	}
	
	public String addBook(Book book){
		if(book==null)
			return "Book not added";
		bookService.addBook(book);
		return "Book added";
			
	}
//	public String orderBook(int bookId)
//	try {
//		Book book=bookService.getById(bookId)
//				if(book==null)
//					return null;
//		return "ordered Book";
//	}catch(BookNotFoundException e) {
//		e.printStackTrace();
//	}
//	return "Technical issues";
//	return result.substring(0,0).toUpperCase().concat("").concat(result);
}

//public String testAnShowMessage(String name) {
//	String result=bookService.greetMessage();
//	if(result.startsWith("P")) {
//		return result.concat(" ").concat(name);
//	}else 
//	return "Wrong username";
//
//}

