package com.jaswanth.OnlineShopingSystem.service;

import java.util.List;

import com.jaswanth.OnlineShopingSystem.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

	@Autowired
    StockRepository stockReopsitory;
	
	
	public List<Object[]> getAllStock(){
		return stockReopsitory.getAllStock();
	}
	
}
