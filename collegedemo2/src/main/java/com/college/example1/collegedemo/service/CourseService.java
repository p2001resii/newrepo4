package com.college.example1.collegedemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.example1.collegedemo.entity.Course;
import com.college.example1.collegedemo.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository cory;
	
	public List<Course> getAllCourses(String colName) {
		
		List<Course> corsList  = new ArrayList<>();
		cory.findByCollegeColName(colName).forEach(corsList::add);
		return corsList;
	}

	
	public Course getCourse(String id) {
		
		return cory.findById(id).get();
	}
	
	public void addCourse(Course corse) {
		cory.save(corse);
	}

	public void updateCourse(Course corse) {
		
		cory.save(corse);
	}
	
	public void deleteCourse(String id) {
		cory.deleteById(id);
	}

}
