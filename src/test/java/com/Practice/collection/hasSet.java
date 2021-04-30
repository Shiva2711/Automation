package com.Practice.collection;

import java.util.HashSet;
import java.util.Iterator;

public class hasSet {

	public static void main(String[] args) {

		HashSet<String> h = new HashSet<>();
		h.add("India");
		h.add("PAKistan");
		h.add("China");

		System.out.println(h);

		h.add("China");

		System.out.println(h);

		h.remove("China");

		System.out.println(h);

		Iterator<String> it = h.iterator();

		System.out.println(it.next());
		System.out.println(it.next());

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
