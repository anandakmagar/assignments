/**
 * 
 */
package com.cogent.repo;

import java.util.ArrayList;
import java.util.Scanner;

import com.cogent.bean.CustomerBean;

/**
 * @author Ananda Magar
 *
 * @date Sep 26, 2022
 */
public class CustomerRepo{
    CustomerBean[] customerBeans = new CustomerBean[2];
    
    public void addCustomer(){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the customer id");
        long customerId = scnr.nextLong();

        scnr.nextLine();

        System.out.println("Enter the customer name");
        String customerName = scnr.nextLine();

        
        for(int i = 0; i < 4; i++) {
        	if(customerBeans[i] == null) {
        		customerBeans[i] = new CustomerBean(customerId, customerName);
        		break;
        	}
        }
        System.out.println("Customer added successfully!");
        
        System.out.println();
    }
    
    public CustomerBean[] viewAllCustomers(){
        for (int i = 0; i < customerBeans.length; i++){
            System.out.println(customerBeans[i].toString());
        }
        return customerBeans;
    }
    
    public CustomerBean searchCustomerById() {
    	
    	Scanner scnr = new Scanner(System.in);
    	System.out.println("Enter the customer ID");
    	long customerId = scnr.nextLong();
    	scnr.nextLine();
    	
    	int i;
    	for(i = 0; i < customerBeans.length; i++) {
    		if(customerId == customerBeans[i].getCustomerId()) {
    			System.out.println(customerBeans[i]);
    			break;
    		}
    		else {
    			System.out.println("Not found");
    			
    		}
    	}

    	return customerBeans[i];
    }
}
