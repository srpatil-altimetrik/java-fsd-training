package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Demo_Collection {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		ArrayList al1 = new ArrayList<>();
//		LinkedList al = new LinkedList<>(); store in node format
//		Stack al = new Stack<>(); Legacy class
//		Vector al = new Vector<>(); Legacy class
//		LinkedHashSet al = new LinkedHashSet<>(); no duplicate + store in user define order
//		TreeSet al = new TreeSet<>(); no duplicate + sorted order + only store Homogeneous type of data
		al.add(100);
		al.add(200);
		al.add(500);
		al.add(350);
		al.add(100);
		al.add(200);
		al.add(900);
		al.add(600);
		al.add(900);
		al.add(1000);

		Iterator i = al.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

//		Collections.sort(al);
//		System.out.println(al);
//		Collections.reverse(al);
//		System.out.println();
//		System.out.println(al.contains(600));
//		System.out.println(al.isEmpty());
//		System.out.println(al.size());
//		System.out.println(al1.addAll(al));
//		System.out.println(al1);
//		System.out.println(al.remove(2));
//		System.out.println(al);
	}
}
