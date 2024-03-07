package com.example.buyer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.buyer.repository.BuyerRepository;
import com.example.buyer.entity.Buyer;
import com.example.buyer.service.BuyerService;

@SpringBootTest
class BuyerLoginandRegisterApplicationTests {

	 @Autowired
	    private BuyerService buyerService;

	    @MockBean
	    private BuyerRepository buyerRepository;

	    @Test
	    public void saveBuyerTest() {
	       Buyer buyer = new Buyer(1,"Swetha","swetha@gmail.com", "swetha08!");
	        when(buyerRepository.save(buyer)).thenReturn(buyer);
	        assertEquals("success",buyerService.RegisterBuyer(buyer));
	    }
	    
	    
	    
}
