package com.java;

import java.time.LocalDate;
import java.time.Period;

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
		
		LocalDate l = LocalDate
				.of(2018, 3, 15);
		Period p = Period.ofDays(1);
		l.plus(p);
		System.out.println(l);
		
	}

}
