package com.dinislam.OnlineShopingSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.dinislam.OnlineShopingSystem.model.Category;



@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

	
	 @Query(value = "SELECT * FROM category ", nativeQuery = true)
	    List<Category> getAllPcategoryName();

}
