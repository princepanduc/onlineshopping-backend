package com.jaswanth.OnlineShopingSystem.service;

import java.util.List;

import com.jaswanth.OnlineShopingSystem.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaswanth.OnlineShopingSystem.model.Orders;

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
