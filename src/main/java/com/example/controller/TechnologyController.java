package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Technology;
import com.example.service.TechnologyService;

@RestController
public class TechnologyController {

	@Autowired
	private TechnologyService service;
	
	@GetMapping("/technologies")
	public List<Technology> getAllTechnologies(){
		return service.getAllTechnologies();
	}
	
	@GetMapping("/technology/{id}")
	public Technology getTechnologyByid(@PathVariable Integer id) {
		return service.getTechnologyById(id).get();
	}
	
	@PostMapping("/technology")
	public Technology saveTechnology(@RequestBody Technology technology) {
		return service.saveTechnology(technology);
	}
	
	@PutMapping("/technology/update/{id}")
	public Technology updateTechnology(@RequestBody Technology technology,@PathVariable Integer id) {
		Technology technology2=service.getTechnologyById(id).get();
		technology.setTechId(id);
		return service.saveTechnology(technology);
		
	}
}
