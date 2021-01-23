package examples;

import java.security.SecureRandom;

public class Bubble {
	public static void bubbleSort(int[] array) {

		for(int index = 0; index < array.length; index++) {
			//assign index to variable check for reference with inner loop
			int check = index;
			//compare every index against index 0(check)
			for(int next = check+1; next < array.length; next++) {
				//if index check is greater than the next index swap
				if(array[check] > array[next]) {
					int temp = array[check];
					array[check] = array[next];
					array[next] = temp;
					//check index is now the new swapped value which will also be compared to other indexes
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {4, 6, 2, 1, 3, 8};
		int[] arr2 = new int[10];
		SecureRandom random = new SecureRandom();
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = 10 + random.nextInt(80);
		}
		
		System.out.println("arr before sort");
		print(arr);
		
		bubbleSort(arr);
		
		System.out.println("\narr after sort");
		print(arr);
		

		System.out.println("\n");
		
		System.out.println("arr2 before sort");
		print(arr2);
		
		bubbleSort(arr2);
		
		System.out.println("\narr2 after sort");
		print(arr2);
	}
	public static void print(int[] array) {
		for(int i : array)
			System.out.printf("%d ", i);
	}

}
