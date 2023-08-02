package com.lumen.set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NaviSetDemo {
	public static void main(String[] args) {
		NavigableSet<String>set = new TreeSet<>(Arrays.asList("apple","orange","mango","kivi"));
		System.out.println(set);
		System.out.println(set.descendingSet());
		
//		headset
		SortedSet<String> headData = set.headSet("mango");
		System.out.println(headData);
		
		SortedSet<String> headData1 = set.headSet("mango",true);
		System.out.println(headData1);
		
		SortedSet<String> tailData = set.tailSet("mango",true);
		System.out.println(tailData);
		System.out.println();
		
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.floor("grapes"));//takes previous one
		System.out.println(set.floor("grape"));
		System.out.println();
		System.out.println(set.ceiling("grapes"));//set ceiling prints the actual value
		System.out.println(set.ceiling("ora"));
	}
}
