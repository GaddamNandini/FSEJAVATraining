package com.learn.oop;

public class HR extends Employee2 {
	Integer Bonus=25000;
	Integer Total=Bonus+BaseSalary;
	
	public static void main (String args[]) {
		HR Anisha = new HR();
	
	System.out.println("Anisha total salary"+ Anisha.Total);
	
	}
}
