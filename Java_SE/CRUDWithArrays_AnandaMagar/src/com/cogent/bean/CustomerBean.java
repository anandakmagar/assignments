/**
 * 
 */
package com.cogent.bean;
import java.io.Serializable;

import com.cogent.repo.CustomerRepo;

/**
 * @author Ananda Magar
 *
 * @date Sep 26, 2022
 */
public class CustomerBean implements Serializable{
	private long customerId;
	private String customerName;
	
	
	@Override
	public String toString() {
		return "CustomerBean [customerId=" + customerId + ", customerName=" + customerName + "]";
	}

	public CustomerBean(long customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
