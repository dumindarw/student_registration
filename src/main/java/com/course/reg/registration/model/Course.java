package com.course.reg.registration.model;

import java.io.Serializable;


public class Course implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Long courseId;
	private String courseName;
	private String startDate;
	private int noOfHours;
	private int noOfCredits;
	private String description;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public int getNoOfHours() {
		return noOfHours;
	}
	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}
	public int getNoOfCredits() {
		return noOfCredits;
	}
	public void setNoOfCredits(int noOfCredits) {
		this.noOfCredits = noOfCredits;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
}
