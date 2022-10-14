package com.cogent.repo;

import java.util.ArrayList;

import com.cogent.model.Products;

public interface ProductRepo {
	public void addProduct(Products product);
	public void deleteProductById(int pid);
	public void deleteProductsByCategory(String pcat);
	public void findCheapestProductInCategory(String pcat);
	public void findProductById(int pid);
	public ArrayList<String> findProductByCategory(String pcat);
	public void updateProduct(int pid);
	public ArrayList<Products> findExpiredProducts();
}
