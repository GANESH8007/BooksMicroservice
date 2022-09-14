package com.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.book.model.Book;
import com.book.service.IBookService;

@CrossOrigin
@RestController
public class BookController {
	
	@Autowired
	IBookService bookService;
	
	@Autowired
	private RestTemplate restTemplate;
	
		

	@PostMapping("/saveBook")
	Integer AddBook(@RequestBody Book book)
	{
		Integer id =bookService.saveBook(book);
		System.out.println(id);
		return id;
	}
	
	@GetMapping("/allBook")
	List<Book> getAllBooks()
	{
		return bookService.getAllBook();
	}
	
	@GetMapping("/getBookByCategory/{Category}")
	public List<Book> getBookByCategory(@PathVariable String Category)
	{
		List<Book> books=bookService.getBookByCategory(Category);
		return books;
	}

	@GetMapping("/getBookByPrice/{Price}")
	public List<Book> getBookByPrice(@PathVariable Integer Price)
	{
		List<Book> books=bookService.getBookByPrice(Price);
		return books;
	}
	
	@GetMapping("/getBookByAuthor/{Author}")
	public List<Book> getBookByAuthor(@PathVariable String Author)
	{
		List<Book> books=bookService.getBookByAuthor(Author);
		return books;
	}

}
