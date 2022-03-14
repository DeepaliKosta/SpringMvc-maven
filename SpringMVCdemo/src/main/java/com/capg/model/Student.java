package com.capg.model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

public class Student {

	private String name;
	private String pass;
	public Student(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
    public Student() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", pass=" + pass + "]";
	}
	@RequestMapping("/hey")
	public String display() {
	
		return "viewpage";
	
	}
    
    
 }
