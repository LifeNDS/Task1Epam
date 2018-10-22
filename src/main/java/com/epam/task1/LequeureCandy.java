package com.epam.task1;

public class LequeureCandy extends Sweets {
	float alcoholPercentage;

	public LequeureCandy(String name, float weight, float sugar, float alcoholPercentage) {
		super(name, weight, sugar);

		if (alcoholPercentage < 0) {
			throw new IllegalArgumentException("CocoaPercentage can not be less then zero.");
		}
		this.alcoholPercentage = alcoholPercentage;
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
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		LequeureCandy other = (LequeureCandy) obj;
		if (alcoholPercentage != other.alcoholPercentage)
			return false;
		return true;
	}
}
