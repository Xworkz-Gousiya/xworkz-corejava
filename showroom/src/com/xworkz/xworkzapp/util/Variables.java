package com.xworkz.xworkzapp.util;

public class Variables {
	//public class StudentDetails {
	    public void StudentAge() 
	    { // local variable age 
	        int age = 0; 
	        age = age + 5; 
	    } 
	  
	    public static void main(String args[], String age) 
	    { 
	        // using local variable age outside it's scope 
	        System.out.println("Student age is : " + age); 
	    } 
	} 


