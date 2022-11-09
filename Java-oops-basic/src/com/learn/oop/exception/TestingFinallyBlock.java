package com.learn.oop.exception;

public class TestingFinallyBlock {
	
 public static void main(String[] args) {
		try {
			System.out.println("Inside try block");
		
		int num = 100/0;
		System.out.println(num);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("this bit is executed regardless of the exception occuring or not");
		}
		System.out.println("continue");
	}

}
