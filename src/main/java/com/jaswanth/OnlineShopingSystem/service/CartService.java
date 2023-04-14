package com.jaswanth.OnlineShopingSystem.service;

import java.util.List;
import java.util.Optional;

import com.jaswanth.OnlineShopingSystem.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaswanth.OnlineShopingSystem.model.Cart;

@Service
public class CartService {

	@Autowired
    CartRepository cartRepository;
	
  public Cart post(Cart cart) {
		
		if(!cart.equals(null)) {
			
			return cartRepository.save(cart);
		}
		return null;
	}
  
  public List<Cart> getCartList(Long userId) {
		return cartRepository.getCartList(userId);
	}
  
  public String removeFromCart(Long id){
	  Optional<Cart> optional = cartRepository.findById(id);
	  if(optional.isPresent()) {
		  cartRepository.delete(optional.get());
		  return null;
	  }
	  return "fail";
  }
  
  
}
