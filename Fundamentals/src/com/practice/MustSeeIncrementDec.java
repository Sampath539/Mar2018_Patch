package com.practice;

public class MustSeeIncrementDec {

	public static void main(String[] args) {
		int x=3;
		int y = ++x * 4/x-- + --x;
		/*
		 * 1. left to right execution
		 * 2. ++x = ++3 = 4 => 4 * 4/x-- + --x
		 * 3. x-- = 4-- = 4 => 4 * 4/4 + --x		(x will be decreased after operation)
		 * 4. --x = --3 = 2 => 4 * 4/4 + 2  = 6
		 * 
		 * Now positions x=2, y=6
		 * finally y+x is 6 + 2 = 8
		 * 
		*/
		System.out.println("y+x is "+(y+x));
		/*
		 * There are 2 type of conversions
		 * 
		 * Wrapper classes will have a method to convert String to primitive ( float f = Float.parseFloat(String)) So returns primitive(float)
		 * we can convert String to wrapper by (Float f1 = f.valueOf(String)) returns Float wrapper
		
*/
	}

}
