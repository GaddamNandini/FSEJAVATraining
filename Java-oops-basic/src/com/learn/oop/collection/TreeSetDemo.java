package com.learn.oop.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	//unique set items
	public static void main(String[] args) {
		TreeSet<String> cars= new TreeSet<>();
		cars.add("BMW");
		cars.add("HONDA");
		cars.add("SUZUKI");
		cars.add("MERCEDES");
		
		Iterator<String> itr = cars.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
	}

	}
}

