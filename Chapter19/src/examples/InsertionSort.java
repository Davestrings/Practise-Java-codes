package examples;

public class InsertionSort {
	public static void insertionSort(int[] array) {
		//pick the value at index 1, loop to the end of the array
		for(int index = 1; index < array.length; index++) {
			int check = array[index];
			int j = index;
			while(j > 0 && array[j-1]> check) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = check;
			
		}
	}

	public static void main(String[] args) {
		int[] arr = {4, 6, 2, 1, 3, 8};
		insertionSort(arr);
		for(int i : arr)
			System.out.printf("%d ", i);

	}

}
