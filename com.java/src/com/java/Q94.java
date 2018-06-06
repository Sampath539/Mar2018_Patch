package com.java;


public class Q94 {

	public static void main(String[] args) {
		
	}

}
class Car{
	String type = "4W";
	int maxSpeed = 100;
	Car(String type, int maxSpeed){
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}
class V extends Car{
	String trans;
	V(String trans){
		super("d",1);			//corrected, this call should be there if we extend any class having constructor
		this.trans=trans;
	}
	V(String type, int maxSpeed, String trans){
		super(type,maxSpeed);
		this.trans=trans;				//Constructor call must be first
	}
}