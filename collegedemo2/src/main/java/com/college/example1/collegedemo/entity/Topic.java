package com.college.example1.collegedemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Topic3")
public class Topic {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true)
	private String id;

	@Column(nullable=false,length=255)
	private String name;

	//@Column(name="descpt", length=5)
	private String description;



	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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



}
