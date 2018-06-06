package com.java;

import java.util.ArrayList;
import java.util.List;

public class Q176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List objs = new ArrayList<>();
		
		Q q1 = new Super();
		Q q2 = new Sub();
		Super q3 = new Sub();
		objs.add(q1);
		objs.add(q2);
		objs.add(q3);
		for(Object o: objs
				) {
			System.out.println(o.getClass().getName());
		}
		
	}

}
interface Q{
	
}
class Super implements Q{
	
}
class Sub extends Super{
	
}