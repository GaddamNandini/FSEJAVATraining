package com.learn.oop;

public class Student {
	
	
	Integer id;
	String name;
	Address address;
	
 void addstudent(Integer id, String name, Address address) {
	this.id=id;
	this.name= name;
	this.address=address;
	
}
 void displaystudent()
 {
	 System.out.println(id+ " "+ address.city+" "+address.country);
 }
 
 public static void main(String args[]) {
	 Address Johnaddress = new Address("bangolre", "karnataka","India");
	 
	 
	 Student John = new Student();
	 John.addstudent(101, "john philip", Johnaddress);
	 John.displaystudent();
	 
 }
}
