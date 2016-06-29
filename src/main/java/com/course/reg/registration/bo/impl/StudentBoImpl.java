package com.course.reg.registration.bo.impl;

import com.course.reg.registration.bo.StudentBo;
import com.course.reg.registration.dao.StudentDao;
import com.course.reg.registration.model.Student;

public class StudentBoImpl implements StudentBo{
	
	StudentDao studentDao;


	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}


	public void save(Student student) {
		studentDao.save(student);
	}

}
