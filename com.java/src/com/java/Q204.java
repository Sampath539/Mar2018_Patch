package com.java;

public interface Q204 {
	

	public static void main(String[] args) {
	
		try {
			Double va = Double.valueOf("200D");
			Float f = Float.parseFloat("10F");
			System.out.println(f);
			
			System.out.println(va);
		}catch(NumberFormatException e
				) {
			
		}
		
		System.out.println(28+5 <= 4+29);
		System.out.println((28+5)<=(4+29));
	}

}
