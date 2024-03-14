package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class employee {
	
	@Id
	private String id;
	
	private String fname;
	
	private String lname;
	
	private String company;
	
	private String city;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", company=" + company + ", city="
				+ city + "]";
	}

	public employee(String id, String fname, String lname, String company, String city) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.company = company;
		this.city = city;
	}

	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
