/**
 * 
 */
package com.cogent.controller;

import com.cogent.repo.CustomerRepo;

import java.util.Scanner;

/**
 * @author Ananda Magar
 *
 * @date Sep 26, 2022
 */
public class CustomerManager {

	public static void main(String[] args) {
		
		CustomerRepo cr = new CustomerRepo();
		Scanner scnr = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Please select your desired option");
		System.out.println();
		
		
			while(true) {
			
			System.out.println("****************************");
			System.out.println("CUSTOMER MANAGEMENT SYSTEM");
			System.out.println("****************************");
			System.out.println("1. Add Customer");
			System.out.println("2. View All Customers");
			System.out.println("3. Search Customer By ID");
			System.out.println("4. EXIT");
			
			
			System.out.println();
			
			int option = scnr.nextInt();
			scnr.nextLine();
	
			switch (option) {
				case 1:
					String choice;
					do {
						cr.addCustomer();
						System.out.println("Do you want to add more customers? Press Y for yes, N for No");
						choice = scnr.nextLine(); 
					}while(choice.equals("Y"));
					break;
				case 2:
					cr.viewAllCustomers();
					break;
			    case 3:
					cr.searchCustomerById();
					break;
				case 4:
					System.exit(0);
				    break;
			}
		}
	}
}
