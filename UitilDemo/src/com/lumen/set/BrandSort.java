package com.lumen.set;

import java.util.Comparator;

public class BrandSort implements Comparator<Vechile>{

	@Override
	public int compare(Vechile o1, Vechile o2) {
		// TODO Auto-generated method stub
		return o1.getBrand().compareTo(o2.getBrand());
	}

	
}
