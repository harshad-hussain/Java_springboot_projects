package com.example.tax;

public class IncomeTax implements Tax{
    /*
    1. Create the following attributes.
        a. taxableAmount (double)
        b. taxAmount (double)
        c. isTaxPayed (boolean)
    2. Make this class an implementation of Tax interface and override the interface methods.
    3. Using constructor initialize the isTaxPayed boolean false.
     */
	
	private double taxableAmount;
	private double taxAmount;
	private boolean isTaxPayed;
	
	
	public IncomeTax() {
		this.isTaxPayed = false;
	}
	 
	
	public void setTaxableAmount(double taxableAmount) {
	        this.taxableAmount = taxableAmount;
	}
	
	public void  calculateTaxAmount() {
		if(taxableAmount <= 300000 ) {
			taxAmount = 0;
		}else if(taxableAmount <=600000) {
			taxAmount = taxableAmount * 0.05;
		}else if (taxableAmount <= 900000) {
			taxAmount = taxableAmount *0.10;
		}else if (taxableAmount <= 1200000) {
			taxAmount = taxableAmount *0.15;
		}else if(taxableAmount <=1500000) {
			taxAmount = taxableAmount*0.20;
		}else {
			taxAmount = taxableAmount *0.30;
		}
	}
	
	public double getTaxAmount() {
		 return taxAmount;
	}
	
	public String getTaxType() {
		return "income";
	}
	
	public boolean isTaxPayed() {
		return isTaxPayed;
	}
	
	public void payTax() {
		
		System.out.println("Hi, your income tax is paid ");
		isTaxPayed = true;
	}
	
	
	
	
	

}
