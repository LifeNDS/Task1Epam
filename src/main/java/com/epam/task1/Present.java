package com.epam.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Present {
	private List<Sweets> presentSweet = new ArrayList<Sweets>();

	private float presentWeight;

	public float getPresentWeight() {
		return presentWeight;
	}

	public void setPresentWeight(float presentWeight) {
		this.presentWeight = presentWeight;
	}

	public void setPresentSweet(List<Sweets> presentSweet) {
		this.presentSweet = presentSweet;
	}

	public List<Sweets> getPresentSweet() {
		return presentSweet;
	}

	public Sweets searchSweet(float min, float max) {
		for (Sweets sw : presentSweet) {
			if (sw.getSugar() > min && sw.getSugar() < max) {

				return sw;

			}
		}
		return null;
	}

	public float summWeight() {
		float sumTemp = 0;
		for (Sweets fff : presentSweet) {
			sumTemp += fff.getWeight();
		}
		setPresentWeight(sumTemp);
		return getPresentWeight();
	}

	public List<Sweets> sortSweets(String paramSort) {

		switch (paramSort) {
		case "Name":
			presentSweet.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

			return presentSweet;

		case "Sugar":
			Collections.sort(presentSweet, new Comparator<Sweets>() {
				@Override
				public int compare(Sweets o1, Sweets o2) {
					return (int) (o1.getSugar() - o2.getSugar());
				}
			});

			return presentSweet;
		case "Weight":
			Collections.sort(presentSweet, new Comparator<Sweets>() {
				@Override
				public int compare(Sweets o1, Sweets o2) {
					return (int) (o1.getWeight() - o2.getWeight());
				}
			});
			return presentSweet;
		default:
			return presentSweet;

		}

	}

}
