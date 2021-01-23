package chapter14;

import java.util.Scanner;

public class TextAnalysisTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a short sentence: ");
		String sentence= scan.nextLine();
		
		TextAnalysis analyseThis = new TextAnalysis();
//		analyseThis.countTextOccurence(sentence);
		analyseThis.lengthOfEachWord(sentence);
	}

}
