package chapter14;

public class PigLatin {

	public static void main(String[] args) {
		StringBuilder phrase = new StringBuilder("hello this is a trial for the translation of this sentence in to pig latin");
		String stringPhrase = phrase.toString(); // The sentence was converted to a string so that the split method will be accessible.
		String[] words = stringPhrase.split("\\s"); //Tokenizing
		
		//Conversion back to String builder is necessary because string builder don't create a new string object as against string
		//This is to reduce memory consumption
		
		for(String word : words) {
			StringBuilder newWord = new StringBuilder(word);
			printLatinWord(newWord);
		}


	}
	public static void printLatinWord(StringBuilder word) {
		String suffix = "ay";
		char firstLetter = word.charAt(0);
		word = word.deleteCharAt(0).append(firstLetter).append(suffix);
		System.out.println(word);
	}

}
