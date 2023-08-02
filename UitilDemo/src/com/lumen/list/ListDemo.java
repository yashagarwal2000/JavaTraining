package com.lumen.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		list.add("java");
		list.add("100");
		list.add("100.2");
		list.add(1, "Helem");
		System.out.println(list.size());
		list.set(2, "Priya");
		System.out.println(list.size());

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name.toLowerCase());
		}
		Collections.sort(list);

		System.out.println(list);
		
		System.out.println("Reverse");
		ListIterator<String> listIterator = list.listIterator(list.size());
		while (listIterator.hasPrevious()) {
			String name = listIterator.previous();
			System.out.println(name);
			
		}
		
	}
}
