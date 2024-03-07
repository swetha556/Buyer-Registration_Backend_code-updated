package com.example.buyer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.buyer.entity.Buyer;
import com.example.buyer.entity.Login;

import com.example.buyer.repository.BuyerRepository;


@Service
public class BuyerServiceImpl implements BuyerService{
	
	@Autowired
	private BuyerRepository buyerrepo;

	@Override
	public String RegisterBuyer(Buyer buyer) {
		Buyer credentials = buyerrepo.findByBuyeremail(buyer.getBuyeremail());
		if(credentials == null) {
			buyerrepo.save(buyer);
		  return "success";
		}
		return "already registered";
	}
			
			
	@Override
	public String loginBuyer(Login login) {
		Buyer b2=buyerrepo.findByBuyeremail(login.getBuyeremail());
		if(b2 == null) {
			return "not registered";
		}
		if(b2.getBuyerpassword().equals(login.getBuyerpassword())) {
			return "logged in";
		}
		return "error";
	}

	@Override
	public String resetPassword(String buyeremail,String buyerpassword) {
		// TODO Auto-generated method stub
		Buyer b3=buyerrepo.findByBuyeremail(buyeremail);
		b3.setBuyerpassword(buyerpassword);
		buyerrepo.save(b3);
		return "password reset done";
	}
	}
	
	
	
	
	


