package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountDuplicate {

	public static void main(String[] args) {
		
		countDuplicate();
	}
	public static void countDuplicate() {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Enter sentence to be processed: ");
		String sentence = scan.nextLine();
		//
		String[] words = sentence.toLowerCase().split("\\s");
		
		List<String> wordList = new ArrayList<String>();
		int count = 0;
		for(String word:words) {
			word = word.replace(',', ' ');
			word = word.replace('.', ' ');
			if(wordList.contains(word)) {
				++count;
			}else {
				wordList.add(word);
			}
		}
		System.out.printf("Duplicates: %d", count);
			
//		for(String i : wordList)
//			System.out.println(i);
	}

}
