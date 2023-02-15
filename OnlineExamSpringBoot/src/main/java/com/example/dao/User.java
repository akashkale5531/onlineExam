package com.example.dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/* 
 * Spring will create object of User class , using data
 * submitted by user through browser .
 * 
 * [name=jbk pass=java] user class object 
 * 
 * But for this text box's name and User class's variable names
 * must be same .
 * 
 * 
 * */
@Entity
public class User {
	
	@Id
	String name;   
	String pass ;
	
	

	public String getName() {
		return name;
	}

	
	public String getPass() {
		return pass;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public void setPass(String pass) {
		this.pass = pass;
	}

	
	@Override
	public String toString() {
		return "name=" + name + " + \"   \"+  password=" + pass;
	}
	
}
