package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.start.Student.Student;
import com.start.Student.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {

		System.out.println("hello world");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("press 1 to add student");
			System.out.println("press 2 to delete student");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to exit student");

			int choice = Integer.parseInt(br.readLine());

			if (choice == 1) {
				// add student
				System.out.println("Enter Student fullname");
				String name=br.readLine();
				
				System.out.println("Enter Student phone");
				String phone=br.readLine();
				
				System.out.println("Enter Student city");
				String city=br.readLine();
				
				Student st= new Student(name,phone,city);
				
				
				System.out.println(st);
				
				boolean answer=StudentDao.addStudentTODB(st);
				if(answer) {
					System.out.println("student added successfully");
				}
				else  {
					System.out.println("there is a prblm");
				}
			}
			else if (choice == 2) {
				// delete student
			}
			else if (choice == 3) {
				// exit student
			}
			else if (choice == 4) {
				// add student
			}
			else{
				}
			System.out.println("Thanks for using student management");
			
		}
		
		
	}

}
