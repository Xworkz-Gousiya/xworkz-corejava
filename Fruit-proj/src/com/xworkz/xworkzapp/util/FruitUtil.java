package com.xworkz.xworkzapp.util;

import com.xworkz.Mango;
import com.xworkz.fruit.Fruit;

public class FruitUtil {
	public static void main(String[] args) {
		
	
	Fruit fruit=new Mango();//upcasting
	Mango mango=(Mango) fruit;
	fruit.color="yellow";
	fruit.price=21365.2365;
	fruit.toMakeHappy();
	System.out.println(fruit.color+" "+fruit.price);
}

}
