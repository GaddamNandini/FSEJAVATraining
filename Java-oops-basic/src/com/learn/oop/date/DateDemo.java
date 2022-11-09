package com.learn.oop.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		LocalDate yesterday= date.minusDays(1);
		LocalDate tommorrow= date.plusDays(1);
		LocalDateTime time= LocalDateTime.now();
		
		System.out.println(date);
		System.out.println("yesterday date" +yesterday);
		System.out.println("tommorrow date" +tommorrow);
		System.out.println(time);
	}

}
