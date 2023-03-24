package com.dinislam.OnlineShopingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinislam.OnlineShopingSystem.model.Cart;
import com.dinislam.OnlineShopingSystem.model.Orders;
import com.dinislam.OnlineShopingSystem.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	
	  public Orders post(Orders order) {
			if(!order.equals(null)) {
				return orderRepository.save(order);
			}
			return null;
		}
	  
	  
	  public List<Orders> getOrderList(Long userId) {
			return orderRepository.getOrderList(userId);
		}
	  
	  public List<Orders> getAllOrderList() {
			return orderRepository.findAll();
		}
	  
	  
	  public void updateStatus(Long orderId, String status) {
		  System.out.println("------------hit"+orderId+"--"+status);
		  orderRepository.updateStatus(orderId, status);
		}
	
	  
	  
}
