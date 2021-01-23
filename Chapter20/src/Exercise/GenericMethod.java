package Exercise;

public class GenericMethod {
	private static <T> void printArray(T[] array) {
		for(T i : array)
			System.out.printf("%s ", i);
		System.out.println();
	}
	
	private static <T> void printArray(T[] array, int lowEnd, int highEnd) throws ArrayIndexOutOfBoundsException {
		for(int index = lowEnd; index < highEnd; index++) {
			System.out.printf("%s ", array[index]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray = {3, 4, 5, 6, 3, 7, 8, 9, 10, 23, 4, 5, 9};
		Double[] doubleArray = {4.5, 2.3, 7.4, 1.2, 2.1, 3.2, 4.2, 55.7, 6.8, 34.0, 50.1};
		
		System.out.println("individual Array: ");
		printArray(intArray);
		printArray(doubleArray);
		
		try {
			int x= 4;
			int y = 9;
			System.out.printf("%nLimit LowEnd: %d HighEnd: %d%n", x, y);
			printArray(intArray, x, y);
			printArray(doubleArray, x, y);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("highEnd limit exceeds array index");
			ex.getMessage();
			ex.printStackTrace();
		}

	}

}
