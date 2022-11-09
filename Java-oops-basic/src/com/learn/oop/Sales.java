package com.learn.oop;

public class Sales extends Employee2 {
	Integer Bonus=10000;
	Integer Total=Bonus+BaseSalary;
	Integer incentive;
	public static void main (String args[]) {
		Sales Ashish = new Sales();
		Ashish.incentive=2000;
		Ashish.TotalSalary(Ashish.BaseSalary, Ashish.Bonus, Ashish.incentive);
		}
}
