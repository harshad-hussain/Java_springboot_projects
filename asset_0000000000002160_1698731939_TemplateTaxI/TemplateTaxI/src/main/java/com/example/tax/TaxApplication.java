	package com.example.tax;
	
	import java.util.Scanner;
	
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	
	@SpringBootApplication
	public class TaxApplication {
	
		public static void main(String[] args) {
			// Take ClassPathXmlApplicationContext from applicationContext.xml file
	         
			Scanner s = new Scanner(System.in);
			
			System.out.println("Choose tax type");
			System.out.println("1. Income Tax");
			System.out.println("2. Property Tax");
			int  userchoice = s.nextInt();
			
			System.out.println("Enter taxable amount:");
			double taxableAmount =s.nextDouble();
	
			String taxChoice ="";
			
			
			ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
		    switch(userchoice) {
		    case 1:
		    	taxChoice="incomeTax";
		    	break;
		    case 2:
		    	taxChoice ="propertyTax";
		    	break;
		    default:
		    	System.out.println("Invalid input");
		    	return;
		    }
		    
			
		
			Tax tax = (Tax)context.getBean(taxChoice);
			  tax.setTaxableAmount(taxableAmount);
			  tax.calculateTaxAmount();
			  System.out.println(tax.getTaxAmount());
			  System.out.println(tax.getTaxType());
			  if(!tax.isTaxPayed()) {
				    tax.payTax();
				}
				else {
				    System.out.println("Tax already paid");
				}
	
	}
	}
