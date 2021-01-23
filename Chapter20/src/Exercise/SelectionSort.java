package Exercise;



public class SelectionSort {
	
	public static <T extends Comparable<T>> T[] selectionSort(T[] array) {
		for(int count = 0; count < array.length-1; count++) {
			int smallest = count;
			for(int index = count + 1; index < array.length; index++) {
				if(array[count].compareTo(array[index]) > 0) {
					smallest = index;
					
					T temp = array[smallest];
					array[smallest] = array[count];
					array[count] = temp;
				}
			}
			
		}
		return array;
	}

	public static void main(String[] args) {
		Integer[] intArray = {67, 5, 78, 45, 30, 4, 35, 8, 3, 20};
		Float[] floatArray = {45.3f, 56f, 12.5f, 45.2f, 45.24f, 5.5f, 6.2f, 35f};
		Double[] doubleArray = {56.34, 23.2, 45.0, 5.0, 78.4, 27.7, 30.5, 89.0 };
		
		System.out.printf("%nUnsorted Integer: %n");
		for(int val : intArray)
			System.out.printf("%s ", val);
		
		System.out.println();
		Integer[] newArray = new Integer[intArray.length];
		int count = 1;
		
		while(count < 4) {
			newArray = selectionSort(intArray);
			count++;
		}
		System.out.printf("%nsorted Integer: %n");
		for(int i : newArray)
			System.out.printf("%d ", i);
		
		System.out.println();
		
		
		
		
		System.out.printf("%nUnsorted Float: %n");
		for(float val : floatArray)
			System.out.printf("%s ", val);
		
		System.out.println();
		
		Float[] newFloat = new Float[floatArray.length];
		count = 1;
		while(count < 4) {
			newFloat = selectionSort(floatArray);
			count++;
		}
		System.out.printf("%nsorted Float: %n");
		for(float i : newFloat)
			System.out.printf("%.1f ", i);
		
		System.out.println();
		
		
		
		System.out.printf("%nUnsorted Double: %n");
		for(double val : doubleArray)
			System.out.printf("%s ", val);
		
		System.out.println();
		
		Double[] newDouble = new Double[doubleArray.length];
		count = 1;
		while(count < 4) {
			newDouble = selectionSort(doubleArray);
			count++;
		}
		System.out.printf("%nsorted Double: %n");
		for(double i : newDouble)
			System.out.printf("%.1f ", i);
	}
}
