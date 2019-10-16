package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Technology;
import com.example.repository.TechnologyRepository;

@Service
public class TechnologyserviceImpl implements TechnologyService{

	@Autowired
	private TechnologyRepository technologyRepo;

	@Override
	public List<Technology> getAllTechnologies() {
		return technologyRepo.findAll();
	}

	@Override
	public Optional<Technology> getTechnologyById(Integer id) {
		return technologyRepo.findById(id);
	}

	@Override
	public Technology saveTechnology(Technology technology) {
		return technologyRepo.save(technology);
	}
	
	

}
