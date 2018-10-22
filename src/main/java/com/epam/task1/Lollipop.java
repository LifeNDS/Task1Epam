package com.epam.task1;

public class Lollipop extends Sweets {
	String taste;

	public Lollipop(String name, float weight, float sugar, String taste) {
		super(name, weight, sugar);

		if (taste == null) {
			throw new NullPointerException("Argument taste can not be null.");
		}
		if (taste.isEmpty()) {
			throw new IllegalArgumentException("Taste of sweet can not be empty.");
		}
		this.taste = taste;
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
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lollipop other = (Lollipop) obj;
		if (taste != other.taste)
			return false;
		return true;
	}
}
