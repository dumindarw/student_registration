package com.course.reg.registration.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.course.reg.registration.dao.StudentDao;
import com.course.reg.registration.model.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao{

	public void save(Student student) {
		getHibernateTemplate().save(student);
	}

}
