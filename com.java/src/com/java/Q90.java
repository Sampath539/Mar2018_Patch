package com.java;

public class Q90 {

	public static void main(String[] args) {
		Q90A q1 = new Q90A(50);
		Q90A q2 = new Q90A(125);
		Q90A q3 = new Q90A(100);
		q1.doPrint();
		q2.doPrint();
		q3.doPrint();

	}

}
class Q90A{
	int a;
	static int b;
	public Q90A(int c){
		if(b<c) {
			b=c;
			this.a=c;
		}
	}
	public void doPrint() {
		System.out.println("a :"+a+" b:"+b);
	}
}