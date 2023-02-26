package com.Springboot.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int studId;
	private String studName;
	private int age;
	private String location;
	private String  studCourse;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studId, String studName, int age, String location, String studCourse) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.age = age;
		this.location = location;
		this.studCourse = studCourse;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStudCourse() {
		return studCourse;
	}
	public void setStudCourse(String studCourse) {
		this.studCourse = studCourse;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", age=" + age + ", location=" + location
				+ ", studCourse=" + studCourse + "]";
	}
	
	
	
	

}
