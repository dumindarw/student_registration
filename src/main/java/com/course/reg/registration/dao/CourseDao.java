package com.course.reg.registration.dao;

import java.util.List;

import com.course.reg.registration.model.Course;

public interface CourseDao {
	
	 void save(Course course);
	 List<Course> getAllCourses();

}
