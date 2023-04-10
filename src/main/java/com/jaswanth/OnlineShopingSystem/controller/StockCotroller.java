package com.jaswanth.OnlineShopingSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaswanth.OnlineShopingSystem.service.StockService;

@RestController
@RequestMapping("/stock")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class StockCotroller {

	@Autowired
	StockService stockService;
	
	@GetMapping("/getAll")
	public List<Object[]> getAll() {
		return stockService.getAllStock();
	}
	
}
