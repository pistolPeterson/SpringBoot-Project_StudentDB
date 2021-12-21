package com.petersonnormil.demo.student;

import java.time.LocalDate;

public class Student {
	//private fields for student
	private Long id;
	private String name; 
	private String email;
	private Integer age;
	private LocalDate dob;
	//im in 36:13
	//3 main constructors for student
	public Student(Long id, String name, String email, Integer age, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.dob = dob;
	}
	public Student( String name, String email, Integer age, LocalDate dob) {
		super();
		
		this.name = name;
		this.email = email;
		this.age = age;
		this.dob = dob;
	}
	public Student() {
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", dob=" + dob + "]";
	}
	
}
