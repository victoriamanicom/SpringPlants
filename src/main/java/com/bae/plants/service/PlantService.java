package com.bae.plants.service;

import java.util.ArrayList;

import com.bae.plants.data.Plant;

public interface PlantService {
	public Plant createPlant(Plant plant);

	public ArrayList<Plant> getPlants();

	public String deletePlant(int id);

	public Plant updatePlant(int id, Plant plant);

}
