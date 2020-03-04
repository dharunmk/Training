package com.dao;
import java.util.*;

import com.models.Books;

public interface BookDao {
	
	List<Books> getAllBooks();
	Books getBooksById(int id);
	void saveBook(Books book);
	void deleteBook(Books book);

	
}
