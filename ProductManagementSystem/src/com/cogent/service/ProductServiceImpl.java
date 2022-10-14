package com.cogent.service;

import java.util.ArrayList;

import com.cogent.model.Products;
import com.cogent.repo.ProductRepo;
import com.cogent.repo.ProductRepoImpl;

public class ProductServiceImpl implements ProductService{
	ProductRepo productRepo = new ProductRepoImpl();

	@Override
	public void addProduct(Products product) {
		productRepo.addProduct(product);
		
	}

	@Override
	public void deleteProductById(int pid) {
		productRepo.deleteProductById(pid);
		
	}

	@Override
	public void deleteProductsByCategory(String pcat) {
		productRepo.deleteProductsByCategory(pcat);
		
	}

	@Override
	public void findCheapestProductInCategory(String pcat) {
		productRepo.findCheapestProductInCategory(pcat);
		
	}

	@Override
	public void findProductById(int pid) {
		productRepo.findProductById(pid);
		
	}

	@Override
	public ArrayList<String> findProductByCategory(String pcat) {
		return productRepo.findProductByCategory(pcat);
	}

	@Override
	public void updateProduct(int pid) {
		productRepo.updateProduct(pid);
		
	}

	@Override
	public ArrayList<Products> findExpiredProducts() {
		return productRepo.findExpiredProducts();
	}

}
