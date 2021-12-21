package com.alpha.practice.digimallbackend.dao;

import java.util.List;
import com.alpha.practice.digimallbackend.dto.Category;

public interface CategoryDAO {

	/*
	 * Category Data Access Object
	 * 
	 */
	List<Category> list();
	
	Category getid(int id);
	
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
}
