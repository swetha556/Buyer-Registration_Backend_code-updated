package com.example.buyer.entity;

public class Login {
	
	private String buyeremail;
	private String buyerpassword;
	public Login (String buyeremail, String buyerpassword) {
		
		this.buyeremail = buyeremail;
		this.buyerpassword = buyerpassword;
	}
	public Login () {
		
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
		return "Login [buyeremail=" + buyeremail + ", buyerpassword=" + buyerpassword + "]";
	}
	

}