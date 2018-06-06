package com.java;

public class Q146 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestQ q = new TestQ(args);
q.main();

	}

}
class TestQ{
	public String[] main = new String[2];
	TestQ(String[] main) {
		for(int i=0;i<main.length;i++) {
			this.main[i]=main[i]+5;
		}
	}
	public void main() {
		System.out.println(main[0]+main[1]);
	}
}