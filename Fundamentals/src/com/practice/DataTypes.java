package com.practice;

public class DataTypes {

	public static void main(String[] args) {
		//byte b=(byte)129;
		//int b = ' '; //to check char values
		//System.out.println(b);

	}

}
/*
*
*	\\s will be a space
*	
*	Implicit type casting=== Converting from small type values to bigger type values(ex:- byte to int)--No loss
*	Explicit type casting=== Converting from bigger type values to smaller type values(ex:- int to byte)-loss of precedence
*
*	 byte(1)(-128-127)->short(2)(-32,768 - 32,767)
*												=
*												--->int(4)->long(8)->float(4)(+- 3.4028___)->double(8)
*												=
*					char(2)(0 to 65,536 (unsigned))
*
*		boolean not defined with size	
*
*		byte can store till 128 bits...So If you assign 128 prints -128...If u assign 129 prints -127 byte value
*	
*	char:::
*			A=65
*			a=97
*			space=32
*
*/