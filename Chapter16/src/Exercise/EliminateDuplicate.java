package Exercise;
//Write a program that reads in a series of first names and eliminates
//duplicates by storing them in a Set. Allow the user to search for a first name.

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EliminateDuplicate {

	public static void main(String[] args) {
		String[] firstNames = {"Jide", "Tolu", "Kemi", "Femi", "Tomiwa", "Korede", "Kemi", "David", "Paul", "Grace", "Hope", "Samson", "Grace", "David", "Kayode", "Korede"};
		Set<String> firstNameSet = new HashSet<String>();
		for(String name : firstNames)
			firstNameSet.add(name.toLowerCase());
		
		printList(firstNameSet);
		
		
		String name = null;
		System.out.printf("%nEnter the name you wish to search: ");
		try(Scanner scan = new Scanner(System.in)) {
			name = scan.nextLine();
		}catch(InputMismatchException in) {
			System.err.println("Invalid input... Try again");
		}
//		convertlistToLowerCase(firstNameSet);
//		printList(firstNameSet);
		
		
		System.out.printf("%nList %s %s", firstNameSet.contains(name.toLowerCase())?"contains":"does not contain", name);
	}
	public static void printList(Set<String> set) {
		System.out.printf("First Names: ");
		for(String name : set)
			System.out.printf("%s ", name);
	}
	public static String findName(Set<String> set, String name) {
//		String name = "";
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String nextName = iterator.next();
			if(nextName.equals(name))
				return name;
			
		}
		return "not present";
	}
	
}
