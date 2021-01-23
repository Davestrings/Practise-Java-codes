package examples;

import java.security.SecureRandom;
import java.util.Arrays;

public class SelectionSortTest {
	
	public static void selectionSort(int[] data) {
		for(int count = 0; count < data.length-1; count++) {
			int smallest = count;
			for(int j = count + 1; j < data.length; j++) {
				if(data[j] < data[count]) {
					smallest = j;
//					continue;
					
					swap(data, count, smallest);
					printPass(data, count+1, smallest);
				}
				
			}
			
			
		}
	}
	public static void swap(int[] data, int first, int second) {
		int temp = data[first];
		data[first] = data[second];
		data[second] = temp;
		
	}
	
	public static void printPass(int[] data, int pass, int index) {
		System.out.printf("After pass %2d: ", pass);
		
		//output elements till selected item
		for(int i = 0; i < index; i++)
			System.out.printf("%d ", data[i]);
		
		System.out.printf("%d* ", data[index]);
		
		//finish outputting array
		for(int i = index +1; i < data.length; i++)
			System.out.printf("%d ", data[i]);
		
		System.out.printf("%n              ");
		
		//indicate amount of arrays sorted
		for(int i = 0; i < pass; i++)
			System.out.printf("--  ");
		
		System.out.println();
		
	}

	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		int[] numbers = new int[20];
		
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = 10 + random.nextInt(90);
		System.out.printf("Unsorted array: %s%n",Arrays.toString(numbers));
//		selectionSort(numbers);
//		int count = 1;
//		while(count < 7) {
			selectionSort(numbers);
//			System.out.println("==================="+ count);
//			count++;
//		}
		System.out.println(Arrays.toString(numbers));
	}

}
