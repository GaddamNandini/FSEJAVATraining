package com.learn.oop.collection;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> mem = new HashSet<String>();
		mem.add("imile");
		mem.add("aryan");
		mem.add("sundar");
		mem.add("arpitha");
		
		mem.remove("aryan");
		
		Iterator<String> itr = mem.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
