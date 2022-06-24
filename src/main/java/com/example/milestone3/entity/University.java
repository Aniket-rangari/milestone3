package com.example.milestone3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class University {
	
	@Id
	private int id;
	private String name;
	private int numberofcollege;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberofcollege() {
		return numberofcollege;
	}
	public void setNumberofcollege(int numberofcollege) {
		this.numberofcollege = numberofcollege;
	}
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	public University(int id, String name, int numberofcollege) {
		super();
		this.id = id;
		this.name = name;
		this.numberofcollege = numberofcollege;
	}
	
	
}
