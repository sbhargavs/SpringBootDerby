package com.sbs.springboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sbs.springboot.bean.Course;
import com.sbs.springboot.repository.CourseRespository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CourseAPITest {

	@Autowired
	private CourseRespository courseRepo;

	@Test
	public void testCourseAPI() throws Exception {
		Course course = new Course();
		course.setId("2");
		course.setName("Course Name");
		course.setDetails("Course Details");
		courseRepo.save(course);

		assert (courseRepo.findOne("2").getName().equalsIgnoreCase("Course Name"));

	}

	/**
	 * @return the courseRepo
	 */
	public CourseRespository getCourseRepo() {
		return courseRepo;
	}

	/**
	 * @param courseRepo the courseRepo to set
	 */
	public void setCourseRepo(CourseRespository courseRepo) {
		this.courseRepo = courseRepo;
	}

}
