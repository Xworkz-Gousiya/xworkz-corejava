package com.xworkz.farmutil;

import java.util.Scanner;

import com.xworkz.workzapp.FarmDTO;
import com.xworkz.workzapp.Operation;

public class FarmUtil {
	
	public static void main(String[] args) {
		/*FarmDTO farmOne=new FarmDTO("black","2acre","peanuts");
		FarmDTO farmTwo=new FarmDTO("red","1 acre","cotton");
		Operation operation=new Operation(2);*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter farm size");
		
		int size=sc.nextInt();
		Operation operation=new Operation(size);
		for(int i=0;i<size;i++) {
			FarmDTO dto=new FarmDTO();
			System.out.println("enter the"+(i+1)+"Farm details");
			System.out.println("enter the type of soil");
			String typeOfSoil=sc.next();
			System.out.println("enter the area");
			String area=sc.next();
			System.out.println("enter the type of crop");
			String typeOfCrop=sc.next();
			dto.setTypeOfSoil(typeOfSoil);
			dto.setArea(area);
			dto.setTypeOfCrop(typeOfCrop);
			dto.setTypeOfCrop(typeOfCrop);
			operation.addFarmDetails(dto);
			//operation.showAllFarmDetailsByCrop();
			
			//sc.close();
		}
		operation.showAllFarmDetails();
		System.out.println("find the crop by name");
	String typeOfCrop=sc.next();
		operation.showAllFarmDetailsByCrop(typeOfCrop);
		sc.close();
		}
		//Operation.addFarmDetails(farm);
		//Operation.addFarmDetails(farm);
		
		//operation.addFarmDetails(farmOne);

		//operation.addFarmDetails(farmTwo);
		//operation.addFarmDetails(farmTwo);
	}
	


