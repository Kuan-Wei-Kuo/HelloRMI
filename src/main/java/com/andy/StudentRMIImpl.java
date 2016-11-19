package com.andy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public class StudentRMIImpl extends UnicastRemoteObject implements StudentRMI {

	private static final long serialVersionUID = 1L;

	private StudentDAO studentDAO = StudentDAO.getInstance();
	
	public StudentRMIImpl() throws RemoteException {
		studentDAO = StudentDAO.getInstance();
	}
	
	@Override
	public StudentBean getStudentById(int id) throws RemoteException {
		return studentDAO.getStudentById(id);
	}

	@Override
	public HashMap<Integer, StudentBean> getStudentMap() throws RemoteException {
		return studentDAO.getStudentMap();
	}

	
	
}
