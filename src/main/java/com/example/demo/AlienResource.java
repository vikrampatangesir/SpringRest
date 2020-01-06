package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource 
{    
	
	@Autowired
	AlienRepository repo;
	
	@RequestMapping("aliens")
	public List<Aliens> getaliens()
	{
		
		List<Aliens> arraylist=(List<Aliens>) repo.findAll();
		
		
		
		
		
		/*
		 * Aliens a1=new Aliens(); a1.setId(101); a1.setName("vikram");
		 * a1.setPoints(900);
		 * 
		 * 
		 * Aliens a2=new Aliens(); a2.setId(101); a2.setName("vikram");
		 * a2.setPoints(900);
		 * 
		 * 
		 * arraylist.add(a1); arraylist.add(a2);
		 */
		     return arraylist;
		     
		     
		     
		     
	}
	
	
}
