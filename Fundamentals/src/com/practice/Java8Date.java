package com.practice;

import java.sql.Timestamp;
import java.time.Clock;
import java.time.Instant;
import java.util.TimeZone;

public class Java8Date {

	//In Java8 we have Date/Time API's included
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Instant.now(Clock.systemDefaultZone()));
		System.out.println(TimeZone.getDefault());
		System.out.println(new Timestamp(System.currentTimeMillis()));
		System.out.println(TimeZone.getDefault());
	}

}
