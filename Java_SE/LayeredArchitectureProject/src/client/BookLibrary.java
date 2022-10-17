/**
 * 
 */
package client;

import java.util.List;
import java.util.Scanner;

import com.cogent.bean.BookBean;
import com.cogent.service.BookService;
import com.cogent.service.BookServiceImpl;

/**
 * @author Ananda Magar
 *
 * @date Sep 28, 2022
 */
public class BookLibrary {
	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println();
		
		while(true) {
			
		System.out.println("****************************");
		System.out.println(" LIBRARY MANAGEMENT SYSTEM");
		System.out.println("****************************");
		System.out.println("1. Add Book");
		System.out.println("2. Find Book By ID");
		System.out.println("3. Delete Book By ID");
		System.out.println("4. Find Book(s) By Author");
		System.out.println("5. Find Books By Price Range");
		System.out.println("6. Display All Books");
		System.out.println("7. EXIT!!!!");
		
		System.out.println();
		System.out.println();
		
		System.out.println("Please select your desired option");
		
		System.out.println();
		
		int option = scanner.nextInt();
		scanner.nextLine();

			switch (option) {
				case 1:
					BookBean bookBean = null;
			        // Add New Book
					bookBean = new BookBean();
					System.out.println("Enter book Id");
					bookBean.setBookId(scanner.nextInt());
					System.out.println("Enter Book title");
					bookBean.setBookTitle(scanner.next());
					System.out.println("Enter Book Author");
					bookBean.setBookAuthor(scanner.next());
					System.out.println("Enter Book Price");
					bookBean.setPrice(scanner.nextDouble());
					scanner.nextLine();
					bookService.addBook(bookBean);
	
					break;
				case 2:
					System.out.println("Please enter the book id to be searched");
					bookService.findBookById(scanner.nextInt());
//					if(book != null) {
//						System.out.println(book.getBookId() + " " + book.getBookTitle() + " " + book.getBookAuthor() + " " + book.getPrice());
//					}
//					else {
//						System.out.println("Book not found");
//					}
					break;
			    case 3:
			    	System.out.println("Please enter the book id of the book you want to remove");
			    	bookService.deleteBookById(scanner.nextInt());
					break;
			    case 4: 
			    	System.out.println("Enter the author name which you want to search books for");
					bookService.findBookByAuthor(scanner.nextLine());
			    	break;
				case 5:
					System.out.println("Please enter your maximum and minium amount");
					bookService.findBookWithPriceRange(scanner.nextDouble(), scanner.nextDouble());
					break;
				case 6:
					bookService.displayAllBooks();
				case 7: 
					System.exit(0);
					break;
			}
		}
	}
}

