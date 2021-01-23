package examples;

public class selection {
	public static void selectionSort(int[] array) {
		for(int i = 0; i < array.length-1; i++) {
			int smallest = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] < array[i]) {
					smallest = j;
					/**
					 * This swap operation should not be done outside the inner loop
					 * doing so creates inconsistent behavior of the algorithm
					 * */
					int temp = array[i];
					array[i] = array[smallest];
					array[smallest] = temp;
					
				}
			}
			
			
			
		}
	}

	public static void main(String[] args) {
		int[] elements = {34, 56, 4, 10, 77, 51, 93, 30, 5, 52};
		

			selectionSort(elements);

		for(int i : elements)
		System.out.printf("%d ", i);

	}

}
