package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = -5;
		int v2 = v1--;
		int v3 = 0;
		if(v2 < 0) {
			v3 = v2++;
			
		}
		//System.out.println(v3);
		List<String> a = new ArrayList();
		a.add("Robb");
		a.add("Bran");
		a.add("Rick");
		a.add("Bran");
		boolean n =a.removeAll(Collections.emptyList());
		
		System.out.println(n);
		
		String s="hel";
		System.out.println(s.substring(4, 7));

	}

}
