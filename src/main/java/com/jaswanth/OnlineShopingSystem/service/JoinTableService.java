package com.jaswanth.OnlineShopingSystem.service;

import java.util.List;

import com.jaswanth.OnlineShopingSystem.repository.JoinTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinTableService {

	@Autowired
    JoinTableRepository joinTableRepository;
	
	public List<Object[]> getAllProductAndPurchaseAndVendor(){
		return joinTableRepository.getAllProductAndPurchaseAndVendor();
	}
}
