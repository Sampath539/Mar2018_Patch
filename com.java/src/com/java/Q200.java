package com.java;

public class Q200 {
static int count;
	Q200(){
		super();
		count++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q200 q1 = new Q200();
		Q200 q2 = q1;
		Q200 q3 = null;
		q2.num =60;
		Marks(q2);
		System.out.println(Q200.count);
		
	}

	int num;
	public static void Marks(Q200 q) {
		q.num  += 10;
	}
}
