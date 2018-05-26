package com.java;

public class Q12 {

	public static void main(String[] args) {
		int a[][] = new int[3][1];				//int[3][1] So, a.length means 3-- then a[0].length means 1--a[1] / a[2] also will be 1
		
		//System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i].length);
			for(int j=0;j<a[i].length;j++) {
				//System.out.println(a[i].length);
				a[i][j] =10;
				System.out.println("a["+i+"]["+j+"]");
			}
		}

	}

}
