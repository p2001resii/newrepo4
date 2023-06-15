package com.college.example1.collegedemo.repository;

import org.springframework.data.repository.CrudRepository;


import com.college.example1.collegedemo.entity.College;

public interface CollegeRepository extends CrudRepository<College,String> {
	
}
