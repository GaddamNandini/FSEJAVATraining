package com.learn.oop.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> Participantlist = new ArrayList<>();
		Participantlist.add("Imlie");
		Participantlist.add("Arpitha");
		Participantlist.add("Sundar");
		Participantlist.add("Aryan");
		Participantlist.add("Hookline");
		Participantlist.add(1, "Hookline");
		Iterator itr = Participantlist.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
