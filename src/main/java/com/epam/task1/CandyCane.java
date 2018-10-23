package com.epam.task1;

import org.apache.log4j.Logger;

class СandyСane extends Sweets {
	static final Logger LOG = Logger.getLogger(СandyСane.class);
	private float cocoaPercentage;

	public СandyСane(String name, float weight, float sugar, float cocoaPercentage) {
		super(name, weight, sugar);

		if (cocoaPercentage < 0) {
			LOG.fatal(super.getName() + "CocoaPercentage can not be less then zero.");
			throw new IllegalArgumentException("CocoaPercentage can not be less then zero.");
		}
		this.cocoaPercentage = cocoaPercentage;
		LOG.info(super.toString() + " /cocoa% " + cocoaPercentage);
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
