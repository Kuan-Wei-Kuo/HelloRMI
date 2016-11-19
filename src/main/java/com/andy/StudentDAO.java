package com.andy;

import java.util.HashMap;

public class StudentDAO {

	private static StudentDAO studentDAO = new StudentDAO();
	
	private int[] ids = new int[] {1, 2, 3, 4, 5};
	
	private int[] grades = new int[] {1, 1, 3, 4, 2};
	
	private int[] squads = new int[] {1, 3, 2, 4, 6};
	
	private String[] names = new String[] {"Andy", "Rick", "Soldat", "Ryo", "Allen"};
	
	private HashMap<Integer, StudentBean> studentMap = new HashMap<>();
	
	public StudentDAO() {
		
		if(studentDAO != null) {
			return;
		}
		
		//°²¸ê®Æ
		for(int i = 0; i < ids.length; i++) {
			StudentBean studentBean = new StudentBean();
			studentBean.setId(ids[i]);
			studentBean.setGrade(grades[i]);
			studentBean.setSquad(squads[i]);
			studentBean.setName(names[i]);
			
			studentMap.put(ids[i], studentBean);
		}
		
	}
	
	public static StudentDAO getInstance() {
		return studentDAO;
	}
	
	public StudentBean getStudentById(int id) {
		return studentMap.get(id);
	}
	
	public HashMap<Integer, StudentBean> getStudentMap() {
		return studentMap;
	}
	
}
