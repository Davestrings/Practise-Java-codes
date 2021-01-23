package examples;

public class StackTest {

	public static void main(String[] args) {
		double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
		int[] integerElements = {1, 2, 3, 4, 5};
		
		Stack<Double> doubleStack = new Stack<Double>(5);
		Stack<Integer> integerStack = new Stack<Integer>();
		
		testPushDouble(doubleStack, doubleElements);
		testPopDouble(doubleStack);
		
		testPushInteger(integerStack, integerElements);
		testPopInteger(integerStack);
	}
	
	private static void testPushDouble(Stack<Double>someDouble, double[] someArray) {
		System.out.printf("%nPushing elements into stack%n");
		
		for(double value : someArray) {
			System.out.printf("%.1f ", value);
			someDouble.push(value);
		}
	}
	private static void testPopDouble(Stack<Double> someDouble) {
		try {
			System.out.printf("%nPopping elements from stack%n");
			double popValue;
			
			while(true) {
				popValue = someDouble.pop();
				System.out.printf("%.1f ", popValue);
			}
		}catch(EmptyStackException ex) {
			System.err.println();
			ex.printStackTrace();
		}
	}
	private static void testPushInteger(Stack<Integer>someDouble, int[] someArray) {
		System.out.printf("%nPushing elements into stack%n");
		
		for(int value : someArray) {
			System.out.printf("%d ", value);
			someDouble.push(value);
		}
	}
	private static void testPopInteger(Stack<Integer> someDouble) {
		try {
			System.out.printf("%nPopping elements from stack%n");
			int popValue;
			
			while(true) {
				popValue = someDouble.pop();
				System.out.printf("%d ", popValue);
			}
		}catch(EmptyStackException ex) {
			System.err.println();
			ex.printStackTrace();
		}
	}

}
