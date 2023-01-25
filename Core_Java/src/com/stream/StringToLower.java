package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * coverting string to lower case
 */
public class StringToLower {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();
		l1.add("VASANT");
		l1.add("SINGH");
		l1.add("NEGI");

		System.out.println(l1);

		// using stream
		List<String> l2 = l1.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
		System.out.println(l2);

	}

}
