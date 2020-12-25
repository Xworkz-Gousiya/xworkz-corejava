package com.xworkz.xworkzapp.util;

import java.util.Scanner;

//import java.util.Scanner;


import com.xworkz.xworkzapp.showroom.Showroom;
import com.xworkz.xworkzapp.showroom.dto.CarDTO;

public class ShowRoomUtil {
	public static void main(String[] args) {
		Showroom showroom=new Showroom();
		//CarDTO dto=new CarDTO();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of cars");
	int size=sc.nextInt();
	Showroom showroom=new Showroom();
	for(int i=0;i<size;i++) {
		CarDTO dto=new CarDTO();
		System.out.println("enter name of car");
		String name=sc.next();
		System.out.println("enter Model number");
		String modelNo=sc.next();
		System.out.println("enetr the price");
		double price=sc.nextDouble();
		
		dto.setName("name");
		dto.setModelNo("modelNo");
		dto.setPrice(price);
		showroom.addCars(dto);
	}
	showroom.displayCars();
	System.out.println("search car by name");
	String name=sc.next();
	showroom.displayByName(name);
	System.out.println("search car by price");
	double price=sc.nextDouble();
	showroom.updateCarPriceByName();
	System.out.println("update car ");
	String name=sc.next();
	showroom.deleteCarByName("nano");

	sc.close();
	
	CarDTO carDTO=new CarDTO();
	carDTO.setName("xl6");
	
	CarDTO carDTO1=new CarDTO();
	carDTO1.setName("nano");
	carDTO1.setPrice(1000000.00);
	
	CarDTO carDTO2=new CarDTO();
	carDTO2.setName("swift");
	carDTO1.setPrice(110000.00);
	
	CarDTO carDTO3=new CarDTO();
	carDTO3.setName("fortuner");
	carDTO1.setPrice(120000.00);
	
	CarDTO carDTO4=new CarDTO();
	carDTO4.setName("rapid");
	carDTO1.setPrice(1300000);
	
	showroom.addCars(carDTO);

	showroom.addCars(carDTO1);

	showroom.addCars(carDTO2);

	showroom.addCars(carDTO3);
	showroom.addCars(carDTO4);

	showroom.displayCars();
	showroom.updateCarPriceByName("rapid","1452");
	showroom.deleteCarByName("nano");
	showroom.displayCars();
	System.out.println("main method ended");
	
	
	
	}
}
