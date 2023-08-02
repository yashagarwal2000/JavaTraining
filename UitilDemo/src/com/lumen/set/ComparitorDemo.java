package com.lumen.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparitorDemo {

	public static void main(String[] args) {
		Vechile vechile1 = new Vechile("Mahindra","thar",100010);
		Vechile vechile2 = new Vechile("od","A9",100010);
		Vechile vechile3 = new Vechile("Honda","city",100010);
		
		
		List<Vechile> vechicles = new ArrayList<>();
		vechicles.add(vechile1);
		vechicles.add(vechile2);
		vechicles.add(vechile3);
		
		
		for (Vechile vechile : vechicles) {
			System.out.println(vechile);
		}
		System.out.println("List of vechile");
		Comparator<Vechile>comparator = new BrandSort();
		Collections.sort(vechicles,comparator);
		for (Vechile vechile : vechicles) {
			System.out.println(vechile);
		}
		System.out.println("sorting using brand");
		Collections.sort(vechicles,new ModelSort());
		for (Vechile vechile : vechicles) {
			System.out.println(vechicles);
		}
		System.out.println("Sorting using price");
		Collections.sort(vechicles,new PriceSort());
		for (Vechile vechile : vechicles) {
			System.out.println(vechile);
		}
	}

}
