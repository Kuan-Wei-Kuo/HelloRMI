package com.andy;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.util.Properties;

public class StudentClient {

	public static void main(String[] args) {
		
		StudentRMI studentRMI;
		Properties properties = new Properties();
		
		try {
			
			properties.load(StudentClient.class.getResource("/andy.properties").openStream());
			
			studentRMI = (StudentRMI) Naming.lookup("rmi://" + properties.getProperty("StudentServer") + "/student");
			
			System.out.println(studentRMI.getStudentById(1));
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
