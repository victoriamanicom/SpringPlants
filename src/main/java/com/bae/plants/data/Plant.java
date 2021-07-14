package com.bae.plants.data;

public class Plant {
	private String name;
	private int potSize;
	private String leafColour;
	private boolean isSucculent;

	public Plant() {

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

	public boolean isSucculent() {
		return isSucculent;
	}

	public void setSucculent(boolean isSucculent) {
		this.isSucculent = isSucculent;
	}

	@Override
	public String toString() {
		return "Plant [name=" + name + ", potSize=" + potSize + ", leafColour=" + leafColour + ", isSucculent="
				+ isSucculent + "]";
	}

}
