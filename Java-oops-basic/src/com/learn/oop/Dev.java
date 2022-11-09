package com.learn.oop;

 
//child class
 public class Dev extends Employee2{
	Integer Bonus=25000;
	Integer Total=Bonus+BaseSalary;
	
	public static void main (String args[]) {
		Dev Nish= new Dev();
		System.out.println("Total salary of Nish is"+ Nish.Total);
	}
}

