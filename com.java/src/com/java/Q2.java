package com.java;

import java.util.ArrayList;
import java.util.List;

public class Q2{

public static void main(String[] args) {
//List<A> l = new ArrayList<A>();
List<A> l = new ArrayList<A>();
l.add(new A());
l.add(new B());
l.add(new C());
for(A a : l) {
	System.out.println(a.doStuff("Java"));
}
}
}

class A{
	
	public String doStuff(String a) {
		return a;
	}
}
class B extends A{
public String doStuff(String a) {
	return a.replace('a', 'e');
}
}
class C extends B{
	public String doStuff(String a) {
		return a.substring(2);
	}
}