package com.nucleus;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByExample {

	public static void main(String ars[]) {

		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		Map<String, Long> result = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);

		String max = result.entrySet().stream()
				//.max((x,y)->x.getValue().compareTo(y.getValue()))
				.max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).get();
		System.out.println(max);
		
		String min = result.entrySet().stream()
				//.max((x,y)->x.getValue().compareTo(y.getValue()))
				.min(Comparator.comparing(Map.Entry::getValue))
				.map(Map.Entry::getKey).get();
		System.out.println(min);

		Map<Integer, String> treeMap = new TreeMap<Integer, String>(Collections.reverseOrder());

	}

}
