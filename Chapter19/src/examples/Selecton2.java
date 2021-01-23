package examples;

public class Selecton2 {

	public static void selection(int[] array) {
		for(int j = 0; j <array.length; j++) {
			for(int i = j+1; i<array.length; i++) {
				if(array[j] > array[i]) {
					int temp = array[i];
					int temp2 = array[j];
					array[i] = temp2;
					array[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] elements = {34, 56, 4, 10, 77, 51, 93, 30, 5, 52};
		selection(elements);
		
		for(int i : elements)
			System.out.printf("%d ", i);

	}

}
