package com.college.example1.collegedemo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.example1.collegedemo.entity.College;
import com.college.example1.collegedemo.service.CollegeService;

@RestController
public class CollegeController {
	
	@Autowired
	CollegeService cs;
	
	@RequestMapping("/college")
	public List<College> getAllCollege() {  
		 
		return cs.getAllcollege();
	}
	
	@RequestMapping("/college/{data}")
	public College getCollege(@PathVariable("data") String  colname){
		
		return cs.getCollege(colname);
	}
	
	
	@PostMapping("/college")
	public void addCollege(@RequestBody College cname){
		cs.addCollege(cname);
	}
	
	@PutMapping("/college/{colname}")
	public void updateCollege(@RequestBody College cname ,@PathVariable  String colname) {
		
		cs.updateCollege(cname, colname);
	
	}
	
	@DeleteMapping("/college/{colname}")
	public void deleteCollege(@PathVariable("colname") String colname) {
		cs.deleteCollege(colname);
	}
	
	
	
}
