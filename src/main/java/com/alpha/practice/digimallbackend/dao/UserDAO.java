package com.alpha.practice.digimallbackend.dao;

import java.util.List;

import com.alpha.practice.digimallbackend.dto.Address;
import com.alpha.practice.digimallbackend.dto.User;

public interface UserDAO {
//add a user
	boolean addUser(User user);

	// add an address
	boolean addAddress(Address address);

	// find user
	User getbyEmail(String email);

	// get Billing Address
	Address getBillingAddress(User user);

	// get Shipping Address
	List<Address> listShippingAddresses(User user);

	// get single address
	Address getAddress(int addressId);
}
