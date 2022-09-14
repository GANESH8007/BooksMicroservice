package com.book.service;

import java.util.List;
import java.util.Optional;
import com.book.model.Book;

public interface IBookService {


	Integer saveBook(Book book);
	public List<Book> getAllBook();
	List<Book> getBookByAuthor(String auther);
	List<Book> getBookByCategory(String Category);
	List<Book> getBookByPrice(Integer Price);
	
}
