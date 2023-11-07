package com.bushansirgur.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bushansirgur.spring.model.Book;

public class BookDAOImpl implements BookDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long save(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Book get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> list() {
		sessionFactory 
	}

	@Override
	public void update(long id, Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
