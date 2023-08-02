package com.lumen.set;

import java.util.Comparator;

public class PriceSort implements Comparator<Vechile> {

	@Override
	public int compare(Vechile o1, Vechile o2) {
		Double price1 = o1.getPrice();
		Double price2 = o2.getPrice();
//		return price1.compareTo(price2);
		
		
//		or
		
		return((Double)o1.getPrice()).compareTo(o2.getPrice());
	}
	

}
