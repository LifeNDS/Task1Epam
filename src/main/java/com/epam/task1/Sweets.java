package com.epam.task1;

abstract public class Sweets {

	private String name;
	private float weight;
	private float sugar;

	public Sweets(String name, float weight, float sugar) {

		if (name == null) {
			throw new NullPointerException("Argument name can not be null.");
		}
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Name of sweet can not be empty.");
		}
		this.name = name;
		if (weight < 0) {
			throw new IllegalArgumentException("Weight can not be less then zero.");
		}
		this.weight = weight;
		if (sugar < 0) {
			throw new IllegalArgumentException("Sugar can not be less then zero.");
		}

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sweets other = (Sweets) obj;
		if (name != other.name)
			return false;
		if (weight != other.weight)
			return false;
		if (sugar != other.sugar)
			return false;
		return true;
	}
}
