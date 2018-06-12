package com.java;

public class Q44O {

	public static void doChange(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i]+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,20,30};
		doChange(arr);
		for(int a: arr) {
			System.out.print(a+", ");
		}
		//doChange(arr[0],arr[1],arr[2]);
		System.out.println(arr[0]+", "+arr[1]+", "+arr[2]);
		
		long s = 10_000;
		//String m=s.toString();
		Boolean array[];
	}

}
