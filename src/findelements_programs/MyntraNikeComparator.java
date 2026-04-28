package findelements_programs;

import java.util.Comparator;

public class MyntraNikeComparator implements Comparator<MyntraNike> {

	
	public int compare(MyntraNike obj1, MyntraNike obj2) {
		
		//logic to sort based on price
		/* Integer IntPrice1 = Integer.valueOf(obj1.price.split("Rs.")[1].trim());
		Integer IntPrice2 = Integer.valueOf(obj2.price.split("Rs.")[1].trim());
		
		return IntPrice1.compareTo(IntPrice2); */
		
		//logic to sort based on name
		return obj1.name.compareTo(obj2.name);
	}
}
