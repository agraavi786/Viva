package com.reactiveDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.reactiveDemo.VivaTechEntity.VivaTechEntity;
import com.reactiveDemo.repository.VivaRepository;

@RestController
public class VivaRestController {
	@Autowired
	VivaRepository vivaRepository;
	
	
	@GetMapping("/vivaDetails")
	public List<VivaTechEntity> getAll(){
		return vivaRepository.findAll();
	}
	
	
	@GetMapping("/vivaDetails/{id}")
	public VivaTechEntity get(@PathVariable("id") int id) {
		return vivaRepository.findById(id).get();
	}
	@PostMapping("/vivaDetails")
	public VivaTechEntity createDetails(@RequestBody VivaTechEntity ve ) {
		return vivaRepository.save(ve);
		
	}
	@PutMapping("vivaDetails")
	public VivaTechEntity updateDetails(@RequestBody VivaTechEntity ve) {
		return vivaRepository.save(ve);
		
	}
	@DeleteMapping("vivaRepository/{id}")
	public void deleteDetails(int id) {
		vivaRepository.deleteById(id);
		
		
	}

}
