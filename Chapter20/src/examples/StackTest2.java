package examples;

public class StackTest2 {

	public static void main(String[] args) {
		Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
		Integer[] integerElements = {1, 2, 3, 4, 5};
		
		Stack<Double> doubleStack =  new Stack<Double>(5);
		Stack<Integer> integerStack = new Stack<Integer>();
		
		testPush("integerStack", integerStack, integerElements);
		testPop("integerStack", integerStack);
		
		testPush("doubleStack", doubleStack, doubleElements);
		testPop("doubleStack", doubleStack);
		

	}
	
	private static <T> void testPush(String name, Stack<T> someStack, T[] someArray) {
		System.out.printf("%nPushing elements onto %s%n ", name);
		
		for(T value : someArray) {
			System.out.printf("%s ", value);
			someStack.push(value);
		}
	}//T and E are merely place holders at run time they are converted to the type of class Stack's super class. In this case, it's object
	private static <E> void testPop(String name, Stack<E> someStack){
		try {
			System.out.printf("%nPopping elements from %s%n", name);
			E popValue ;
			
			while(true) {
				popValue = someStack.pop();
				System.out.printf("%s ", popValue);
			}
			
		}catch(EmptyStackException ex) {
			System.err.println();
			ex.printStackTrace();
		}
	}

}
