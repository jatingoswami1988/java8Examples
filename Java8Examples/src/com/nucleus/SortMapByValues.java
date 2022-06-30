package com.nucleus;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortMapByValues {

	public static void main(String[] args) {
		
		Map<String, Integer> unsortMap = new HashMap<String, Integer>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("j", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);

		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());
		
		/*Collections.sort(list,new Comparator<List<Map.Entry<String, Integer>>>(){

			@Override
			public int compare(List<Entry<String, Integer>> o1, List<Entry<String, Integer>> o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});*/
		
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
		
		//convert list to map
		
		//Map<String,Integer> finalResult = list.stream().collect(Collectors.toMap(Function.identity(),Function.identity()));
		Map<String,Integer> m2 = new HashMap<String, Integer>();
		for(Map.Entry<String, Integer> m : list) {
			m2.put(m.getKey(), m.getValue());
			
			
		}
		
		System.out.println(m2);
				
        
	}

}
