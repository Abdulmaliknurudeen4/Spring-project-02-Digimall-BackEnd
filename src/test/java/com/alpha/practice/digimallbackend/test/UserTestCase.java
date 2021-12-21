package com.alpha.practice.digimallbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.alpha.practice.digimallbackend.dao.UserDAO;
import com.alpha.practice.digimallbackend.dto.Address;
import com.alpha.practice.digimallbackend.dto.Cart;
import com.alpha.practice.digimallbackend.dto.User;

public class UserTestCase {
	private static AnnotationConfigApplicationContext context;

	private static UserDAO userdao;

	private User user = null;
	private Cart cart = null;
	private Address address = null;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.alpha.practice.digimallbackend");
		context.refresh();

		userdao = (UserDAO) context.getBean("userDAO");

	}

	/*
	 * @Test public void testAddUser() {
	 * 
	 * user = new User(); user.setFirstname("Hrithik"); user.setLastname("Roshan");
	 * user.setEmail("hr@gmail.com"); user.setContactNumber("1234512345");
	 * user.setRole("USER"); user.setEnabled(true); user.setPassword("12345");
	 * 
	 * //add user assertEquals("Failed to Add User to Database", true,
	 * userdao.addUser(user)); //add address to user address = new Address();
	 * address.setAdddressLineOne("101/B Jadoo Society, Krissh Nagar");
	 * address.setAddressLineTwo("Near Kaabil Store"); address.setCity("Mumbai");
	 * address.setState("Maharashtra"); address.setCountry("India");
	 * address.setPostalCode("400001"); address.setBilling(true); //link the user
	 * with the address using the user id address.setUserId(user.getId());
	 * assertEquals("Failed to Add Address to Database", true,
	 * userdao.addAddress(address));
	 * 
	 * 
	 * if(user.getRole().equals("USER")) { cart = new Cart();
	 * 
	 * //cart for user cart.setUser(user);
	 * assertEquals("Failed to Add Address to Database", true,
	 * userdao.addCart(cart)); //new shipping addres // add the shipping address
	 * address = new Address();
	 * address.setAdddressLineOne("201/B Jadoo Society, Kishan Kanhaiya Nagar");
	 * address.setAddressLineTwo("Near Kudrat Store"); address.setCity("Mumbai");
	 * address.setState("Maharashtra"); address.setCountry("India");
	 * address.setPostalCode("400001"); //shipping address
	 * address.setShipping(true); address.setUserId(user.getId());
	 * assertEquals("Failed to add the shipping address!", true,
	 * userdao.addAddress(address)); } }
	 */

	/*
	 * @Test public void testUpdate() { user = userdao.getbyEmail("hr@gmail.com");
	 * 
	 * //cart cart = user.getCart();
	 * 
	 * cart.setGrandTotal(555); cart.setCartLines(2);
	 * assertEquals("Failed to update cart", true, userdao.updateCart(cart)); }
	 */

	/*
	 * @Test public void testAddAddress() { //add user user = new User();
	 * user.setFirstname("Hrithik"); user.setLastname("Roshan");
	 * user.setEmail("hr@gmail.com"); user.setContactNumber("1234512345");
	 * user.setRole("USER"); user.setEnabled(true); user.setPassword("12345");
	 * assertEquals("Failed to Add User to Database", true, userdao.addUser(user));
	 * 
	 * //add billling address address = new Address();
	 * address.setAdddressLineOne("101/B Jadoo Society, Krissh Nagar");
	 * address.setAddressLineTwo("Near Kaabil Store"); address.setCity("Mumbai");
	 * address.setState("Maharashtra"); address.setCountry("India");
	 * address.setPostalCode("400001"); address.setBilling(true);
	 * 
	 * //attachment address.setUser(user); assertEquals("Failed to Add Address",
	 * true, userdao.addAddress(address));
	 * 
	 * //add shipping addresses address = new Address();
	 * address.setAdddressLineOne("201/B Jadoo Society, Kishan Kanhaiya Nagar");
	 * address.setAddressLineTwo("Near Kudrat Store"); address.setCity("Mumbai");
	 * address.setState("Maharashtra"); address.setCountry("India");
	 * address.setPostalCode("400001"); address.setShipping(true);
	 * address.setUser(user); assertEquals("Failed to Add Address", true,
	 * userdao.addAddress(address)); }
	 */

	/*@Test
	public void testAddress() {
		user = userdao.getbyEmail("hr@gmail.com");
		// add shipping addresses
		address = new Address();
		address.setAdddressLineOne("AjCity Crime Scene");
		address.setAddressLineTwo("Near Kudrat Store");
		address.setCity("Lagos");
		address.setState("Ikeja");
		address.setCountry("Nigeria");
		address.setPostalCode("400001");
		address.setShipping(true);
		address.setUser(user);
		assertEquals("Failed to Add Address", true, userdao.addAddress(address));
	}*/
	
	/*@Test
	public void testlistAddress() {
		user = userdao.getbyEmail("hr@gmail.com");
		// find address list
		assertEquals("Failed to Add Addresses or size doesn't match", 2, userdao.listShippingAddresses(user).size());
		assertEquals("Failed to Add Addresses or size doesn't match", "101/B Jadoo Society, Krissh Nagar", userdao.getBillingAddress(user).getAdddressLineOne());
		
		
	}*/
}
