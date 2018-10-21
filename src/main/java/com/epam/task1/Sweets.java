package com.epam.task1;

abstract public class Sweets {

	private String name;
	private float weight;
	private float sugar;

	public Sweets(String name, float weight, float sugar) {

		this.name = name;
		this.weight = weight;
		this.sugar = sugar;
	}

	public String getName() {
		return name;
	}

	public float getWeight() {
		return weight;
	}

	public float getSugar() {
		return sugar;
	}

	@Override
	public String toString() {
		return "name " + name + " /weight " + weight + " /sugar " + sugar;
	}
}
