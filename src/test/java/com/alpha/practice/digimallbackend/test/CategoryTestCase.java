package com.alpha.practice.digimallbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.alpha.practice.digimallbackend.dao.CategoryDAO;
import com.alpha.practice.digimallbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.alpha.practice.digimallbackend");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

	}
//
//	@Test
//	public void testAddCategory() {
//
//		category = new Category();
//		category.setName("Phones");
//		category.setDescription("This is some description for Phones");
//		category.setImageURL("ADADF.png");
//
//		assertEquals("Successfully added Category to Database", true, categoryDAO.add(category));
//
//	}

	/*
	 * @Test public void testGetCategory() { category= categoryDAO.getid(2);
	 * assertEquals("Successfully fetched a Single Category From table", "Phones",
	 * category.getName());
	 * 
	 * }
	 */

	/*
	 * @Test public void testUpdateCategory() { category = categoryDAO.getid(2);
	 * category.setName("Mp3 Player");
	 * assertEquals("Successfully Updated a Single Category In the table", true,
	 * categoryDAO.update(category));
	 * 
	 * }
	 */

	/*
	 * @Test public void testDeleteCategory() { category = categoryDAO.getid(2);
	 * assertEquals("Successfully Deleted a Single Category In the table", true,
	 * categoryDAO.delete(category));
	 * 
	 * }
	 */

	/*
	 * @Test public void testUpdateCategory() { category = categoryDAO.getid(2);
	 * category.setName("Mp3 Player");
	 * assertEquals("Successfully Updated a Single Category In the table", true,
	 * categoryDAO.update(category));
	 * 
	 * }
	 */

	/*
	 * @Test public void testlistCategory() { category = categoryDAO.getid(2);
	 * category.setName("Mp3 Player");
	 * assertEquals("Successfully fetched list from category", 2,
	 * categoryDAO.list().size());
	 * 
	 * }
	 */

	@Test
	public void testCRUDCategory() {

		// add operation
		category = new Category();
		category.setName("Phones");
		category.setDescription("This is some description for Phones");
		category.setImageURL("ADADF1.png");

		assertEquals("Successfully added Category to Database", true, categoryDAO.add(category));

		category = new Category();
		category.setName("Laptops");
		category.setDescription("This is some description for Laptops");
		category.setImageURL("ADADF2.png");

		assertEquals("Successfully added Category to Database", true, categoryDAO.add(category));
		category = new Category();
		category.setName("HeadPhones");
		category.setDescription("This is some description for HeadPhones");
		category.setImageURL("ADADF3.png");

		assertEquals("Successfully added Category to Database", true, categoryDAO.add(category));
		category = new Category();
		category.setName("Accesories");
		category.setDescription("This is some description for Accesories");
		category.setImageURL("ADADF4.png");

		assertEquals("Successfully added Category to Database", true, categoryDAO.add(category));

		// fetching and updating the category
		category = categoryDAO.getid(2);
		assertEquals("Successfully fetched a Single Category From table", "Laptops", category.getName());
		category.setName("Laptop");
		assertEquals("Successfully Updated a Single Category In the table", true, categoryDAO.update(category));

		// delete the category
		category = categoryDAO.getid(2);
		assertEquals("Successfully Deleted a Single Category In the table", true, categoryDAO.delete(category));

		// fetching the list
		assertEquals("Successfully fetched list from category", 3, categoryDAO.list().size());

	}

}
