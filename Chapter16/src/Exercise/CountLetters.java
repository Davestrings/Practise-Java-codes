package Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CountLetters {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		createMap(map);
		displayMap(map);
				
	}
	public static void createMap(Map<Character, Integer> map) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter words to process: ");
		
		String words = input.nextLine();
		String[] tokens = words.split("\\s"); // remove all spaces and returns an array
		
		for(String token : tokens) {
			char[] charArr = token.toLowerCase().toCharArray(); //convert each element of the array to a character
			for(char i : charArr) {
				if(map.containsKey(i)) {
					int count = map.get(i);//gets value of the key
					map.put(i, count + 1);// increment the value of the key then adds it to the map
				}else {
					map.put(i, 1);// adds the key and value to the map
				}
			}
		}
		input.close();
	}
	public static void displayMap(Map<Character, Integer> map) {
		System.out.printf("%-10s %5s%n", "Key","Value");
		//This converts the map to set to remove duplicates
		Set<Character> keys =map.keySet();
		
		//TreeSet orders the list
		TreeSet<Character> sortedKeys = new TreeSet<Character>(keys);
		
		for(Character key : sortedKeys)
			System.out.printf("%-10s%5d%n", key, map.get(key));
		System.out.printf("size: %d", map.size());
	}

}
