package chapter14;

import java.util.Random;

public class RandomSentences {

	public static void main(String[] args) {
		String[] article = {"the", "a", "one", "some", "any"};
		String[] noun = {"boy", "girl", "dog", "town", "car"};
		String[] verb = {"jumped", "ran", "walked", "drove", "skipped"};
		String[] preposition = {"to", "from", "over", "under", "on"};
		
		Random rand = new Random();
		
		int count = 0;
		while(true) {
			StringBuilder sentence = new StringBuilder().append(article[rand.nextInt(5)]).append(" ").append(noun[rand.nextInt(5)]).append(" ").append(verb[rand.nextInt(5)]).append(" ").append(preposition[rand.nextInt(5)]).append(" ").append(article[rand.nextInt(5)]).append(" ").append(noun[rand.nextInt(5)]);
			count++;
			if(count ==20) {
				sentence.insert(sentence.length(), '.');
				char c = sentence.charAt(0);
				sentence.setCharAt(0, Character.toUpperCase(c));
				System.out.println( count+". "+sentence);
				break;
			}else
			System.out.println( count+". "+sentence);
		}

	}

}
