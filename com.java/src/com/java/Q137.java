package com.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q137 {

	
	public static void main(String[] args) {
		LocalDate l1 = LocalDate.now();
		LocalDate l2 = LocalDate.of(2018, 5, 29);
		LocalDate l3 = LocalDate.parse("2018-05-29", DateTimeFormatter.ISO_DATE
				);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);

	}

}
