package com.java;

public class Q1 {

	public static void main(String[] args) {
		StringBuffer msg = new StringBuffer("hello java!");
		int pos = 0;
		try {
		for(pos = 0 ; pos<12;pos++) {
			switch(msg.charAt(pos)) {
			case 'a':
			case 'e':
			case 'o':
				String uc= Character.toString(msg.charAt(pos)).toUpperCase();
				msg.replace(pos, pos+1, uc);		//at the index inclusive, till the index exclusive, String(So if at index- 4,5,"S") 5 will be excluded
				//System.out.println(msg.charAt(pos));

			}
		}
		}catch (Exception e) {
			System.out.print("Out of limits ");
			//e.printStackTrace();
		}
		System.out.println(msg);
		
	}

}
