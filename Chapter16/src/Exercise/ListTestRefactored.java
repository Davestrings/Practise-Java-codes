package Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTestRefactored {

	public static void main(String[] args) {
		String[] colors = {"Cyan", "Blue", "Green", "Black", "Violet", "Gold", "Silver", "Magenta"};
		List<String> colorList = new LinkedList<String>(Arrays.asList(colors));
		
		printList(colorList);
		printReversedList(colorList);
		System.out.println();
		
		sortList(colorList);
		printList(colorList);
		System.out.println();
		
		System.out.printf("%nAfter converting to lowerr case ");
		convertToLowerCase(colorList);
		printList(colorList);
	}
	public static void printList(List<String> list) {
		System.out.printf("List: %n");
		for(String color : list)
			System.out.printf("%s ", color);
	}
	public static void sortList(List<String> list) {
		Collections.sort(list); //sorting with class collection
	}
	public static void printReversedList(List<String> list) {
		ListIterator<String> iterator =  list.listIterator(list.size());
		
		System.out.printf("%nReversed list: %n");
		while(iterator.hasPrevious())
			System.out.printf("%s ", iterator.previous());
	}
	public static void convertToLowerCase(List<String> list) {
		ListIterator<String> iterator = list.listIterator(); //iterate through the list
		
		while(iterator.hasNext()) {
			String color = iterator.next();// get the next element from iterator
			iterator.set(color.toLowerCase()); // converts element to lower case
		}
	}

}
