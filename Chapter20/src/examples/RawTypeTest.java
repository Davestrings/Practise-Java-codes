package examples;

public class RawTypeTest {

	public static void main(String[] args) {
		Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
		Integer[] integerElements = {1, 2, 3, 4, 5};
		
		//raw type assigned to a raw type
		Stack rawTypeStack1 = new Stack(5);
		
		//Stack of double assigned to a raw type
		Stack rawTypeStack2 = new Stack<Double>(5);
		
		Stack<Integer> integerStack = new Stack(10); //raw type assigned to Stack<Integer> variable
		
		testPush("rawTypeStack1", rawTypeStack1, doubleElements);
		testPop("rawTypeStack1", rawTypeStack1);//compiler cannot ensure type safety because a raw type's manipulation is not guaranteed to go well
		//because a raw type can store other object other than those specified.
		
		testPush("rawTypeStack2", rawTypeStack2, doubleElements);
		testPop("rawTypeStack2", rawTypeStack2);
		
		testPush("integerStack", integerStack, integerElements);
		testPop("integerStack", integerStack);

	}
	private static <T> void testPush(String name, Stack<T> someStack, T[] someArray) {
		System.out.printf("%nPushing elements onto %s%n ", name);
		
		for(T value : someArray) {
			System.out.printf("%s ", value);
			someStack.push(value);
		}
	}
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
