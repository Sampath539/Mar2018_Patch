package com.java;

import java.util.ArrayList;
import java.util.List;

public class Q45 {

	public static void m1(int[] a) {
		for(int j=0;j<a.length;j++) {
			a[j]=a[j]+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> g=new ArrayList<>();
		g.add(20);g.add(34);g.add(56);g.add(45);
		System.out.println(g);
		g.removeIf(e->e%2==0
				);
		System.out.println(g);
	}

}
