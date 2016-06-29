package com.course.reg.controller;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.course.reg.registration.bo.CourseBo;
import com.course.reg.registration.bo.StudentBo;
import com.course.reg.registration.model.Course;
import com.course.reg.registration.model.Student;

@Controller
@RequestMapping("/")
public class RegistrationController {
	
	private static final Logger logger = Logger.getLogger(RegistrationController.class);
	
	ApplicationContext appContext = 
	    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
	    	CourseBo courseBo = (CourseBo)appContext.getBean("courseBo");
	    	StudentBo studentBo = (StudentBo)appContext.getBean("studentBo");
	    	
	    	@RequestMapping(value="/", method = RequestMethod.GET)
	    	public ModelAndView getIndex() {
	    		
	    		logger.info("===================index==================");
	    		return new ModelAndView("index");
	    	}
	    	
	    	@RequestMapping(value="/insertCourses", method = RequestMethod.GET)
	    	public ModelAndView insertCourses(@ModelAttribute("courseForm") Course course,
	    			BindingResult result) {
	    		
	    		return new ModelAndView("insertCourses");
	    	}
	    	
	    	@RequestMapping(value="/insertStudents", method = RequestMethod.GET)
	    	public ModelAndView insertStudents(@ModelAttribute("studentForm") Student student,
	    			ModelAndView model) {
	    		
	    		List<Course>  courses = courseBo.getAllCourses();
	    		
	    		model.addObject("coursesList", courses);
	    		model.setViewName("insertStudents");
	    		
	    		return model;
	    	}
	    	
	    	@RequestMapping(value = "/saveCourse", method = RequestMethod.POST)
	    	public String saveCourse(@ModelAttribute("courseForm") Course course,
	    			BindingResult result, Model model) {
	    		
	    		
	    		
	    		
	        	courseBo.save(course);
	        	
	        	return "success";
	    		
	    	}
	    	
	    	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	    	public String saveStudent(@ModelAttribute("studentForm") Student student,
	    			BindingResult result, Model model) {
	    		
	    		String courses = Arrays.toString(student.getCourses().toArray()); 
	    		
	    		student.setCoursesStr(courses);
	    		
	    		studentBo.save(student);
	    		
	        	return "success";
	    		
	    	}

}
