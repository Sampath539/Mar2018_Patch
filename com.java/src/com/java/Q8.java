package com.java;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder s1 = new StringBuilder("Java");
		String s2 = "Love";
		s1.append(s2);
		s1.substring(4);
		System.out.println(s1.substring(4));
		int foundAt = s1.indexOf(s2);
		System.out.println(foundAt);
		
		
	}

}