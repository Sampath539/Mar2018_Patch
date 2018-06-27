package com.java;


public class SumTest {

	
	public static void doSum(Integer i, Integer j) {
		System.out.println("Integer values is "+(i+j));
	}
	public static void doSum(int i, int j) {
		System.out.println("int values is "+(i+j));
	}
	public static void doSum(double i, double j) {
		System.out.println("double values is "+(i+j));
	}
	public static void doSum(float i, float j) {
		System.out.println("float values is "+(i+j));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doSum(10,20);
		doSum(10.0, 20.0);
		
		int num[];
		num = new int[2];
		num[0] = 10;
		num[1] = 20;
		
		num = new int[4];
		num[2]=30;
		num[3]=40;
		for(int n : num) {
			System.out.print(n+" ");
		}
		int data[] = { 2010, 2013, 2014, 2015, 2016};
		int key=2014;
		int count =0;
		for(int e: data) {
			if(e!=key) {
				
				continue;
				//count++;
			}
		}
		System.out.println(count +"Found");
		int a[] = {10,20,30,40,50};
		int x = a.length;
		while(x>0) {
			
			System.out.print(a[--x]+" ");
		}
		
	}

}
