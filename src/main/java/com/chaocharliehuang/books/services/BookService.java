package com.chaocharliehuang.books.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.chaocharliehuang.books.models.*;
import com.chaocharliehuang.books.repositories.BookRepository;

@Service
public class BookService {
	
	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public ArrayList<Book> allBooks() {
		return (ArrayList<Book>) bookRepository.findAll();
	}
	
	public void addBook(Book book) {
		bookRepository.save(book);
	}
	
	public Book findBookById(Long id) {
		return bookRepository.findOne(id);
	}
	
	public void updateBook(Book book) {
		bookRepository.save(book);
 	}
	
	public void destroyBook(Long id) {
		if (bookRepository.exists(id)) {
			bookRepository.delete(id);
		}
	}
}
