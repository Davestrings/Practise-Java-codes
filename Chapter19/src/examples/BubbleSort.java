package examples;

import java.security.SecureRandom;

public class BubbleSort {
	public static  void bubbleSort(int[] list) {
		//loop from end of the array but not up to index 0
		for(int index = list.length-1; index > 0; index--) {
			//loop from the beginning to just before index
			for(int innerIndex = 0; innerIndex < index; innerIndex++) {
				//compare value at beginning to that at the end
				System.out.printf("index: %d innerIndex: %d before swap%n", list[index], list[innerIndex]);
				if(list[innerIndex] > list[index]) {
					//swap if the value at the beginning is greater than the value at the end
					int temporary = list[index];
					list[index] = list[innerIndex];
					list[innerIndex] = temporary;
					System.out.printf("index: %d innerIndex: %d after swap%n%n", list[index], list[innerIndex]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		SecureRandom random = new SecureRandom();
		System.out.println("Unsorted Array: %n");
		for(int index = 0; index < numbers.length; index++) {
			numbers[index] = 10 + random.nextInt(80);
			System.out.printf("%d ", numbers[index]);
		}
		
		bubbleSort(numbers);
		System.out.printf("%nAfter Sorting:%n");
		for(int value : numbers)
			System.out.printf("%d ", value);

	}

}
