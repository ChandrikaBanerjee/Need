package com.cg.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.pojo.Books;


public class BooksDaoImpl implements BooksDAO {
	private Map<Integer,Books> bookMap= new HashMap<>();
	
	
		/* (non-Javadoc)
		 * @see com.cg.dao.BooksDAO#addNewBook(com.cg.pojo.Books)
		 */
		@Override
		public void addNewBook(Books book) {
			Books book1=new Books(1, "ABC", 50.00, "Tragedy");
			Books book2=new Books(2, "DEF", 60.00, "Comic");
			Books book3=new Books(3, "GHI", 70.00, "Detective");
			Books book4=new Books(4, "JKL", 80.00, "Suspense");
			bookMap.put(1, book1);
			bookMap.put(2, book2);
			bookMap.put(3, book3);
			bookMap.put(4, book4);
			
		}
		@Override
		public Collection<Books> viewAllBooks()
		{
		return	bookMap.values();
		}
		/* (non-Javadoc)
		 * @see com.cg.dao.BooksDAO#deleteBook(int)
		 */
		@Override
		public void deleteBook(int bookID) {
			bookMap.remove(bookID);
		}
}
