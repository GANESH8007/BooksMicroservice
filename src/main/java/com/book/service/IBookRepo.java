package com.book.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.model.Book;

public interface IBookRepo extends JpaRepository<Book, Integer> {


	List<Book> findBookByAuthor(String Author);
	
	List<Book> findBookByPrice(Integer price);
	
	List<Book> findBookByCategory(String Category);
	
	
}
