package com.example.demo;

public class NormalCar implements Car{
   
	public String ownerName;
	 Tyre tyre;
	
	public NormalCar(Tyre tyre) {
		this.tyre=tyre;
	}
	public void  setOwnerName(String ownerName) {
		 this.ownerName = ownerName;   
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	   
	public void getInfo() {
		System.out.println(  ownerName + " owns  a Normal Car" + tyre.getTyreInfo() );
	}
	
}

