package Examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN", "VIOLET"};
		List<String> list = new ArrayList<String>();
		
		for(String color : colors)
			list.add(color);
		
		String[] newColor = {"RED", "BLUE", "WHITE"};
		List<String> newList = new ArrayList<String>();
		
		for(String color : newColor)
			newList.add(color);

		System.out.println("ArrayList: ");
		
		for(int count = 0; count < list.size(); count++)
			System.out.printf("%s ", list.get(count));
		
		removeList(list, newList);
		
		System.out.printf("%n%nArrayList after calling removeColor: %n");
		
		for(String color : list)
			System.out.printf("%s ", color);
	}
	
	public static void removeList(Collection<String> collection1, Collection<String> collection2) {
		Iterator<String> iterator = collection1.iterator();
		
		while(iterator.hasNext()) {
			if(collection2.contains(iterator.next()))
				iterator.remove();
		}
	}

}
