package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.book.model.Book;

@Service
public class BookServiceImp implements IBookService {

	
	@Autowired
	IBookRepo bookRepo;

	@Override
	public Integer saveBook(Book book) {
		Book saveBook = bookRepo.save(book);
		return saveBook.getId();
	}

	@Override
	public List<Book> getAllBook() {
		return bookRepo.findAll();
	}

	@Override
	public List<Book> getBookByAuthor(String auther) {
		return bookRepo.findBookByAuthor(auther);
	}

	@Override
	public List<Book> getBookByCategory(String Category) {
		return bookRepo.findBookByCategory(Category);
	}

	@Override
	public List<Book> getBookByPrice(Integer Price) {
		return bookRepo.findBookByPrice(Price);
	}
}
