package com.cogent.client;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.cogent.service.ProductService;
import com.cogent.service.ProductServiceImpl;
import com.cogent.model.Products;


public class ProductClient {

	public static void main(String[] args) {
		ProductService productService = new ProductServiceImpl();
		Products product = new Products();
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("****************************");
		System.out.println(" PRODUCT MANAGEMENT SYSTEM");
		System.out.println("****************************");
		System.out.println("1. Add Product");
		System.out.println("2. Delete Product By Product ID");
		System.out.println("3. Delete Products By Category");
		System.out.println("4. Find Cheapest Product In Category");
		System.out.println("5. Find Product By Product ID");
		System.out.println("6. Find Products By Product Category");
		System.out.println("7. Update Product Using Product ID");
		System.out.println("8. Find Expired Products");
		System.out.println("9. EXIT!!!!");
		
//		System.out.println();
//		System.out.println();
		
		System.out.println("Please select your desired option");
		
//		System.out.println();
		
		int option = scanner.nextInt();
		scanner.nextLine();

			switch (option) {
				case 1:
					System.out.println("Enter the product id");
					product.setPid(scanner.nextInt());
					scanner.nextLine();
					System.out.println("Ener the product name");
					product.setPname(scanner.nextLine());
					System.out.println("Enter the category name");
					product.setPcat(scanner.nextLine());
					System.out.println("Enter the date of manufacture");
					
				    String date1 = scanner.next();

				    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				    Date date = null;
				    try {
				    	date = formatter.parse(date1);
				    } catch (ParseException e) {
				    	e.printStackTrace();
				    }
					product.setManufacture_date(date);
					
					System.out.println("Enter the price of the product");
					product.setPrice(scanner.nextDouble());
					System.out.println("Enter the date of expiration");
				    String date2 = scanner.next();

				    DateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
				    Date date3 = null;
				    try {
				    	date3 = formatter.parse(date2);
				    } catch (ParseException e) {
				    	e.printStackTrace();
				    }
				    product.setExpiry_date(date3); 
					
					productService.addProduct(product);
					break;
				case 2:
					System.out.println("Enter the product id to be deleted");
					productService.deleteProductById(scanner.nextInt());
					
					break;
			    case 3:
			    	System.out.println("Enter the product category to be deleted");
			    	productService.deleteProductsByCategory(scanner.nextLine());
					break;
			    case 4:
			    	System.out.println("Enter the name of the category");
			    	productService.findCheapestProductInCategory(scanner.nextLine());
			    	break;
			    case 5: 
			    	System.out.println("Enter the product id to be searched");
			    	productService.findProductById(scanner.nextInt());
			    	break;
			    case 6: 
			    	System.out.println("Enter your product category");
//			    	List<ProductBean> productsFromIndia = productService.findProductsFromIndia();
//			    	for(ProductBean product: productsFromIndia) {
//			    		System.out.println("Name: " + product.getProductFname() + " " + product.getProductLname() + " || Address: " + product.getProductCity() + ", " + product.getProductCountry());
//			    	}
//			    	break;
			    	//productService.findProductByCategory(scanner.nextLine());
			    	ArrayList<String> products = productService.findProductByCategory(scanner.nextLine());
			    	for(String s: products) {
			    		System.out.println(s);
			    	}
//			    case 7:
//			    	List<ProductBean> productsFromBangaloreIndia = productService.displayProductsFromBangaloreIndia();
//			    	for(ProductBean product: productsFromBangaloreIndia) {
//			    		System.out.println("Name: " + product.getProductFname() + " " + product.getProductLname() + " || Address: " + product.getProductCity() + ", " + product.getProductCountry());
//			    	}
//			    	break;
//				case 8: 
//					System.out.println("You have successfully EXITED the system");
//					System.exit(0);
//					break;
//			}
//		}
	}
}
	}
}

