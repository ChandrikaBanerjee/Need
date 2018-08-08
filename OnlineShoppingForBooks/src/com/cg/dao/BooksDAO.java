package com.cg.dao;

import java.util.Collection;

import com.cg.pojo.Books;

public interface BooksDAO {

	void addNewBook(Books book);

	Collection<Books> viewAllBooks();

	void deleteBook(int bookID);

}