package com.maatic;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String studentid;
	private String fname;
	private String lname;
	public Student()
	{
		
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}
	
	

}
