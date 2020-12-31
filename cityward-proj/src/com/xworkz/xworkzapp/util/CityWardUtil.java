package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.CityWard;
import com.xworkz.xworkzapp.CityWardDTO;
import com.xworkz.xworkzapp.WardName;

public class CityWardUtil {
	
	public static void main(String[] args) {
		CityWard city=new CityWard();
		
		CityWardDTO cityWard=new CityWardDTO();
		cityWard.setWardName(WardName.RAJAJINAGAR);
		cityWard.setWardNo(2);
		cityWard.setPopulation(5000);
		cityWard.setCorporator("raju");
		cityWard.setAreaInSqKiloMeters("50 sqmeters");
		
		CityWardDTO cityWardOne=new CityWardDTO();
		cityWardOne.setWardName(WardName.JPNAGAR);
		cityWardOne.setWardNo(3);
		cityWardOne.setPopulation(6000);
		cityWardOne.setCorporator("raj");
		cityWardOne.setAreaInSqKiloMeters("5000 sqmeters");
		
		city.addCityWardtDetails(cityWard);
		city.addCityWardtDetails(cityWardOne);
		city.showAllWardDetails();
		city.searchCityByWardNo(3);
		city.returnCorporatorByWardNo(2);


	}


}
