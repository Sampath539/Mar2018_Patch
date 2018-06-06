package com.java;

public class Q124 {

	DBConf conf(String name, String password) {
		DBConf n = new DBConf();
		n.name=name;
		n.password=password;
		System.out.println(n);
		return n;
	}
	
	public static void main(String[] args) {
		Q124 q = new Q124();
		q.conf("Manager", "Manager");
	}

}
class DBConf{
	String name;
	String password;
	@Override
	public String toString() {
		return "DBConf [name=" + name + ", password=" + password + "]";
	}
	
}