package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Technology;

public interface TechnologyService {
	public List<Technology> getAllTechnologies();

	public Optional<Technology> getTechnologyById(Integer id);

	public Technology saveTechnology(Technology technology);
}
