package com.jaswanth.OnlineShopingSystem.service;

import java.util.List;
import java.util.Optional;

import com.jaswanth.OnlineShopingSystem.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jaswanth.OnlineShopingSystem.model.Category;

@Service
public class CategoryService {

	@Autowired
    CategoryRepository categoryRepository;
	
	public Category post(Category category) {
		
		if(!category.equals(null)) {
			
			return categoryRepository.save(category);
		}
		return null;
	}
	
	public Category getById(Long id) {
		Optional<Category> optional = categoryRepository.findById(id);
		if(optional.isPresent()) {
			
			return optional.get();
		}
		
		return null;
	}
	
	public Category update(Category category) {
		return categoryRepository.save(category);
	}
		
	public String delete(Long id) {
		Optional<Category> optional = categoryRepository.findById(id);
		if(optional.isPresent()) {
			categoryRepository.delete(optional.get());
			 return null;
		}
		return "fail";
	}
	
	public List<Category> getAllCategory() {
			
			return categoryRepository.findAll();
		}
	
	
	public List<Category> postAll(List<Category> modelList) {
		
		return categoryRepository.saveAll(modelList);
	}
	
	
    public List<Category> getAllPcategoryName() {
		
		return categoryRepository.getAllPcategoryName();
	}
	
	
}
