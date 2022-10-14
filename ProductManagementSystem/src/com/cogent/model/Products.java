package com.cogent.model;

import java.time.LocalDate;
import java.util.Date;

public class Products {
	private int pid;
	private String pname;
	private String pcat;
	private Date manufacture_date;
	private double price;
	private Date expiry_date;
	
	public Products() {
		super();
	}
	public Products(int pid, String pname, String pcat, Date manufacture_date, double price, Date expiry_date) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcat = pcat;
		this.manufacture_date = manufacture_date;
		this.price = price;
		this.expiry_date = expiry_date;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcat() {
		return pcat;
	}
	public void setPcat(String pcat) {
		this.pcat = pcat;
	}
	public Date getManufacture_date() {
		return manufacture_date;
	}
	public void setManufacture_date(Date manufacture_date) {
		this.manufacture_date = manufacture_date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", pcat=" + pcat + ", manufacture_date=" + manufacture_date
				+ ", price=" + price + ", expiry_date=" + expiry_date + "]";
	}
	
	

}
