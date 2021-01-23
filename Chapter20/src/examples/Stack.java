package examples;

import java.util.ArrayList;

public class Stack<T> {
	private final ArrayList<T> elements;
	
	public Stack() {
		this(10); // creates a stack of default size
	}
	public Stack(int capacity) {
		int initCapacity = capacity > 0 ? capacity : 10;
		elements = new ArrayList<T>(initCapacity);
	}
	
	public void push(T pushValue) {
		elements.add(pushValue); // push elements unto the stack
	}
	
	public T pop() {
		if(elements.isEmpty())
			throw new EmptyStackException("Stack is Empty, cannot pop");
		return elements.remove(elements.size() -1);
	}
}
