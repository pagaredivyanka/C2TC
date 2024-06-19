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
		
		System.out.println("Total distinct Values : " + count);

		
		numStream = Stream.of(1,5,3,7,2,8,2,5);
		System.out.println("Total distinct Values : " + count);

		
		
		numStream = Stream.of(1,5,3,7,2,8,2,5);
		System.out.println("Total distinct Values : " + count);

		
		
		numStream = Stream.of(1,5,3,7,2,8,2,5);
		System.out.println("Total distinct Values : " + count);

		
		
		
	}
}
