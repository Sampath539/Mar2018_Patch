package com.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx {

	//Keyvalue pairs, and Key and value should be String
	//getProperty(String pname), setProperty(String pname, String pvalue)
	//Enumeration propertyNames()
	//void load(InputStream i), store(OutputStream o, String comment)	
	public static void main(String[] args) throws IOException {
		

		Properties p = new Properties();
		FileInputStream fi = new FileInputStream("E:\\STUDY\\Mar2018\\Fundamentals\\bin\\com\\collections\\constants.properties");
		p.load(fi);
		System.out.println("P "+p);
		Enumeration e = p.propertyNames();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		p.setProperty("Company", "IBM");
		System.out.println("Company "+p.getProperty("Company"));
		FileOutputStream fo = new FileOutputStream("..\\abc123.txt");
		p.store(fo, "new");				//It will store all the p loaded properties into abc123.txt(will create in eclipse workspace path.. Mar2018//abc123.txt)
		FileInputStream fi1 = new FileInputStream("..\\abc123.txt");
		Properties p1 = new Properties();
		p1.load(fi1);
		p1.remove("age");
		System.out.println("P1 "+p1);
	}

}
