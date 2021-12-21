package com.alpha.practice.digimallbackend.dao;

import java.util.List;

import com.alpha.practice.digimallbackend.dto.Cart;
import com.alpha.practice.digimallbackend.dto.CartLine;
import com.alpha.practice.digimallbackend.dto.OrderDetail;

public interface CartLineDAO {
	
	//common methods for DAO
	public CartLine get(int id);
	public boolean add(CartLine cartLine);
	public boolean update(CartLine cartLine);
	public boolean delete(CartLine cartLine);
	public List<CartLine> list(int cardId);	
	//update a cart
	boolean updateCart(Cart cart);
	
	//custom business methods
	public List<CartLine> listAvailable(int cartId);
	public CartLine getByCartAndProduct(int cartId, int productId);
	//adding order details for the user to clear cart
	boolean addOrderDetail(OrderDetail orderdetails);

}
