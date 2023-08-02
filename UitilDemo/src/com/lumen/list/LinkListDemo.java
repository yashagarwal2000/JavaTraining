package com.lumen.list;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		System.out.println(list.size());
		list.add("java");
		list.add("100");
		list.add("100.2");
		list.add(1, "Helem");
		System.out.println(list.size());
		list.set(2, "Priya");
		System.out.println(list.size());
		list.addFirst("html");
		list.addLast("css");
		
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			String name = iterator.next();
//			System.out.println(name.toLowerCase());
//		}
//		Collections.sort(list);
//
//		System.out.println(list);
		
		System.out.println("Methord");
		System.out.println(list.peek());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		
		
		
		System.out.println(list.remove());
		System.out.println(list.element());
	}

}
