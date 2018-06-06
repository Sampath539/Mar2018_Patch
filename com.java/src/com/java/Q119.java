package com.java;

public class Q119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=10;
		for(;row>0;) {
			int col=row;
			while(col>=0) {
				System.out.print(col+" ");
				col -= 2;
			}
					row = row/col;
					//System.out.println(row);
		}
		
	}

}
