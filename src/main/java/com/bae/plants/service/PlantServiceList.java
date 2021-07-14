package com.bae.plants.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.bae.plants.data.Plant;

@Service
public class PlantServiceList implements PlantService {
	private ArrayList<Plant> plants = new ArrayList<>();

	@Override
	public Plant createPlant(Plant plant) {
		this.plants.add(plant);
		System.out.println(plant.getName() + " added");
		return plant;
	}

	@Override
	public ArrayList<Plant> getPlants() {
		for (Plant plant : plants) {
			System.out.println(plant);
		}
		return this.plants;
	}

	@Override
	public String deletePlant(int id) {
		this.plants.remove(id);
		return "Plant deleted";
	}

	@Override
	public Plant updatePlant(int id, Plant plant) {
		this.plants.remove(id);
		this.plants.add(id, plant);
		return this.plants.get(id);
	}

}
