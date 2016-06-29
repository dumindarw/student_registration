package com.course.reg.registration.bo;

import java.util.List;

import com.course.reg.registration.model.Course;

public interface CourseBo {
	
	void save(Course course);
	List<Course> getAllCourses();

}
