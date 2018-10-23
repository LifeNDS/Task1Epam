package com.epam.task1;

import org.apache.log4j.Logger;

abstract public class Sweets {

	static final Logger LOG = Logger.getLogger(Sweets.class);

	private String name;
	private float weight;
	private float sugar;

	public Sweets(String name, float weight, float sugar) {

		if (name == null) {
			LOG.fatal("Argument name can not be null");
			throw new NullPointerException("Argument name can not be null.");
		}
		if (name.isEmpty()) {
			LOG.fatal("Name of sweet can not be empty");
			throw new IllegalArgumentException("Name of sweet can not be empty.");
		}
		this.name = name;
		if (weight < 0) {
			LOG.fatal(name + "Weight can not be less then zero.");
			throw new IllegalArgumentException("Weight can not be less then zero.");
		}
		this.weight = weight;
		if (sugar < 0) {
			LOG.fatal(name + "Sugar can not be less then zero.");
			throw new IllegalArgumentException("Sugar can not be less then zero.");
		}

		this.sugar = sugar;
		// LOG.info("name " + name + " /weight " + weight + " /sugar " + sugar);
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
