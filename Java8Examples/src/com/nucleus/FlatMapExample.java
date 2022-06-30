package com.nucleus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	// Java 8 Stream flatMap() method is used to flatten a Stream of collections to
	// a stream of objects.
	// The objects are combined from all the collections in the original Stream.
	// The flatMap() operation has the effect of applying a one-to-many
	// transformation to the elements of the stream
	// and then flattening the resulting elements into a new stream.

	public static void main(String arh[]) {
		List<String> list1 = Arrays.asList("Jatin", "Goswami", "Sakhi");
		List<String> list2 = Arrays.asList("Nitin", "Saching", "Meenakhsi");
		List<String> list3 = Arrays.asList("Niavish", "Chetan", "Shubham");
		List<List<String>> finalList = Arrays.asList(list1, list2, list3);
		List<String> listOfAllIntegers = finalList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(listOfAllIntegers);
	}
}
