package com.example.demo;

public class NormalCar implements Car{
   
	public String ownerName;
	
	public void  setOwnerName(String ownerName) {
		 this.ownerName = ownerName;   
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	   
	public void getInfo() {
		System.out.println(  ownerName + " owns  a Normal Car"  );
	}
	
}

