package com.nucleus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MethodReferencesExample {
	
	public static void main(String args[]){
		
		
		//Math::max equivalent to Math.max(x,y)
		//System.out::println equivalent to System.out.println(x)
		//String::length equivalent to str.length()
		//ArrayList::new equivalent to new ArrayList()
		
		Consumer<String> c = System.out::println;
		List<String> strings = Arrays.asList("how", "to", "do", "in", "java", "dot", "com");
		List<String> sorted = strings.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(sorted);
		List<String> sortedAlt = strings.stream().sorted(String::compareTo).collect(Collectors.toList());
		System.out.println(sortedAlt);

		Collections.sort(strings,Collections.reverseOrder());
		
	}

}
