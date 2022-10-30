package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MainService;


@RestController //user request to expose data
public class MainController2 {
	@Autowired
	MainService service;
	/*List<String> list = new ArrayList<>();
	
	public MainController2() {
		list.add("Shanghai");
		list.add("NewYork");
		list.add("London");
		list.add("Beijing");
		list.add("LA");
	}*/
	//GET method
	@GetMapping("/list")
	public List<String> showlist()
	{
		return this.service.show();

	}
	//POST
	@PostMapping("/add")
	public List<String> addToList()
	{
		return this.service.create();

	}
	//PUT update the list
	@PutMapping("/update/{id}")
	public void updateTheList(@PathVariable int id)
	{
		this.service.update(id);

	}
	//DELETE deletes a record
	@DeleteMapping("/delete/{id}")
	public void deleteFromTheList(@PathVariable int id)
	{
		this.service.delete(id);

	}

}
