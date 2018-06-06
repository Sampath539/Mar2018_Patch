package com.java;

public class Q30 {

	public static void main(String[] args) {
		String[][] arra = new String[3][];
		//System.out.println(arra[0].length);
		arra[0] = new String[] {"rose","lily"};
		arra[1] = new String[] {"apple","bananas","cherry","grape"};
		arra[2] = new String[] {"beans","carrot","potato"};
		/*for (int i = 0; i < 3; i++) {
			for (int j = 0; j < arra[i].length; j++) {
				arra[i][j] = arra[i][j].toUpperCase();
				//System.out.println(arra[i][j]);
			}
		}*/
		try {
		for(String a[]: arra) {
			for(String b:a) {
				b.toUpperCase();
			}
		}
		}catch(NullPointerException e) {
			System.out.println("NPE");
		}
		System.out.println(arra[0][1]);
		System.out.println(arra[2].length);

	}

}
