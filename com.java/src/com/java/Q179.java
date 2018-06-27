package com.java;

public class Q179 {
	
	public static void main(String[] args) {
		Boolean bool[] = new Boolean[2];
		bool[0] = new Boolean(Boolean.parseBoolean("true"));
		bool[1] = new Boolean(null);
		System.out.println(bool[0]+" "+bool[1]);
		
		String s1="true";
		String s2="True";
		System.out.println(s1.equalsIgnoreCase(s2));
	}
	

}
class YU{
	private int doP() {
		int x=100;
		return x++;
	}
}