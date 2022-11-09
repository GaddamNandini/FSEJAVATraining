package com.learn.oop;

public class Employee2 {
	// same method name, different parameters--> method overloading
	Integer BaseSalary = 5000; // parent class

	void TotalSalary(Integer BS, Integer Bonus) {
		Integer total = BS + Bonus;
		System.out.println(total);
	}

	void TotalSalary(Integer BS, Integer Bonus, Integer incentive) {
		Integer total = BS + Bonus + incentive;

		System.out.println(total);
	}

	void working() {
		System.out.println("employee is working");
	}
}
