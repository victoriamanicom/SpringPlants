package com.bae.plants.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Plant> createPlant(@RequestBody Plant plant) {
		Plant created = this.service.createPlant(plant);
		return new ResponseEntity<>(created, HttpStatus.CREATED);
	}

	@GetMapping("/getPlants")
	public List<Plant> getPlants() {
		return this.service.getPlants();
	}

	@GetMapping("/getByName/{name}")
	public List<Plant> getByName(@PathVariable String name) {
		return this.service.getByName(name);
	}

	@GetMapping("/getByPotSizeGreaterThan/{potSize}")
	public List<Plant> getPotSizeGreaterThan(@PathVariable int potSize) {
		return this.service.getPotSizeGreaterThan(potSize);
	}

	@GetMapping("/getLeafColourAndSucculent")
	public List<Plant> getLeafColourAndSucculent(@PathParam("leafColour") String leafColour,
			@PathParam("isSucculent") boolean isSucculent) {
		return this.service.getLeafColourAndSucculent(leafColour, isSucculent);
	}

	@DeleteMapping("/deletePlant/{id}")
	public ResponseEntity<String> deletePlant(@PathVariable int id) {
		String body = this.service.deletePlant(id);
		return new ResponseEntity<String>(body, HttpStatus.NO_CONTENT);
	}

	@PutMapping("/updatePlant/{id}")
	public ResponseEntity<Plant> updatePlant(@PathVariable int id, @RequestBody Plant plant) {
		Plant body = this.service.updatePlant(id, plant);
		return new ResponseEntity<Plant>(body, HttpStatus.ACCEPTED);
	}
}
