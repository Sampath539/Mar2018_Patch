package com.java;

public class Q6 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		for(int i: a) {
			if(i<2) {
				continue;			//continue means it will go to loop again and leaves other logic after continue
			}
			System.out.print(i);
			if(i==3) {
				continue;
			}
		}

	}

}
