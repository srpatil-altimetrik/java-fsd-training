package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Demo_HashMap {
	public static void main(String[] args) {
//		HashMap map = new HashMap<>(); no duplicate + nixed order
//		Hashtable map = new Hashtable<>();  Legacy class
		TreeMap map = new TreeMap<>(); // no duplicate + sorted ordered
//		LinkedHashMap map = new LinkedHashMap<>(); no duplicate + user defined order

		map.put(222, "Shashank");
		map.put(111, "Shubham");
		map.put(444, "Mayur");
		map.put(222, "Mehak");
		map.put(333, "Vinay");
		map.put(333, "Hany");

		Set s = map.entrySet();
		Iterator i = s.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
