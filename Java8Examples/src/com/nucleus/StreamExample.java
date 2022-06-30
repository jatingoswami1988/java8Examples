package com.nucleus;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	Predicate<Product> priceP = new Predicate<Product>() {

		@Override
		public boolean test(Product t) {
			return false;
		}
	};
}

public class StreamExample {

	public static void main(String[] args) {

		
		/*Introduced in Java 8, the Stream API is used to process collections of objects. 
		 * A stream is a sequence of objects that supports various methods which
		 *  can be pipelined to produce the desired result.*/
		
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		
		List<Float> productPriceList2 = productsList.stream().filter(p -> p.price > 30000)
				.map(p -> p.price).collect(Collectors.toList());
		
		//// Total Sum >>>>
		
		double sum = productsList.stream().collect(Collectors.summingDouble(p->p.price));
		System.out.println(sum);
		
		Long count = productsList.stream().filter(p->p.price>1000).count();
		System.out.println(count);
		
		/// Convert list to set > 
		
		Set<Float> productPriceList = productsList.stream().filter(product->product.price < 30000)
										.map(product->product.price).collect(Collectors.toSet());
		
		Map<Integer,String> productPriceMap = productsList.stream().collect(Collectors.toMap(p->p.id, p->p.name));
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(6);
		Integer result = list.stream().reduce(Integer::sum).get();
		System.out.println(result);
		
		
		List<Integer> fList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(fList);
		

	}

}
