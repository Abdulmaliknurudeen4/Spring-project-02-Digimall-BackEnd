package com.alpha.practice.digimallbackend.dao;

import java.util.List;

import com.alpha.practice.digimallbackend.dto.Product;

public interface ProductDAO {
	
	Product get(int productId);
	List<Product> list();
	
	boolean add(Product prodct);
	boolean update(Product product);
	boolean delete(Product product);
	
	//business methods
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> getLatestActiveProduct(int count);

}
