package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //user request to expose data
public class MainController {
	List<String> list = new ArrayList<>();
	
	public MainController() {
		list.add("Shanghai");
		list.add("NewYork");
		list.add("London");
		list.add("Beijing");
		list.add("LA");
	}
	//GET method
	@GetMapping("/list")
	public List<String> showlist()
	{
		return list;
	}
	//POST
	@PostMapping("/add")
	public List<String> addToList()
	{
		list.add("Istanbul");
		list.add("Dubai");
		return list;
	}
	//PUT update the list
	@PutMapping("/update/{id}")
	public void updateTheList(@PathVariable int id)
	{
		list.add(id,"Delhi");
	}
	//DELETE deletes a record
	@DeleteMapping("/delete/{id}")
	public void deleteFromTheList(@PathVariable int id)
	{
		list.remove(id);
	}

}
