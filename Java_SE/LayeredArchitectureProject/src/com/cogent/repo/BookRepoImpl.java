/**
 * 
 */
package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.BookBean;

/**
 * @author Ananda Magar
 *
 * @date Sep 28, 2022
 */
public class BookRepoImpl implements BookRepo {

	//Repository- Database
	List<BookBean> books = new ArrayList();
	{
		books.add(new BookBean(1, "Learn Java in 2 mins", "Samuel", 110));
		books.add(new BookBean(2, "Learn Spring in 2 mins", "Bryan", 210));
		books.add(new BookBean(3, "Learn Angular in 2 mins", "Ashley", 250));
		books.add(new BookBean(4, "Python for Absolute Beginners", "Samuel", 110));
	}
	
	@Override
	public void addBook(BookBean bookBean) {
		books.add(bookBean);
	}

	@Override
	public void deleteBookById(int bookId) {
		BookBean book2 = null;
		for(int i = 0; i < books.size(); i++) {
			book2 = books.get(i);
			if(book2.getBookId() == bookId) {
				books.remove(i);
				break;
			}
		}

	}

	@Override
	public BookBean findBookById(int bookId) {
		BookBean book=null;
		for(int i=0; i<books.size();i++) {
			book=books.get(i);
			if(book.getBookId()==bookId) {
				System.out.println(book.getBookId() + " " + book.getBookTitle() + " " + book.getBookAuthor() + " " + book.getPrice());
				break;
			}
			if(book.getBookId()!= bookId) {
				System.out.println("Book not found");
				break;
			}
		}
		
		return book;
	}
	
	
	// This arraylist will hold the collections of books that match the author name
	List<BookBean> booksByAuthor = new ArrayList<>();
	
	@Override
	public List<BookBean> findBookByAuthor(String author) {
		BookBean book3 = null;
		for(int i = 0; i < books.size(); i++) {
			book3 = books.get(i);
			if(book3.getBookAuthor().equals(author)) {
				booksByAuthor.add(book3);
			}
		}
		for(BookBean book7: booksByAuthor) {
			System.out.println("Book ID: " + book7.getBookId() + " || " + "Book Title: " + book7.getBookTitle() + " || " + "Book Price: " + book7.getPrice());
		}
		return booksByAuthor;
	}
	
	// This arraylist will hold the collections of books that match the price range
	List<BookBean> booksByPriceRange = new ArrayList<>();
	
	@Override
	public List<BookBean> findBookWithPriceRange(double minPrice, double maxPrice) {
		BookBean book4 = null;
		for(int i = 0; i < books.size(); i++) {
			book4 = books.get(i);
			if((book4.getPrice() <= maxPrice) && (book4.getPrice() >= minPrice)) {
				booksByPriceRange.add(book4);
			}
		}
		for(BookBean book6: booksByPriceRange) {
			System.out.println("Book ID: " + book6.getBookId() + " || " + "Book Title: " + book6.getBookTitle() + " || " + "Book Price: " + book6.getPrice());
		}
		return booksByPriceRange;
		
	}

	@Override
	public List<BookBean> displayAllBooks() {
		for(BookBean book5: books) {
			System.out.println("Book ID: " + book5.getBookId() + " || " + "Book Title: " + book5.getBookTitle() + " || " + "Book Price: " + book5.getPrice());
		}
		return books;
	}

}
