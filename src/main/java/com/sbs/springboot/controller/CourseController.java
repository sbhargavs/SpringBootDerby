package com.sbs.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sbs.springboot.bean.Course;
import com.sbs.springboot.service.CourseAPIService;

@RestController
public class CourseController {

	@Autowired
	public CourseAPIService courseAPIService;

	@RequestMapping("/getCourses")
	public List<Course> getAllCourses() {

		try {
			return courseAPIService.getAllCourses();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@RequestMapping("/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		try {
			return courseAPIService.getCourse(id);
		} catch (Exception e) {
			System.out.println(e.getMessage() + "For given Input " + id);
			return null;
		}
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/putCourses")
	public void updateCourse(@RequestBody Course course) {
		System.out.println("Course Object ************************ "+course);
		courseAPIService.updateCourse(course);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
	public void deleteCourse(@RequestBody Course course) {
		
		courseAPIService.deleteCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/postCourses")
	public void addCourse(@RequestBody Course course) {
		courseAPIService.addCourse(course);
	}

}
