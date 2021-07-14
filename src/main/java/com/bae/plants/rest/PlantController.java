package com.bae.plants.rest;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.plants.data.Plant;
import com.bae.plants.service.PlantService;

@RestController
public class PlantController {

	private PlantService service;

	public PlantController(PlantService service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String hello() {
		return "Hello World!";
	}

	@PostMapping("/createPlant")
	public Plant createPlant(@RequestBody Plant plant) {
		return this.service.createPlant(plant);
	}

	@GetMapping("/getPlants")
	public ArrayList<Plant> getPlants() {
		return this.service.getPlants();
	}

	@DeleteMapping("/deletePlant/{id}")
	public String deletePlant(@PathVariable int id) {
		return this.service.deletePlant(id);
	}

	@PutMapping("/updatePlant/{id}")
	public Plant updatePlant(@PathVariable int id, @RequestBody Plant plant) {
		return this.service.updatePlant(id, plant);
	}
}
