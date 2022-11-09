package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
