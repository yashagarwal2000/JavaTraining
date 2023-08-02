package com.lumen.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1, "java");
		hashMap.put(10, "Spring");
		hashMap.put(18, "Node");
		hashMap.put(null, "Css");
		hashMap.put(5, "Html");
		hashMap.put(1, "react");
		hashMap.put(100, null);
		hashMap.put(101, null);
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.get(20));
		System.out.println(hashMap.getOrDefault(20, "Node"));
		System.out.println(hashMap.containsKey(1));
		
		Set<Integer> keys = hashMap.keySet(); // return all the keys values
		for (Integer key : keys) {
			System.out.println(key + " "+hashMap.get(key));
		}
		System.out.println();
		
//		get the inner class entry
		Set<java.util.Map.Entry<Integer,String>> map = hashMap.entrySet();
		for (java.util.Map.Entry<Integer,String> entry : map) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println();
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " "+ val);
		}
	}
}
