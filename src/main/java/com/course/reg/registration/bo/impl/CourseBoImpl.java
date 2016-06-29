package com.course.reg.registration.bo.impl;

import java.util.List;

import com.course.reg.registration.bo.CourseBo;
import com.course.reg.registration.dao.CourseDao;
import com.course.reg.registration.model.Course;

public class CourseBoImpl implements CourseBo{
	
	CourseDao courseDao;

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	public void save(Course course) {
		courseDao.save(course);
	}

	public List<Course> getAllCourses() {
		return courseDao.getAllCourses();
	}

}
