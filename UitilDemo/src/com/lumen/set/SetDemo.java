package com.lumen.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
//		Set<String> hashSet = new HashSet<>();//sorted
//		Set<String> hashSet = new LinkedHashSet<>();//print as it is how it is given
		Set<String> hashSet = new TreeSet<>();//sorted and don't takes null pointer
		
		
		
		hashSet.add("Apple");
		hashSet.add("Orange");
		hashSet.add("Banana");
		hashSet.add("kiwi");
		hashSet.add("100");
		hashSet.add(null);
		hashSet.add("Apple");
		System.out.println(hashSet);
		System.out.println(hashSet);
		for (String element : hashSet) {
			System.out.println(element);
		}
	}
}
