package com.practice;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;

public class NewVsNewInstance {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException, IOException {
		Object obj = Class.forName(args[0]).newInstance();
		
		System.out.println(obj.getClass().getName());
		
		Runtime obj1 = Runtime.getRuntime();			//This is called Factory method
		DateFormat obj2 = DateFormat.getDateInstance();
		
		NewVsNewInstance n1 = new NewVsNewInstance();
		NewVsNewInstance n2 = (NewVsNewInstance) n1.clone();
		
		FileInputStream fis = new FileInputStream("abc");
		ObjectInputStream ois = new ObjectInputStream(fis);
		NewVsNewInstance n3 = (NewVsNewInstance) ois.readObject();
	}

}
/*
*	If you want to create new Object from command line then you need to use newInstance()	
*
*	Default Constructor mainly will create for this purpose
*
*	while creating the Object this Default constructor will call
*
*	to create String obj :: java.lang.String
*	
*	in cmd arg pass NewVsNewInstance then this obj will create
*
*	If any Class not found which gave from cmd args then throws CNFException
*
*	If no Default Constructor then InstantiatinException will thrown
*
*
*/