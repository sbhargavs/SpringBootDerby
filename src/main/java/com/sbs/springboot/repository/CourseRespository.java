package com.sbs.springboot.repository;
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.sbs.springboot.bean.Course;

public interface CourseRespository extends CrudRepository<Course, Serializable>{

	
}

