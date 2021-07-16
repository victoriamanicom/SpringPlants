package com.bae.plants.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "plantName")
	private String name;
	private int potSize;
	private String leafColour;
	private boolean isSucculent;

	public Plant() {
	}

	public Plant(int id, String name, int potSize, String leafColour, boolean isSucculent) {
		super();
		this.id = id;
		this.name = name;
		this.potSize = potSize;
		this.leafColour = leafColour;
		this.isSucculent = isSucculent;
	}

	public Plant(String name, int potSize, String leafColour, boolean isSucculent) {
		super();
		this.name = name;
		this.potSize = potSize;
		this.leafColour = leafColour;
		this.isSucculent = isSucculent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPotSize() {
		return potSize;
	}

	public void setPotSize(int potSize) {
		this.potSize = potSize;
	}

	public String getLeafColour() {
		return leafColour;
	}

	public void setLeafColour(String leafColour) {
		this.leafColour = leafColour;
	}

	public boolean getIsSucculent() {
		return isSucculent;
	}

	public void setIsSucculent(boolean isSucculent) {
		this.isSucculent = isSucculent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Plant [name=" + name + ", potSize=" + potSize + ", leafColour=" + leafColour + ", isSucculent="
				+ isSucculent + "]";
	}

}
