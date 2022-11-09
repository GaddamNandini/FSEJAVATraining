package com.learn.oop;

public class TV {
	
	String Brand;
	String ModelName;
	Integer Screensize;
	Integer price;
	String color;
	String DisplayType;
	
	void insertData(String B, String m, Integer s, Integer p, String c,
			String dt) {
		
		Brand=B;
		ModelName=m;
		Screensize=s;
		 price=p;
		 color=c;
		 DisplayType=dt;
		 
}
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
		
		
		samsungFrame.insertData("samsung", "65FrameTV", 65, 12000, "beige", "led");
		
		System.out.println(samsungFrame.Brand+ " "+ samsungFrame.ModelName+" " +samsungFrame.Screensize+" "+samsungFrame.price+" "
+samsungFrame.color+ " "+ samsungFrame.DisplayType+" ");
		
	}

}
