package com.andy;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.Properties;

import org.apache.log4j.Logger;

public class StudentServer {
	
	private static Logger logger = Logger.getLogger(StudentServer.class);
	
	private static Properties properties = new Properties();
	
	public static void main(String[] args) {
	
		logger.info("StudentServer Starting...");
		
		try {
			
			properties.load(StudentServer.class.getResource("/andy.properties").openStream());
			logger.info("Loaded Properties...");
			
			StudentRMI studentRMI = new StudentRMIImpl();
			logger.info("StudentRMI Started...");
			
			// ���a�D���W�����{��H���U��Registry�APort:8080
			LocateRegistry.createRegistry(8180);
			logger.info("StudentRMI Registry Started...");

			// ���U���{��HRMI 
			// URL�зǮ榡���Grmi://host:port/name
			Naming.bind("rmi://" + properties.getProperty("StudentServer") + "/student", studentRMI);
			logger.info("StudentRMI Run Success...");
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			e.printStackTrace();
		}
		
		logger.info("StudentServer STARTED...");
	}
	
}
