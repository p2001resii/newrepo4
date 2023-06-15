package com.college.example1.collegedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.example1.collegedemo.entity.College;
import com.college.example1.collegedemo.entity.Course;
import com.college.example1.collegedemo.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService crs;
	
	@GetMapping("/college/{colname}/courses")
	public List<Course> getAllCourses(@PathVariable String colname){
		return crs.getAllCourses(colname);
	
	}
	
	@GetMapping("/college/{colName}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return crs.getCourse(id);
	}
	
	@PostMapping("/college/{colName}/courses")
	public void addCourse(@RequestBody Course corse ,@PathVariable String colName) {
		corse.setCollege(new College(colName,"" ,"","",""));   //Confusinon in this line
		crs.addCourse(corse);
	}
	
	@PutMapping("/college/{colName}/courses/{id}")
	public void updateCourse(@RequestBody Course corse ,@PathVariable String colName) {
		corse.setCollege(new College(colName,"" ,"","",""));
		crs.updateCourse(corse);
	}
	
	@DeleteMapping("/college/{colName}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		crs.deleteCourse(id);
	}
	
	
}
