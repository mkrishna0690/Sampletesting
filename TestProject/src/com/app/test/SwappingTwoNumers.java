package com.app.test;

public class SwappingTwoNumers {

	public static void swapTwoNumbers(String args[]) {
		
		int a = 10;
		int b = 5;
		
		System.out.println("BEFORE");
		System.out.println("--A--:="+a);
		System.out.println("--B--:="+b);
		
		/*a = a + b;
		b = a - b;
		a = a + b;
		*/
		/*
		a = a * b;
		b = a / b;
		a = a / b;*/
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		

		System.out.println("AFTER");
		System.out.println("--A--:="+a);
		System.out.println("--B--:="+b);
		
	}
}
