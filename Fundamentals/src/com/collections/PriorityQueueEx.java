package com.collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	//If you want to create program for prior to processing then Queue is the best
	//Usually queue follows FIFO, but we can prioritize based on our requirement
	//LinkedList class also implements Queue
	//offer(Obj o), poll()(Removes the elements and returns headelement, If empty returns null), remove()(removes the elements and returns headelement, if empty then exce No SuchEle Exc)
	//peek()(To return head elem of queue, if empty returns null), element()(To return head elem of queue, if empty retunrs exce)
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue(new MyComparator());
		p.offer("A");
		p.offer("B");
		p.offer("C");
		p.offer("D");
		System.out.println(p);
		for(int i=1; i<=4; i++) {
		
			//System.out.println(p.peek());		//Returns head element
		}
		//System.out.println(p.element());
		System.out.println(p.poll());
		//System.out.println(p.remove());
		System.out.println(p.contains("B"));

	}

}

class MyComparator implements Comparator{
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		return -s1.compareTo(s2);
	}
}