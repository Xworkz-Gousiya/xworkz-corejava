package com.xworkz.xworkzapp.exceptionevent;

public class ExceptionHandling {

	public String name;
	public int a[] = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		// null pointer exceptional handling
		System.out.println("main method started");
		try {

			ExceptionHandling exceptionhandling = new ExceptionHandling();
			exceptionhandling.name = "tata";
			System.out.println(exceptionhandling.name);
		} catch (NullPointerException e) {
			System.out.println("name is null,cannot access it");
			e.printStackTrace();
		}
		System.out.println("main method ended");
		

		// array out of bound exception handling
		System.out.println("array main method started");
		try {
			ExceptionHandling exceptionhandling1 = new ExceptionHandling();
			System.out.println(exceptionhandling1.a[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("array size is out of bound");
		}
		System.out.println("main method ended");

		// Srithemetic Exception handling
		System.out.println("main method started");

		int c = 0;
		try {
			int a = 23;
			int b = 0;
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("zero cannot be divided by 23");
			e.printStackTrace();
		}
		System.out.println(c);
		System.out.println("main method ended");
	}
}
