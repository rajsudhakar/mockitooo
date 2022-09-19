package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import com.bookapp.service.OrderDetails;
@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
class OrderDetailsTestCase {
	@Mock
	IBookService bookService;
	@InjectMocks
	OrderDetails details;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
@Test
void testShowMessage() {
	Mockito.when(bookService.greetMessage()).thenReturn("Great Day");
	String actual=details.showMessage("Pavan");
	assertEquals("Great Day pavan",actual);
	String nactual=details.showMessage("Pooja");
	assertEquals("Great Day pooja",nactual);
}
@Test
void testAnShowMessage() {
	Mockito.when(bookService.greetMessage()).thenReturn("Great Day");
	String actual=details.showMessage("Raj");
	assertEquals("Wrong username",actual);
	String nactual=details.showMessage("halen");
	assertEquals("Wrong username",nactual);
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
	@Test
	void testGetByAuthor() throws BookNotFoundException{
		String author="Robin";
		when(bookService.getAll()).thenReturn(booklist);
		List<Book> actualBooks=details.findByAuthor(author);
		List<Book> expectedBooks=Arrays.asList(book2,book3);
		assertEquals(expectedBooks,actualBooks);
	}
	@Test
	@DisplayName("Testing by author-throw exception")
	void testGetByAuthorException() throws BookNotFoundException{
		String author="Priya";
		when(bookService.getAll()).thenThrow(new BookNotFoundException());
		assertThrows(BookNotFoundException.class,()->{
			details.findByAuthor(author);
		});
		}
	@Test
	@DisplayName("Testing by author-empty List")
	void testGetByAuthorEmpty() throws BookNotFoundException{
		String author="Priya";
		List<Book> emptyList=new ArrayList<>();
		when(bookService.getAll()).thenReturn(emptyList);
		assertThrows(BookNotFoundException.class,()->{
			details.findByAuthor(author);
		});
		}
	@Test
	@DisplayName("Testing by author-null")
	void testGetByAuthorNull() throws BookNotFoundException{
		String author="Priya";
		when(bookService.getAll()).thenReturn(null);
		List<Book> actualBook=details.findByAuthor(author);
		assertNull(actualBook);
		
		}
	
	

	@AfterEach
	void tearDown() throws Exception {
		details=null;
	}

	
	
	

	@Test
	void testFindByAuthor() {
	}

	@Test
	void testOrderBook() {
	}

	@Test
	void testAddBook() {
	}

}
