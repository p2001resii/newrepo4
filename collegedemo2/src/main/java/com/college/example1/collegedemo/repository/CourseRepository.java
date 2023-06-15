package com.college.example1.collegedemo.repository;

import java.util.List;



import org.springframework.data.repository.CrudRepository;

import com.college.example1.collegedemo.entity.Course;

public interface CourseRepository extends CrudRepository <Course,String>{

	List<Course> findByCollegeColName(String colname);
	// List<Course> findByName(String name);
	// findByProperty
}


