package com.tnsif.day18_stream_api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {
	public static void main(String[] args) {
//		Acquire a stream - Stream.of(values)
		Stream<Integer> numStream = Stream.of(1,5,3,7,2,8,2,5);
//		Terminal ops -> count() - count the value
		System.out.println("Total Value : " + numStream.count());
		
		numStream = Stream.of(1,5,3,7,2,8,2,5);
//		find distinct values
		Stream<Integer> distinctNums = numStream.distinct();
		
		long count = distinctNums.count();
		System.out.println("Total distinct Values : " + count);
		
//		skip
		numStream = Stream.of(1,5,3,7,2,8,2,5);
		count = numStream.skip(3).count();
//		java.lang.IllegalArgumentException
//		count = numStrea.skip(-2).count();
		System.out.println("Total Values after skipping : " + count);

//		limit
		numStream = Stream.of(1,5,3,7,2,8,2,5);
		numStream = numStream.limit(5);
		count = numStream.count();
		
		System.out.println("Total distinct Values : " + count);

//		Terminal op - collect
		
		numStream = Stream.of(1,5,3,7,2,8,2,5);
		List<Integer> numList = numStream.collect(Collectors.toList());
		System.out.println(numList);
		
		numStream = Stream.of(1,5,3,7,2,8,2,5);
		List<Integer> distinctInt = numStream.distinct().collect(Collectors.toList());
		System.out.println(distinctInt);

//		forEach - perform operation on each value of stream
		numStream = Stream.of(1,5,3,7,2,8,2,5);
//		method reference
		numStream.forEach(System.out::print);
		
		
	}
}
