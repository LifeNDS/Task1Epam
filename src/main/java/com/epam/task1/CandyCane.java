package com.epam.task1;

class СandyСane extends Sweets {
	private float cocoaPercentage;

	public СandyСane(String name, float weight, float sugar, float cocoaPercentage) {
		super(name, weight, sugar);

		if (cocoaPercentage < 0) {
			throw new IllegalArgumentException("CocoaPercentage can not be less then zero.");
		}
		this.cocoaPercentage = cocoaPercentage;
	}

	public float getCocoaPercentage() {
		return cocoaPercentage;
	}

	@Override
	public String toString() {
		return super.toString() + " /cocoa% " + cocoaPercentage;
	}

	@Override
	public boolean equals(Object obj) {

		СandyСane other = (СandyСane) obj;
		if (cocoaPercentage != other.cocoaPercentage)
			return false;
		return true;
	}

}
