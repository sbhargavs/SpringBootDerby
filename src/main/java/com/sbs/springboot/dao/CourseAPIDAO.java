/*package com.sbs.springboot.dao;

import java.util.List;

import com.sbs.springboot.bean.Course;

public class CourseAPIDAO {

	
	public List<Course> getAllCourses() throws Exception {
		return courseList;
	}

	public Course getCourse(String id) throws Exception {

		return courseList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addCourse(Course course) {
		courseList.add(course);
	}

	public void deleteCourse(Course course) {
		
		
		courseList.remove(course);
	}

	public void updateCourse(Course course) {

		for (int i = 0; i < courseList.size(); i++) {
			Course courseTemp = courseList.get(i);
			if (courseTemp.getId().equals(course.getId())) {
				courseList.set(i, course);
			}
		}
	}
	
	
}
*/