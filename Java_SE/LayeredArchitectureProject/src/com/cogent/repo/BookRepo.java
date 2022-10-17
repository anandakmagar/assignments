/**
 * 
 */
package com.cogent.repo;

import java.util.List;

import com.cogent.bean.BookBean;

/**
 * @author Ananda Magar
 *
 * @date Sep 28, 2022
 */
public interface BookRepo {
	public void addBook(BookBean bookBean);
	public void deleteBookById(int bookId);
	public BookBean findBookById(int bookId);
	public List<BookBean> findBookByAuthor(String author);
	public List<BookBean> findBookWithPriceRange(double minPrice, double maxPrice);
	public List<BookBean> displayAllBooks();
}