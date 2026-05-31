package com.example.demo;

public class truck implements Car{
   
	public String ownerName;
	Tyre tyre;
	
	public truck(Tyre tyre) {
		this.tyre=tyre;
	}
	
	public void  setOwnerName(String ownerName) {
		 this.ownerName = ownerName;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void getInfo() {
		System.out.println(  ownerName + " owns  a Truck" + tyre.getTyreInfo() );
	}
	
}

