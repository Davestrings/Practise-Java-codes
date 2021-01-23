package Examples;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		//add colors elements to list1
		String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
		List<String> list1 = new LinkedList<String>();
		
		for(String color : colors)
			list1.add(color);
		
		//add colors2 elements to list2
		String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
		List<String> list2 = new LinkedList<String>();
		
		for(String color : colors2)
			list2.add(color);
		
		list1.addAll(list2);
		list2 = null;
		printList(list1);
		
		convertToUpperCase(list1);
		
		System.out.printf("%nDeleting element 4 and 6 %n");
		removeFromList(list1, 4, 7);
		printList(list1);
		printReversedList(list1);
		printList(list1);
	}
	
	public static void printList(List<String> list) {
		System.out.printf("%nList: ");
		
		for(String color : list)
			System.out.print(color + " ");
		
		System.out.println();
	}
	
	public static void removeFromList(List<String> list, int start, int end) {
		list.subList(start, end).clear();
	}
	public static void convertToUpperCase(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			String color = iterator.next();
			iterator.set(color.toUpperCase());
		}
	}
	public static void printReversedList(List<String> list) {
		ListIterator<String> iterator = list.listIterator(list.size());
		
		System.out.printf("%nReversed List: %n");
		
		while(iterator.hasPrevious()) {
			System.out.printf("%s ", iterator.previous());
		}
	}

}
