package com.epam.task1;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void testSummWeight() {

		// GIVEN
		Present underTest = new Present();
		List<Sweets> presentSweet = new ArrayList<Sweets>();
		presentSweet.add(new СandyСane("Buslyk1", 59, 27, (float) 25.5));
		presentSweet.add(new СandyСane("Buslyk2", 55, 22, (float) 35.5));
		presentSweet.add(new СandyСane("Buslyk3", 58, 31, (float) 45.5));

		presentSweet.add(new LequeureCandy("Rum1", 21, 25, (float) 4.2));
		presentSweet.add(new LequeureCandy("Rum2", 22, 26, (float) 2.2));
		presentSweet.add(new LequeureCandy("Rum3", 23, 27, (float) 6.2));
		presentSweet.add(new LequeureCandy("Rum4", 25, 28, (float) 8.2));

		presentSweet.add(new Lollipop("LLLLL1", 52, 19, "Lemon1"));
		presentSweet.add(new Lollipop("LLLLL2", 53, 20, "Lemon2"));
		presentSweet.add(new Lollipop("LLLLL3", 54, 21, "Lemon3"));
		presentSweet.add(new Lollipop("LLLLL4", 55, 22, "Lemon4"));

		// WHEN
		underTest.setPresentSweet(presentSweet);

		float result = underTest.summWeight();

		float expectedResult = (float) 477.0;
		// THEN

		Assert.assertEquals(expectedResult, result);

	}

	@Test
	public void testSummWeight2() {

		// GIVEN
		Present underTest = new Present();
		List<Sweets> presentSweet = new ArrayList<Sweets>();
		presentSweet.add(new СandyСane("Buslyk1", 59, 27, (float) 25.5));
		presentSweet.add(new СandyСane("Buslyk2", 55, 22, (float) 35.5));
		presentSweet.add(new СandyСane("Buslyk3", 58, 31, (float) 45.5));

		presentSweet.add(new LequeureCandy("Rum1", 22, 25, (float) 4.2));
		presentSweet.add(new LequeureCandy("Rum2", 23, 26, (float) 2.2));
		presentSweet.add(new LequeureCandy("Rum3", 24, 27, (float) 6.2));
		presentSweet.add(new LequeureCandy("Rum4", 25, 28, (float) 8.2));

		presentSweet.add(new Lollipop("LLLLL1", 52, 19, "Lemon1"));
		presentSweet.add(new Lollipop("LLLLL2", 53, 20, "Lemon2"));
		presentSweet.add(new Lollipop("LLLLL3", 54, 21, "Lemon3"));
		presentSweet.add(new Lollipop("LLLLL4", 55, 22, "Lemon4"));

		// WHEN
		underTest.setPresentSweet(presentSweet);

		float result = underTest.summWeight();

		float expectedResult = (float) 480.0;
		// THEN

		Assert.assertEquals(expectedResult, result);

	}

	@Test
	public void testSearchSweet() {

		// GIVEN
		Present underTest = new Present();
		List<Sweets> presentSweet = new ArrayList<Sweets>();
		presentSweet.add(new СandyСane("Buslyk1", 59, 27, (float) 25.5));
		presentSweet.add(new СandyСane("Buslyk2", 55, 22, (float) 35.5));
		presentSweet.add(new СandyСane("Buslyk3", 58, 31, (float) 45.5));

		presentSweet.add(new LequeureCandy("Rum1", 21, 25, (float) 4.2));
		presentSweet.add(new LequeureCandy("Rum2", 22, 26, (float) 2.2));
		presentSweet.add(new LequeureCandy("Rum3", 23, 27, (float) 6.2));
		presentSweet.add(new LequeureCandy("Rum4", 25, 28, (float) 8.2));

		presentSweet.add(new Lollipop("LLLLL1", 52, 19, "Lemon1"));
		presentSweet.add(new Lollipop("LLLLL2", 53, 20, "Lemon2"));
		presentSweet.add(new Lollipop("LLLLL3", 54, 21, "Lemon3"));
		presentSweet.add(new Lollipop("LLLLL4", 55, 22, "Lemon4"));

		// WHEN
		underTest.setPresentSweet(presentSweet);

		Sweets result = underTest.searchSweet(20, 22);

		Sweets expectedResult = presentSweet.get(9);
		// THEN

		Assert.assertEquals(expectedResult, result);

	}

	@Test
	public void testSearchSweet2() {

		// GIVEN
		Present underTest = new Present();
		List<Sweets> presentSweet = new ArrayList<Sweets>();
		presentSweet.add(new СandyСane("Buslyk1", 59, 27, (float) 25.5));
		presentSweet.add(new СandyСane("Buslyk2", 55, 22, (float) 35.5));
		presentSweet.add(new СandyСane("Buslyk3", 58, 31, (float) 45.5));

		presentSweet.add(new LequeureCandy("Rum1", 21, 25, (float) 4.2));
		presentSweet.add(new LequeureCandy("Rum2", 22, 26, (float) 2.2));
		presentSweet.add(new LequeureCandy("Rum3", 23, 27, (float) 6.2));
		presentSweet.add(new LequeureCandy("Rum4", 25, 28, (float) 8.2));

		presentSweet.add(new Lollipop("LLLLL1", 52, 19, "Lemon1"));
		presentSweet.add(new Lollipop("LLLLL2", 53, 20, "Lemon2"));
		presentSweet.add(new Lollipop("LLLLL3", 54, 21, "Lemon3"));
		presentSweet.add(new Lollipop("LLLLL4", 55, 22, "Lemon4"));

		// WHEN
		underTest.setPresentSweet(presentSweet);

		Sweets result = underTest.searchSweet(28, 40);

		Sweets expectedResult = presentSweet.get(2);
		// THEN

		Assert.assertEquals(expectedResult, result);

	}

	@Test
	public void testsortSweets() {

		// GIVEN
		Present underTest = new Present();
		List<Sweets> presentSweet = new ArrayList<Sweets>();

		presentSweet.add(new LequeureCandy("Rum3", 23, 27, (float) 6.2));
		presentSweet.add(new Lollipop("LLLLL4", 55, 22, "Lemon4"));
		presentSweet.add(new LequeureCandy("Rum4", 25, 28, (float) 8.2));
		presentSweet.add(new СandyСane("Buslyk3", 58, 31, (float) 45.5));
		presentSweet.add(new LequeureCandy("Rum1", 21, 25, (float) 4.2));
		presentSweet.add(new LequeureCandy("Rum2", 22, 26, (float) 2.2));
		presentSweet.add(new Lollipop("LLLLL1", 52, 19, "Lemon1"));
		presentSweet.add(new СandyСane("Buslyk1", 59, 27, (float) 25.5));
		presentSweet.add(new СandyСane("Buslyk2", 55, 22, (float) 35.5));
		presentSweet.add(new Lollipop("LLLLL2", 53, 20, "Lemon2"));
		presentSweet.add(new Lollipop("LLLLL3", 54, 21, "Lemon3"));

		// WHEN
		underTest.setPresentSweet(presentSweet);

		List<Sweets> result = underTest.sortSweets("Name");

		List<Sweets> expectedResult = presentSweet;
		// THEN

		Assert.assertEquals(expectedResult, result);

	}

}
