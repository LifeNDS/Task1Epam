package com.epam.task1;

public class Lollipop extends Sweets {
	String taste;

	public Lollipop(String name, float weight, float sugar, String taste) {
		super(name, weight, sugar);
		this.taste = taste;
	}

	public String getTaste() {
		return taste;
	}
	@Override
	public String toString() {
		return super.toString() + " /taste " + taste;
	}
}
