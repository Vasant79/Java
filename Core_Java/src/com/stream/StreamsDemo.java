package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * stream - for prcession collection data
 * 2 steps - 1st configration (filter or map) 2nd- processing(collect() .. other method)
 */

public class StreamsDemo {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			l1.add(i);
		}

		System.out.println(l1);

		// printing even no using streams
		List<Integer> l2 = l1.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());

		System.out.println(l2);

	}

}
