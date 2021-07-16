package com.bae.plants.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.bae.plants.data.Plant;
import com.bae.plants.data.repos.PlantRepo;

@Service
@Primary
public class PlantServiceDB implements PlantService {

	private PlantRepo repo;

	public PlantServiceDB(PlantRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Plant createPlant(Plant plant) {
		return this.repo.save(plant);
	}

	@Override
	public List<Plant> getPlants() {
		return this.repo.findAll();
	}

	@Override
	public List<Plant> getByName(String name) {
		return this.repo.findPlantByName(name);
	}

	@Override
	public String deletePlant(int id) {
		this.repo.deleteById(id);
		return "Plant Deleted";

	}

	@Override
	public Plant updatePlant(int id, Plant plant) {
		Plant found = this.repo.findById(id).get();

		found.setLeafColour(plant.getLeafColour());
		found.setName(plant.getName());
		found.setPotSize(plant.getPotSize());
		found.setIsSucculent(plant.getIsSucculent());

		Plant updated = this.repo.save(found);
		return updated;
	}

	@Override
	public List<Plant> getPotSizeGreaterThan(int potSize) {
		return this.repo.findPlantByPotSizeGreaterThan(potSize);
	}

	@Override
	public List<Plant> getLeafColourAndSucculent(String leafColour, boolean isSucculent) {
		return this.repo.findPlantByLeafColourAndIsSucculentJPQL(leafColour, isSucculent);
	}

}
