package com.xworkz.workzapp;

public class Operation {
	
	public FarmDTO[] farmDTOs;
	
	public int index;

	private int i;
	
	public Operation(int size)
	{
		farmDTOs=new FarmDTO[size];
	}

	
	public  void addFarmDetails(FarmDTO farm)
	{
		System.out.println("adding farm details");
		farmDTOs[index++]=farm;
		System.out.println("added farm details");
	}
	
	public void showAllFarmDetails() {
		for(FarmDTO farmDTO:farmDTOs) {
			if(farmDTO!=null)
			{
				System.out.println(farmDTO.getTypeOfSoil()+" "+farmDTO.getArea()+" "+
			farmDTO.getTypeOfCrop());
			}
			else
				System.out.println("please add farm details");
		}
	}
	public void showAllFarmDetailsByCrop(String typeOfCrop) {
		for (int i = 0; i < farmDTOs.length; i++) 
			
		 {
			if(farmDTOs[i]!=null)
			{
				if(farmDTOs[i].getTypeOfCrop().equals(typeOfCrop)){
					
				System.out.println(farmDTOs[i].getTypeOfCrop()+""+farmDTOs[i].getArea()+
						" "+farmDTOs[i].getTypeOfSoil());
				
			}
			
}}
}	}

