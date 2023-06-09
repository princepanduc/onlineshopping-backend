package com.jaswanth.OnlineShopingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaswanth.OnlineShopingSystem.model.PurchaseDetails;

@Repository
public interface PurchaseDetailsRepo extends JpaRepository<PurchaseDetails, Long>{

}
