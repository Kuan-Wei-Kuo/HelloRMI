package com.andy;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;

public interface StudentRMI extends Remote {

	public StudentBean getStudentById(int id) throws RemoteException;
	
	public HashMap<Integer, StudentBean> getStudentMap() throws RemoteException;
	
}
