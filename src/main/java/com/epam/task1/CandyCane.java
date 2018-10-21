package com.epam.task1;

class СandyСane extends Sweets {
	private float cocoaPercentage;

	public СandyСane(String name, float weight, float sugar, float cocoaPercentage) {
		super(name, weight, sugar);
		this.cocoaPercentage = cocoaPercentage;
	}


	public float getCocoaPercentage() {
		return cocoaPercentage;
	}

	@Override
	public String toString() {
		return super.toString() + " /cocoa% " + cocoaPercentage;
	}

}
