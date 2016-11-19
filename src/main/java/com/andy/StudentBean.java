package com.andy;

import java.io.Serializable;

public class StudentBean implements Serializable {

	private static final long serialVersionUID = 1L;

	//學號
	private int id;

	//年級
	private int grade;
	
	//班別
	private int squad;
	
	//名子
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getSquad() {
		return squad;
	}

	public void setSquad(int squad) {
		this.squad = squad;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", grade=" + grade + ", squad=" + squad + ", name=" + name + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
