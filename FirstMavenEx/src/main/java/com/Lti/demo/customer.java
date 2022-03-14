package com.Lti.demo;

public class customer {
	
	private int custno;
	private String custname;
	private double billAmount;
	
	

	
	public int getCustno() {
		return custno;
	}
	public void setCustno(int custno) {
		this.custno = custno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public customer() {
		super();
	}
	@Override
	public String toString() {
		return "customer [custno=" + custno + ", billAmount=" + billAmount + "]";
	}

	
	
	
	

}
