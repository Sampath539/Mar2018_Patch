package com.java;

import java.io.IOException;

public class Q40 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
X a = new X();
a.prints();
	}

}
class X{
	public void prints() throws IOException  {
		throw new IOException();
	}
}
