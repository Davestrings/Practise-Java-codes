package learning;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaPractise {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sam","Peter","Billing","Sam");
		int[] figures = {0, 4, 7, 3, 9, 1};
		
		List<String> uniqueValues = names.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueValues);
		
		OptionalInt max = IntStream.of(figures).max();
		System.out.println(max.getAsInt());
	}

}
