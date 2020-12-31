package com.xworkz.xworkzapp;

public class CityWard {
	public CityWardDTO[] cityDTO= new CityWardDTO[2] ;
	public int index;
	
	

	public void addCityWardtDetails(CityWardDTO ward) {
	
		if( ward.getPopulation() != 0 && ward.getWardName() !=null && ward.getWardNo() != 0)
		{
			if( ward.getPopulation()>=5000) {
				System.out.println("city wards deatils are coreect");
				cityDTO[index++] = ward;
				System.out.println("city ward details are added");
			
		}
			else {
			System.out.println("the population should be greater than 5000");
			}
		}
		else{
			System.out.println("the ward no ,ward name, population cant be empty");
		}
		
	}
	
	public void showAllWardDetails() {
		for(int i=0;i<cityDTO.length;i++)   {
			if (cityDTO[i] != null) {
				System.out.println("showing ward details");
				System.out.println("ward name is:"+cityDTO[i].getWardName()+" "+"ward no is"+cityDTO[i].getWardNo()+" "+"corporator is"+cityDTO[i].getCorporator()+" "+"population is:"+cityDTO[i].getPopulation()+" "+"Area in sq kilometers is:"+cityDTO[i].getAreaInSqKiloMeters());
			
				System.out.println("end of showing ward details ");
				}
			} 
			}
		
	

	public void searchCityByWardNo(int wardNo) {
		for(int i=0;i<cityDTO.length;i++) {
			if(cityDTO!=null) {
				if(cityDTO[i].getWardName().equals(wardNo)) {
					System.out.println("ward name is:"+cityDTO[i].getWardName()+" "+
				"ward no is"+cityDTO[i].getWardNo()+" "+"corporator is"+cityDTO[i].getCorporator()+
				" "+"population is"+cityDTO[i].getPopulation()+" "+"Area in kilometers is:"+
				cityDTO[i].getAreaInSqKiloMeters());
				}
			}
		}
	}
		public CityWardDTO returnCorporatorByWardNo(int wardNo) {
			CityWardDTO dto=null;
			for(int i=0;i<cityDTO.length;i++) {
				 if(cityDTO != null) {
					 dto = cityDTO[i];
					 if(cityDTO[i].getWardNo()==wardNo)
					 System.out.println("corporate name by ward no is:"+cityDTO[i].getCorporator());
				 }
		}
			return dto;
	}
}


