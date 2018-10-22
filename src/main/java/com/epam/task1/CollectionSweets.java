package com.epam.task1;

import java.util.ArrayList;
import java.util.List;

public class CollectionSweets {

	private List<Sweets> sw = new ArrayList<Sweets>();

	public List<Sweets> toCollect() { // Present

		/*
		 * СandyСane candycane = new СandyСane("Buslyk", 50, 20, (float) 55.5);
		 * sw.add(candycane);
		 * 
		 * LequeureCandy lequeurCeandy = new LequeureCandy("Rum", 20, 21, (float) 8.2);
		 * sw.add(lequeurCeandy);
		 * 
		 * Lollipop lollip = new Lollipop("LLLLL", 52, 19, "Lemon"); sw.add(lollip);
		 */
		sw.add(new СandyСane("Buslyk1", 59, 27, (float) 25.5));
		sw.add(new СandyСane("Buslyk2", 55, 22, (float) 35.5));
		sw.add(new СandyСane("Buslyk3", 58, 31, (float) 45.5));

		sw.add(new LequeureCandy("Rum1", 22, 25, (float) 4.2));

		sw.add(new LequeureCandy("Rum2", 23, 26, (float) 2.2));
		sw.add(new LequeureCandy("Rum3", 24, 27, (float) 6.2));
		sw.add(new LequeureCandy("Rum4", 25, 28, (float) 8.2));

		sw.add(new Lollipop("LLLLL1", 52, 19, "Lemon1"));
		sw.add(new Lollipop("LLLLL2", 53, -20, "Lemon2"));
		sw.add(new Lollipop("LLLLL3", 54, 21, "Lemon3"));
		sw.add(new Lollipop("LLLLL4", 55, 22, "Lemon4"));

		return sw;

	}
}
