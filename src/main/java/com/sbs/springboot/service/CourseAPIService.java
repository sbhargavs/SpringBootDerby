package com.sbs.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.springboot.bean.Course;
import com.sbs.springboot.repository.CourseRespository;

@Service
public class CourseAPIService {

	@Autowired
	private CourseRespository courseRepo;

	/*private List<Course> courseList = new ArrayList<Course>(Arrays.asList(
			new Course("1", "java", "Java Standard Edition"), new Course("2", "j2ee", "Java Enterprice Edition"),
			new Course("3", "j2me", "Java Mobile Edition")));*/

	public List<Course> getAllCourses() throws Exception {
		List<Course> courseList = new ArrayList<Course>();
		courseRepo.findAll().forEach(courseList::add);
		return courseList;

	}

	public Course getCourse(String id) throws Exception {

		// return courseList.stream().filter(t ->
		// t.getId().equals(id)).findFirst().get();
		/*
		 * Course course = new Course(); course.setId(id);
		 */
		return courseRepo.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepo.save(course);
	}

	public void deleteCourse(Course course) {

		courseRepo.delete(course);
	}

	public void updateCourse(Course course) {

		/*
		 * for (int i = 0; i < courseList.size(); i++) { Course courseTemp =
		 * courseList.get(i); if (courseTemp.getId().equals(course.getId())) {
		 * courseList.set(i, course); } }
		 */

		courseRepo.save(course);
	}

	/**
	 * @return the courseRepo
	 */
	public CourseRespository getCourseRepo() {
		return courseRepo;
	}

	/**
	 * @param courseRepo
	 *            the courseRepo to set
	 */
	public void setCourseRepo(CourseRespository courseRepo) {
		this.courseRepo = courseRepo;
	}

}
