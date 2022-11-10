package com.learn.oop.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> CustomerQueue = new PriorityQueue<>();
		 CustomerQueue.add("Radha");
		 CustomerQueue.add("Krishna");
		 CustomerQueue.add("Shiva");
		 
		 System.out.println("LEAD is " +CustomerQueue.peek());
		 
			Iterator<String> itr = CustomerQueue.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
		}
		 
		 
		
	}

}
