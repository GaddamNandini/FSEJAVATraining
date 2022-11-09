package com.learn.oop.abstraction;

public class NansTech implements ITCompanies{

	
	
	public void working() {
		System.out.println("Nans working" );
	}
	
	
	public static void main(String[] args) {
		NansTech sms= new NansTech();
		sms.working();

	}

}
