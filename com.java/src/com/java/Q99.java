package com.java;

public class Q99 {

	public static void main(String[] args) {
		String a = "A ";
		a=a.concat("B ");
		String c ="C ";
		a=a.concat(c);
		a.replace('C', 'D');
		a=a.concat(c);
		//System.out.println(a);	
		
		String n="C";
		switch(n) {
		case "1":
			System.out.println("1");
		default:
			System.out.println("Defalt");
			break;
		case "C": 
			System.out.println("10");
			
		}
	}

}
