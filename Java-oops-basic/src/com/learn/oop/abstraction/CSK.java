package com.learn.oop.abstraction;

public class CSK extends IPL {
	
	void play() {
		System.out.println("csk playing good");
	}

	public static void main(String[] args) {
		CSK obj= new CSK();
		obj.play();
	}

}
