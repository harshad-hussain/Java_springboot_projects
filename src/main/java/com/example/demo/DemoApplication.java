package com.example.demo;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter owner name");
		String ownerName = s.nextLine();
		
		System.out.println("Enter the choice of your vehicle");
		System.out.println("1) SportsCar");
		System.out.println("2) NormalCar");
		System.out.println("3) Truck");
		
		int userChoice = s.nextInt();
		
		String vehicleChoice="";
		
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		switch(userChoice) {
		case 1:
			vehicleChoice ="normalCar";
			break;
		case 2:
			vehicleChoice ="sportsCar";
			break;
		case 3:
			vehicleChoice ="truck";
			break;
		default:
		  	System.out.println("Invalid input");
	    	return;
		}
		
		Car car = (Car) context.getBean(vehicleChoice);
		car.setOwnerName(ownerName);
		car.getOwnerName();
		car.getInfo();
		
		
		
	}

}
