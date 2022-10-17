/**
 * 
 */
package com.cogent.repo;

import java.util.Scanner;

/**
 * @author Ananda Magar
 *
 * @date Sep 26, 2022
 */
public class CustomerRepo {
	public void addCustomer(CustomerBean customerBean) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please select your desired option");
		
		System.out.println("****************************");
		System.out.println("CUSTOMER MANAGEMENT SYSTEM");
		System.out.println("****************************");
		System.out.println("1. Add Customer");
		System.out.println("2. View All Customers");
		System.out.println("3. Search Customer By ID");
		System.out.println("4. EXIT");
		
		
		System.out.println();
		
		int option = scnr.nextInt();
		switch (option) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
	}
}
