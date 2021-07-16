package com.bae.plants.data.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bae.plants.data.Plant;

@Repository
public interface PlantRepo extends JpaRepository<Plant, Integer> {
	List<Plant> findPlantByName(String name);

	List<Plant> findPlantByPotSizeGreaterThan(int potSize);

	@Query("SELECT p from Plant p WHERE p.leafColour=?1 and p.isSucculent=?2")
	List<Plant> findPlantByLeafColourAndIsSucculentJPQL(String leafColour, boolean isSucculent);

}
