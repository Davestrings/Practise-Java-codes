package examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndStreams {

	public static void main(String[] args) {
		Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};
		
		//display original values
		System.out.printf("Original values: %s%n", Arrays.asList(values));
		
		//display sorted values
		System.out.printf("Sorted array: %s%n", Arrays.stream(values).sorted().collect(Collectors.toList()));
		
		//values greater than 4
		List<Integer> greaterThan4 = Arrays.stream(values).filter(value -> value > 4).collect(Collectors.toList());
		System.out.printf("Values greater than 4 : %s%n", greaterThan4);
		
		System.out.printf("Sorted greater than 4 : %s%n", Arrays.stream(values).filter(value -> value > 4).sorted().collect(Collectors.toList()));
		
		//List sorted with stream
		System.out.printf("%nList sorted with stream %s%n", greaterThan4.stream().sorted().collect(Collectors.toList()));
	}

}
