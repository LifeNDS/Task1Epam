package com.epam.task1;

public class App {
	public static void main(String[] args) {

		CollectionSweets collSweets = new CollectionSweets();

		Present presentSweet = new Present();

		presentSweet.setPresentSweet(collSweets.toCollect());

		// System.out.println(presentSweet.summWeight());

		System.out.println(presentSweet.searchSweet(20, 22));
		String paramSort = "Sugar";
		// String paramSort = "Sugar";
		// String paramSort = "Weight";

		System.out.println(presentSweet.sortSweets(paramSort));
		/*
		 * for (Sweets sweet : presentSweet.getPresentSweet()) {
		 * 
		 * System.out.println(sweet.getName() + " - " + sweet.getWeight()); }
		 * 
		 */
		/*
		 * presentSweet.SummWeight();
		 * 
		 * System.out.print(presentSweet.getPresentWeight());
		 */
	}

}
