package com.learn.oop;

public class TV {
	
	String Brand;
	String ModelName;
	Integer Screensize;
	Integer price;
	String color;
	String DisplayType;
	
	//defining the main class
	public static void main (String args[]) {
		TV lgOled = new TV();
		TV samsungFrame= new TV();
		
	lgOled.Brand="LG";
		lgOled.ModelName= "4k led 75 TV";
		lgOled.Screensize= 75;
		lgOled.price= 1000000;
		lgOled.color="black";
		lgOled.DisplayType="OLed";
		
		
		System.out.println(lgOled.Brand+ " "+ lgOled.ModelName+" " +lgOled.Screensize+" "+lgOled.price+" "
+lgOled.color+ " "+ lgOled.DisplayType+" ");
		
	}

}
