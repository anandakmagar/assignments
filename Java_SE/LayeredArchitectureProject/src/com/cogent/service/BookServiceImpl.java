/**
 * 
 */
package com.cogent.service;

import java.util.List;

import com.cogent.bean.BookBean;
import com.cogent.repo.BookRepo;
import com.cogent.repo.BookRepoImpl;

/**
 * @author Ananda Magar
 *
 * @date Sep 28, 2022
 */
public class BookServiceImpl implements BookService {
	BookRepo bookRepo= new BookRepoImpl();
	@Override
	public void addBook(BookBean bookBean) {
		bookRepo.addBook(bookBean);
	}

	@Override
	public void deleteBookById(int bookId) {
		bookRepo.deleteBookById(bookId);
	}

	@Override
	public BookBean findBookById(int bookId) {
		return bookRepo.findBookById(bookId);
	}

	@Override
	public List<BookBean> findBookByAuthor(String author) {
		return bookRepo.findBookByAuthor(author);
	}

	@Override
	public List<BookBean> findBookWithPriceRange(double minPrice, double maxPrice) {
		return bookRepo.findBookWithPriceRange(minPrice, maxPrice);
	}

	@Override
	public List<BookBean> displayAllBooks() {
		return bookRepo.displayAllBooks();
	}

}

