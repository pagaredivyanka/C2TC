package com.tnsif.day18_stream_api;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FunctionalInterface {

	public static void main(String[] args) {
		
//		1. Predicate
		Predicate<Integer> predicateObject = (n) -> n > 0;
		
		Stream<Integer> numStream = Stream.of(1,2,3,4,-4,-3,6);
		
		numStream = numStream.filter(predicateObject);
		numStream.forEach(System.out::println); 
		
//		2. Consumer
		Consumer<String> consumerObject = (s) -> System.out.println(s.toUpperCase());
		Stream<String> cityStream = Stream.of("Indore", "Pune", "Nashik", "Mumbai", "Delhi", "Ahmadnagar");
		cityStream.forEach(consumerObject);
		
//		3. Supplier
		Supplier<Integer> supplierObject = () -> {
			return 10;
		};
		
		Supplier<String> supplierObject1 = () -> "Hello Ritesh";
		System.out.println(supplierObject1.get());
		
//		4. Function
		Function<String, Integer> getLength = (s) -> s.length();
		cityStream = Stream.of("Indore", "Pune", "Nashik", "Mumbai", "Delhi", "Ahmadnagar");
		
//		map() intermediate function receives Function as parameter
		numStream = cityStream.map(getLength);
		numStream.forEach(System.out::println);
		
		System.out.println("**************************************************");
		numStream = Stream.of(1,2,3,4,5);
		
		numStream = numStream.map((n) -> n*n*n);
		numStream.forEach(System.out::println);
		
		numStream = Stream.of(1,2,3,4,5);
		System.out.println("**************************************************");
		
		Function<Integer, Double> sqrtFunction = (n) -> Math.sqrt(n);
		Stream<Double> sqrtStream = numStream.map(sqrtFunction);
		List<Double> sqrtList = sqrtStream.collect(Collectors.toList());
		
		System.out.println(sqrtList);
		System.out.println("**************************************************");
		
		
	}

}
