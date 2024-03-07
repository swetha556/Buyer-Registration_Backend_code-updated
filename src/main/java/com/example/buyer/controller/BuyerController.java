package com.example.buyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.buyer.entity.Buyer;
import com.example.buyer.entity.Login;
import com.example.buyer.exception.UserExistsException;
import com.example.buyer.service.BuyerService;


@RestController
@RequestMapping("/buyer")
public class BuyerController {

	@Autowired
	private BuyerService buyerService;
	
	
	@PostMapping("register")
	public String RegisterBuyer(@RequestBody Buyer buyer){
		return this.buyerService.RegisterBuyer(buyer);
	}
	
	@PostMapping("/login")
	public String loginBuyer(@RequestBody Login login) {
		return buyerService.loginBuyer(login);
	}
	
	@PutMapping("/passwordreset/{email}/{password}")
	public String resetPassword(@PathVariable() String email,@PathVariable() String password) {
		return buyerService.resetPassword(email,password);
	}

	}
	

