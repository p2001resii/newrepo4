package com.college.example1.collegedemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String description;
	
	//Many courses to a single topic  //Many courses to a single topic
	@ManyToOne
	College college;

	public Course() {
		super();   
	}

	public Course(String id, String name, String description, String colName) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.college = new College(colName,"","","","");   //what we did in this line???
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	
	
}
