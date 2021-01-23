package examples;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayAndStreams {

	public static void main(String[] args) {
		String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};
		
		//display original string
		System.out.printf("Original strings: %s%n", Arrays.asList(strings));
		
		//strings in upper case
		System.out.printf("strings in uppercase: %s%n", Arrays.stream(strings)
				.map(String::toUpperCase)// equivalent to (String s) -> s.toUpperCase()
				.collect(Collectors.toList()));

		//strings less than "n" (Case insensitive) sorted ascending
		System.out.printf("strings greater than m sorted decending: %s%n", Arrays.stream(strings)
				.filter(s -> s.compareToIgnoreCase("n") < 0)
				.sorted(String.CASE_INSENSITIVE_ORDER)
				.collect(Collectors.toList()));
		//strings less than "n" (case insensitive) sorted descending
		System.out.printf("strings greater than m sorted descending: %s%n", Arrays.stream(strings)
				.filter(s -> s.compareToIgnoreCase("n") < 0)
				.sorted(String.CASE_INSENSITIVE_ORDER.reversed())
				.collect(Collectors.toList()));
		
		
		
		
	}

}
