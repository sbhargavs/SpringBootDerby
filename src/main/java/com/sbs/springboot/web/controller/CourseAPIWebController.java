package com.sbs.springboot.web.controller;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.sbs.springboot.bean.Course;

@Controller
public class CourseAPIWebController {
	
	
	
	@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public String getAllCourses(Model model) {
		
		
		RestTemplate restTemplate = new RestTemplate();
		List<Course> courseList = extracted(restTemplate);
		model.addAttribute("courseList", courseList);
	/*	System.out.println("Course Object in WebContoller " + courseList.size());*/
		return "courseList";
	}

	private List<Course> extracted(RestTemplate restTemplate) {

		ParameterizedTypeReference<List<Course>> responseType = new ParameterizedTypeReference<List<Course>>() {};
		ResponseEntity<List<Course>> result = restTemplate.exchange(
				new StringBuilder("http://localhost:8080/getCourses").toString(), HttpMethod.GET, null, responseType);
		/*System.out.println("result.getBody()" +result.getBody());*/
		return result.getBody();
	}

}
