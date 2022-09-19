package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)

class OrderTest {
	 IBookService bookService;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
//		this.bookService=bookService;
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	Book book1,book2, book3;
	List<Book> booklist=null;
	@BeforeEach
	void setUp() throws Exception {
				book1=new Book(1,"Java","Kathy",800);
				book2=new Book(2,"spring","Robin",800);
				book3=new Book(3,"The 5am","Robin",800);
				booklist=Arrays.asList(book1,book2,book3);
			}
	

	@AfterEach
	void tearDown() throws Exception {
	}
//	@Test
//	void testAddBook() throws BookNotFoundException {
//		doNothing().when(bookService).addBook(book1);
////		String actual=details.addBook(book1);
//		assertEquals("Book added",actual);
//	}
//	@Test
//	void testAddBookNull() throws BookNotFoundException {
//		String actual=details.addBook(null);
//		assertEquals("Book not added",actual);
//	}

//	@Test
//	void testBookById() throws BookNotFoundException {
//		doReturn(book1).when(bookService).getById(1);
//		String actual=details.orderBook(1);
//		assertEquals("Book orderd",actual);
//	}
//	@Test
//	void testBookByName() throws BookNotFoundException {
//		doReturn(null).when(bookService).getById(10);
//		String actual=details.orderBook(10);
//		assertEquals("out of stock",actual);
//	}
//	@Test
//	void testBookByIdException() throws BookNotFoundException {
//		doThrow(new BookNotFoundException("Invalid Id")).when(bookService).getById(20);
//		String actual=details.orderBook(20);
//		assertEquals("Technical Issues",actual);
//	}

}
