package com.bushansirgur.spring.service;

import java.util.List;

import com.bushansirgur.spring.model.Book;

public interface BookService {
	 long save(Book book);
	 
	 Book get(long id);
	 
	 List<Book> list();
	 
	 void update(long id, Book book);
	 
	 void delete(long id);
}
