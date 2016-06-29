package com.course.reg.registration.model;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Long studentId;
	private String firstName;
	private String lastName;
	private String dob;
	private String email;
	private List<String> courses;
	private String coursesStr;
	
	public String getCoursesStr() {
		return coursesStr;
	}
	public void setCoursesStr(String coursesStr) {
		this.coursesStr = coursesStr;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
}
