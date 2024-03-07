package com.example.buyer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Buyerdata")
public class Buyer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int buyerid;
	
    @Pattern(regexp="^[a-zA-Z]{5,15}$")
	private String buyername;
	
    @Pattern(regexp = ".*@gmail\\.com$")
	private String buyeremail;
	
	@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$%^&*()_+])[A-Za-z\\d!@#$%^&*()_+]{8,16}$")
	private String buyerpassword;
	

	public Buyer() {
		super();
	}
 
	
 
	public Buyer(int buyerid, String buyername, String buyeremail, String buyerpassword) {
		super();
		this.buyerid = buyerid;
		this.buyername = buyername;
		this.buyeremail = buyeremail;
		this.buyerpassword = buyerpassword;
	}



	public int getBuyerid() {
		return buyerid;
	}
 
	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}
 
	public String getBuyername() {
		return buyername;
	}
 
	public void setBuyername(String buyername) {
		this.buyername = buyername;
	}
 
	public String getBuyeremail() {
		return buyeremail;
	}
 
	public void setBuyeremail(String buyeremail) {
		this.buyeremail = buyeremail;
	}
 
	public String getBuyerpassword() {
		return buyerpassword;
	}
 
	public void setBuyerpassword(String buyerpassword) {
		this.buyerpassword = buyerpassword;
	}



	@Override
	public String toString() {
		return "Buyer [buyerid=" + buyerid + ", buyername=" + buyername + ", buyeremail=" + buyeremail
				+ ", buyerpassword=" + buyerpassword + "]";
	}
 
	
 
	
}
