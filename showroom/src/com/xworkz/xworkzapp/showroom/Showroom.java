package com.xworkz.xworkzapp.showroom;

import com.xworkz.xworkzapp.showroom.dto.CarDTO;

public class Showroom {
	
	public CarDTO carDTO[]=new CarDTO[8];
	public int currentIndex;
	
	public Showroom() {//constructor
		System.out.println("showroom object created");
		}
	
	public void addCars(CarDTO carDTO)
	{
		//boolean added;
		if(carDTO!=null) {
		System.out.println(this.currentIndex);
		this.carDTO[currentIndex]=carDTO;
		this.currentIndex++;
		//added=true;
		//return added;
		
	}
		
	else if(carDTO==null) {
		
		System.out.println("car dto is not added");
	}

	}
	
	
	
		                              /*System.out.println("showing car details");
										for (int i = 0; i < carDTO.length; i++) {
												if(carDTO[i]!=null)
																	{
																System.out.println(carDTO[i].getName);
															}
															else if
															
														}
														
														System.out.println("end of showing car details");
													}*/
		public void displayCars()
		{											//CarDTO[]=carDTOs=null;
		System.out.println("showing car details");
		for (int i = 0; i < carDTO.length; i++) {
			if (carDTO[i]!=null) {
				System.out.println(carDTO[i].getName());
			}else
			{
				System.out.println("car not available");
			}	
			}
		 
				System.out.println("end of showing details");
			
		}
		public void displayByName(String name) {
			for(CarDTO carDTOs:carDTO) {
				if(carDTOs!=null) {
					if(carDTOs.getName().equals(name)) {
					System.out.println("car is present by name");
					System.out.println(carDTOs.getName()+" "+carDTOs.getModelNo()+" "+carDTOs.getPrice());
				}
			}
				else {
					System.out.println("please add car details");
				}
				}
		}
	public void displayByPrice(double price)
	{
		
		for(CarDTO carDTOs:carDTO) {
			if(carDTOs!=null) {
				if(carDTOs.getPrice()==price) {
					System.out.println("car by price");
					System.out.println(carDTOs.getName()+" "+carDTOs.getModelNo()+" "+
					carDTOs.getPrice());
				}
			}
			else
			{
				System.out.println("add car details");
				
			}
	}
}
	
	public void deleteCarByName(String name) {
		System.out.println("starting with deleting the car by name");
		for (int i = 0; i < carDTO.length; i++) {
			if(carDTO[i]!=null) {
				
				if(carDTO[i].getName().equals(name))
						{
					carDTO[i]=null;
						}
						
			}
			
		}
	}
	public void updateCarPriceByName(String name,String newName) {
		System.out.println("starting with updating the car by name");
		for (int i = 0; i < carDTO.length; i++) {
			if(carDTO[i]!=null) {
				
				if(carDTO[i].getName()==name)
						{
					carDTO[i].setPrice(i);
					carDTO[i].setModelNo("lower end");
					System.out.println("price updated");
					System.out.println(carDTO[i].getModelNo()+" "+carDTO[i].getName()+" "+carDTO[i].getPrice());
						}

	}
		}
	}
}
	
	
	


