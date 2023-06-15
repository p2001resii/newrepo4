package com.college.example1.collegedemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
	
	@Id
	private String colName;
	private String colCity;
	private String colBranch;
	private String colTypes;
	private String colPhone;
	
	public College() {
		super();
	}

	public College(String colName, String colCity, String colBranch, String colTypes, String colPhone) {
		super();
		this.colName = colName;
		this.colCity = colCity;
		this.colBranch = colBranch;
		this.colTypes = colTypes;
		this.colPhone = colPhone;
	}

	public String getColName() {
		return colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	public String getColCity() {
		return colCity;
	}

	public void setColCity(String colCity) {
		this.colCity = colCity;
	}

	public String getColBranch() {
		return colBranch;
	}

	public void setColBranch(String colBranch) {
		this.colBranch = colBranch;
	}

	public String getColTypes() {
		return colTypes;
	}

	public void setColTypes(String colTypes) {
		this.colTypes = colTypes;
	}

	public String getColPhone() {
		return colPhone;
	}

	public void setColPhone(String colPhone) {
		this.colPhone = colPhone;
	}
	
	
	


}
