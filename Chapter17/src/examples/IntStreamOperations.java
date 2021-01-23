package examples;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntStreamOperations {

	public static void main(String[] args) {
		int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
		
		IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
		System.out.println("\n");
		
		System.out.printf("%nCount: %d%n", IntStream.of(values).count());
		System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
		System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
		System.out.printf("Average: %.2f", IntStream.of(values).average().getAsDouble());
		
		//sum values with reduce method
		System.out.printf("%nSum via reduce method: %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y));
		
		System.out.printf("Sum of square via reduce method: %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y * y));
		
		System.out.printf("Product via reduce method: %d%n", IntStream.of(values).reduce(1, (x, y) -> x * y));
		
		System.out.printf("%nEven values displayed in sorted order: ");
		IntStream.of(values).filter(value -> value % 2 == 0).sorted().forEach(value -> System.out.printf("%d ", value));
		System.out.println();
		//Using intermediate operation Predicate
		System.out.printf("%nUsing predicate intermediate operation%n");
		IntPredicate even = value -> value % 2 == 0;
		IntPredicate greaterThan5 = value -> value > 5 ;
		IntStream.of(values).filter(even.and(greaterThan5)).sorted().forEach(value -> System.out.printf("%d ", value));
		System.out.println("\n");
		
		System.out.printf("Odd values multiplied by 10 displayed in sorted order: ");
		IntStream.of(values).filter(value -> value % 2 != 0).map(value -> value * 10).sorted().forEach(value -> System.out.printf("%d ", value));
		System.out.println();
		
		System.out.printf("%nsum of intrgers from 1 - 10: %d%n", IntStream.range(1, 10).sum());
		
		//sum range of integers from 1 to 10, inclusive
		System.out.printf("%nsum of integers from 1 - 10: %d%n", IntStream.rangeClosed(1, 10).sum());
		System.out.println();
		System.out.println();
		System.out.println(IntStream.of(values).summaryStatistics());
	}

}
