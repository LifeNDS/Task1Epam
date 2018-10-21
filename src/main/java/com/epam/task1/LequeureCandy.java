package com.epam.task1;

public class LequeureCandy extends Sweets {
	float alcoholPercentage;

	public LequeureCandy(String name, float weight, float sugar, float alcoholPercentage) {
		super(name, weight, sugar);

		this.alcoholPercentage = alcoholPercentage;
	}

	public float getAlcoholPercentage() {
		return alcoholPercentage;
	}
	@Override
	public String toString() {
		return super.toString() + " /alcohol% " + alcoholPercentage;
	}
}
