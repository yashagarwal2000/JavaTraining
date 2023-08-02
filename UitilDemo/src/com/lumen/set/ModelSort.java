package com.lumen.set;

import java.util.Comparator;

public class ModelSort implements Comparator<Vechile>{

	@Override
	public int compare(Vechile o1, Vechile o2) {
		return o1.getModel().compareTo(o2.getModel());
	}

	

}
