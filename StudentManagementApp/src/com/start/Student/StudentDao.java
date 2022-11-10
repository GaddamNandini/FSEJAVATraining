package com.start.Student;

import java.sql.Connection;

import java.sql.PreparedStatement;



public class StudentDao {
	public static boolean addStudentTODB(Student st) {
		boolean status=false;
		try {
			Connection con= ConnectionProvider.create();
			String Query1 = "insert into students(sname,phone,scity)  values( ?,?,?)";
			//insert into studentmanagement.students(sid,sname,phone,scity)  values('1','akhil','7799115j574','hyd');
		
			PreparedStatement pst=con.prepareStatement(Query1);
			
			//
			
			pst.setString(1, st.getStudentName());
			pst.setString(2, st.getStudentPhone());
			pst.setString(3, st.getStudentCity());
			
			
			pst.executeUpdate();
			status=true;
		
		} catch(Exception e) {
			
		}
		return status;
	}
	

}
