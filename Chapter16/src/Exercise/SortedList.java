package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class SortedList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		
		Random rand = new Random();
		int count = 25;
		for(int i = 0; i<count; i++) {
			int num = rand.nextInt(100);
			numbers.add(num);
		}
		
		sortList(numbers);
		sumList(numbers);
		average(numbers);

	}
	public static void sortList(List<Integer> list) {
		Collections.sort(list);
	}
	public static int sumList(List<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		int sum = 0;
		while(iterator.hasNext()) {
			int num = iterator.next();
			sum += num;
		}
		return sum;
		
	}
	public static double average(List<Integer> list) {
		int total = list.size();
		int sum = sumList(list);
		System.out.printf("Sum of list: %d%n", sum);
		double average = sum/total;
		System.out.printf("Average: %.2f%n", average);
		return average;
	}

}
