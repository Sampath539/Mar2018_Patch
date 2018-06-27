package com.java;

public class Q81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[][]
				=new String [2][2];
		s[0][0] = "red";
		s[0][1] = "blue";
		s[1][0] = "yello";
				s[1][1] = "white";
		for(int i=0;i<2;++i) {
			for(int j =0;j<2;++j) {
				System.out.print(s[i][j]+":");
			}
		}
	}

}
