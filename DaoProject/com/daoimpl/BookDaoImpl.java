package com.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.dao.BookDao;
import com.models.Books;

public class BookDaoImpl implements BookDao{
	private List<Books> books;
	
	public BookDaoImpl(){
		books=new ArrayList();
		books.add(new Books(11,"java",100));
		books.add(new Books(22,"python",200));
		books.add(new Books(33,"android",300));
	}
		@Override
		public List<Books> getAllBooks(){
			return books;
		}
		@Override
		public Books getBooksById(int id){
			Books b1=null;
			for(Books b:books){
			if(b.getId()==id){
				 b1=b;
			}
			}
			return b1;
		}
		@Override
		public void saveBook(Books book){
			books.add(book);
		}
		@Override
		public void deleteBook(Books book){
			books.remove(book);
		}
		
		
		
		
	}


