package examples;

public class MaximumTest {

	public static void main(String[] args) {
		System.out.printf("Maximum of %d, %d and %d is %d%n", 3, 4, 5, maximum(3, 4, 5));
		System.out.printf("Maximum of %.2f, %.2f, and %.2f is  %.2f", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
		//the output expects a type integer and double respectively
		//therefore the compiler explicitly cast method maximum to it respective type

	}
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		//The upper bound of this method is interface comparable
		//therefore at run time the type of the generic is Comparable and this method returns a comparable object 
		T max = x;
		if(y.compareTo(max) > 0)
			max = y;
		if(z.compareTo(max) > 0)
			max = z;
		
		return max;
	}

}
