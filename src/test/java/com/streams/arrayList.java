package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.hamcrest.core.StringStartsWith;
import org.testng.Assert;
import org.testng.annotations.Test;

public class arrayList {

	// @Test
	public void regular() {

		ArrayList<String> names = new ArrayList();

		names.add("Ashok");
		names.add("Jeevitha");
		names.add("Sanjay");
		names.add("Arjun");
		names.add("Kavitha");

		int count = 0;

		for (int i = 0; i < names.size(); i++) {

			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}

		System.out.println(count);

	}

	// @Test
	public void streamsFilter() {

		ArrayList<String> names = new ArrayList();

		names.add("Ashok");
		names.add("Jeevitha");
		names.add("Sanjay");
		names.add("Arjun");
		names.add("Kavitha");

		long c = names.stream().filter(s -> s.startsWith("A")).count();

		System.out.println(c);

		long d = Stream.of("Ashok", "Jeevitha", "Sanjay", "Arjun", "Kavitha").filter(s -> {
			s.startsWith("A");
			return false;
		}).count();

		System.out.println(d);

		// names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		names.stream().filter(s -> s.length() > 5).limit(1).forEach(s -> System.out.println(s));
	}

	// @Test
	public void streamMap() {

		ArrayList<String> names = new ArrayList();

		names.add("woman");
		names.add("Jeevitha");
		names.add("man");

		Stream.of("Ashok", "Jeevitha", "Sanjay", "Arjun", "Kavitha").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		List<String> names1 = Arrays.asList("Ashok", "Jeevitha", "Sanjay", "Arjun", "Kavitha");

		names1.stream().filter(s -> s.startsWith("A")).sorted().forEach(s -> System.out.println(s));

		Stream<String> newStreams = Stream.concat(names.stream(), names1.stream());
		boolean flag = newStreams.anyMatch(s -> s.equalsIgnoreCase("Ashdeok"));
		System.out.println(flag);
		Assert.assertTrue(flag);

	}

	@Test
	public void streamCollect() {
		List<String> ls = Stream.of("Ashok", "Jeevitha", "Sanjay", "Arjun", "Kavitha").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());

		//System.out.println(ls.get(0));

		List<Integer> numbers = Arrays.asList(3, 3, 2, 2, 1, 3, 2, 4, 5);
		//numbers.stream().distinct().forEach(s -> System.out.println(s));

		List<Integer> li = numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(1));
		
		Collections.reverse(li);
		System.out.println(li);
		
		List<Integer> sol =numbers.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sol.get(1));
	}

}
