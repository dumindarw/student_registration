package com.course.reg.registration.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.course.reg.registration.dao.CourseDao;
import com.course.reg.registration.model.Course;

public class CourseDaoImpl extends HibernateDaoSupport implements CourseDao{

	public void save(Course course) {
		getHibernateTemplate().save(course);
	}

	public List<Course> getAllCourses() {
		List<Course> courses = getHibernateTemplate().find("from Course");
		
		return courses;
	}

}
