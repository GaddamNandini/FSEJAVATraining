package com.learn.oop.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	// contains duplicate elements,
	public static void main(String[] args) {

		LinkedList<String> Fruits = new LinkedList<>();
		Fruits.add("mango");
		Fruits.add("apple");
		Fruits.add("banana");
		
		Fruits.removeFirst();
		Fruits.removeLast();

		Iterator<String> itr = Fruits.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
