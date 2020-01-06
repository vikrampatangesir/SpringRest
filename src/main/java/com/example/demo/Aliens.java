package com.example.demo;

import javax.persistence.Entity;

@Entity
public class Aliens 
{
	
	@javax.persistence.Id
	private  int Id;
	private String Name;
	private int Points ;
	
	
	public int getId() 
	{
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPoints() {
		return Points;
	}
	public void setPoints(int points) {
		Points = points;
	}
	
	
	
	
	
	
	
	
	
	

}
