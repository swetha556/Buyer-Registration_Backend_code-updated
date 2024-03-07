package com.example.buyer.service;

import org.springframework.http.ResponseEntity;

import com.example.buyer.entity.Buyer;
import com.example.buyer.entity.Login;
import com.example.buyer.exception.IncorrectPasswordException;
import com.example.buyer.exception.UserExistsException;
import com.example.buyer.exception.UserNotFoundException;

public interface BuyerService {

	//public Buyer LoginBuyer(String buyeremail , String buyerpassword)throws UserNotFoundException, IncorrectPasswordException ;

	String RegisterBuyer(Buyer buyer);

	public String loginBuyer(Login login);

	public String resetPassword(String buyeremail,String buyerpassword);

}
