package com.epam.task1;

import org.apache.log4j.Logger;

public class Lollipop extends Sweets {
	static final Logger LOG = Logger.getLogger(Lollipop.class);
	String taste;

	public Lollipop(String name, float weight, float sugar, String taste) {
		super(name, weight, sugar);

		if (taste == null) {
			LOG.fatal("Argument taste can not be null.");
			throw new NullPointerException("Argument taste can not be null.");
		}
		if (taste.isEmpty()) {
			LOG.fatal("Taste of sweet can not be empty.");
			throw new IllegalArgumentException("Taste of sweet can not be empty.");
		}
		this.taste = taste;
		LOG.info(super.toString() + " /taste " + taste);
	}

	public String getTaste() {
		return taste;
	}

	@Override
	public String toString() {
		return super.toString() + " /taste " + taste;
	}

	@Override
	public boolean equals(Object obj) {

		Lollipop other = (Lollipop) obj;
		if (taste != other.taste)
			return false;
		return true;
	}
}
