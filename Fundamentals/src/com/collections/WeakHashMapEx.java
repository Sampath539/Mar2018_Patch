package com.collections;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapEx {

	public static void main(String[] args) throws InterruptedException {
		//HashMap h = new HashMap(); 		//HashMap is not eligible for gc() because HashMap dominates gc()
		WeakHashMap h = new WeakHashMap();	//WeakHashMap is eligible for gc(), it can't dominate gc(), in the gc() at last finalize() will collect
		Temp t = new Temp();
		h.put(t, "A");
		System.out.println(h);
		t=null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(h);

	}

}
class Temp{
	public String toString() {
		return "temp";
	}
	public void finalize() {
		System.out.println("finalize");
	}
}