package com.learn.oop.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> laptops =  new LinkedHashSet<>();
		
		laptops.add("dell");
		laptops.add("HP");
		laptops.add("ASUS");
		laptops.add("Acer");
		
		Iterator<String> itr = laptops.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
