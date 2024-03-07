package com.example.buyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.buyer.entity.Buyer;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer,String>{

	Buyer findByBuyeremail(String buyeremail);

}