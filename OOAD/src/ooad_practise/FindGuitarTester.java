package ooad_practise;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	public static void main(String[] args) {
		// set up Rick's guitar inventory
		Inventory inventory = new Inventory();
		intializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.MAHOGANY);
		
		List matchingGuitars = inventory.search(whatErinLikes);
		
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars: ");
			for(Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getGuitarSpec();
				System.out.println(" We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType() + " "
						+ " guitar: \n    " + spec.getBackWood() + " back and sides, \n    " + spec.getTopWood() + "top.\n You can have it for only $"
						+ guitar.getPrice() + "!\n ----");
			}
		}else {
			System.out.println("Sorry, Erin, we have nothing of this type.");
		}
	}
	
	private static void intializeInventory(Inventory inventory) {
		
		
	}

}
