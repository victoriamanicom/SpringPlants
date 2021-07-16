package com.bae.plants.service;

import java.util.List;

import com.bae.plants.data.Plant;

public interface PlantService {
	public Plant createPlant(Plant plant);

	public List<Plant> getPlants();

	public String deletePlant(int id);

	public Plant updatePlant(int id, Plant plant);

	List<Plant> getByName(String name);

	List<Plant> getPotSizeGreaterThan(int potSize);

	List<Plant> getLeafColourAndSucculent(String leafColour, boolean isSucculent);

}
