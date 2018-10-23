package com.epam.task1;

import org.apache.log4j.Logger;

public class LequeureCandy extends Sweets {
	static final Logger LOG = Logger.getLogger(LequeureCandy.class);
	float alcoholPercentage;

	public LequeureCandy(String name, float weight, float sugar, float alcoholPercentage) {
		super(name, weight, sugar);

		if (alcoholPercentage < 0) {
			LOG.fatal(super.getName() + "CocoaPercentage can not be less then zero.");
			throw new IllegalArgumentException("CocoaPercentage can not be less then zero.");
		}
		this.alcoholPercentage = alcoholPercentage;
		LOG.info(super.toString() + " /alcohol% " + alcoholPercentage);
	}

	public float getAlcoholPercentage() {
		return alcoholPercentage;
	}

	@Override
	public String toString() {
		return super.toString() + " /alcohol% " + alcoholPercentage;
	}

	@Override
	public boolean equals(Object obj) {

		LequeureCandy other = (LequeureCandy) obj;
		if (alcoholPercentage != other.alcoholPercentage)
			return false;
		return true;
	}
}
