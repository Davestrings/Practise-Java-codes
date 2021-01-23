package chapter14;

public class ReverseAndString {

	public static void main(String[] args) {
		String sentence = "The seven digits of the phone number should be concatenated into one string";
		String[] words = sentence.split("\\s"); //split sentence by space.

		for(String word : words) {
			StringBuilder word1 = new StringBuilder(word);
			System.out.println("Reversed words:" + word1.reverse());
			System.out.printf("word in uppercase: %s%nWord in lowercase: %s%n", word.toUpperCase(), word.toLowerCase());
			System.out.println("word that starts with letter \"b\" :"+  word.startsWith("b"));
			System.out.println("word that ends with letter \"ed\" :" + word.endsWith("ed"));
		}
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		String[] splitByLetterE = sentence.split("[e]");

		int[] fromIndex= new int[alphabets.length()]; // this will hold the last occurrence index of a letter so that it remember to search the string from there in the next iteration
		int[] counter = new int[alphabets.length()];
		int counte = 1;
		do {
			for(int count=0; count < alphabets.length(); count++) {
				switch(alphabets.charAt(count)) {
				case 'a':
//					System.out.println("initial from index "+ fromIndex[count]);
					if(fromIndex[count] == -1)
						continue; //when index is -1 it abandons the operation
					fromIndex[count] = sentence.indexOf('a', fromIndex[count]);
//					System.out.println("after from index "+fromIndex[count]);

					if(fromIndex[count] != -1)//This if statement ensures that shifting is only done when the index is not -1
						++fromIndex[count]; // added one to shift the index from the previous index so that on next iteration, the index will start from here instead of repeating the same index

//					System.out.println("after increment from index "+fromIndex[count]);
					if(fromIndex[count] != -1) {
						++counter[count];
//						System.out.println("switch test");
//						System.out.println(counter[count]);
//						System.out.println("------------------");
					}
					break;
				case 'b':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('b', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1) {
						++counter[count];
					}
					break;
				case 'c':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('c', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'd':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('d', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'e':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('e', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'f':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('f', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'g':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('g', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'h':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('h', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'i':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('i', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'j':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('j', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'k':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('k', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'l':
					if(fromIndex[count] == -1)
						continue;
					
					fromIndex[count] = sentence.indexOf('l', fromIndex[count]);
					
					if(fromIndex[count] != -1)
						++fromIndex[count];
					
					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'm':
					if(fromIndex[count] == -1)
						continue;
					
					fromIndex[count] = sentence.indexOf('m', fromIndex[count]);
					
					if(fromIndex[count] != -1)
						++fromIndex[count];
					
					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'n':
					if(fromIndex[count] == -1)
						continue;
					
					fromIndex[count] = sentence.indexOf('n', fromIndex[count]);
					
					if(fromIndex[count] != -1)
						++fromIndex[count];
					
					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'o':
					if(fromIndex[count] == -1)
						continue;
					
					fromIndex[count] = sentence.indexOf('o', fromIndex[count]);
					
					if(fromIndex[count] != -1)
						++fromIndex[count];
					
					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'p':
					if(fromIndex[count] == -1)
						continue;
					
					fromIndex[count] = sentence.indexOf('p', fromIndex[count]);
					
					if(fromIndex[count] != -1)
						++fromIndex[count];
					
					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'q':
					if(fromIndex[count] == -1)
						continue;
					
					fromIndex[count] = sentence.indexOf('q', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'r':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('r', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 's':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('s', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 't':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('t', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'u':
					if(fromIndex[count] == -1)
						continue;
					fromIndex[count] = sentence.indexOf('u', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'v':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('v', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'w':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('w', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'x':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('x', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];
					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'y':
					if(fromIndex[count] == -1)
						continue;
					fromIndex[count] = sentence.indexOf('y', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;
				case 'z':
					if(fromIndex[count] == -1)
						continue;

					fromIndex[count] = sentence.indexOf('z', fromIndex[count]);

					if(fromIndex[count] != -1)
						++fromIndex[count];

					if(fromIndex[count] != -1)
						++counter[count];
					break;

				}
			}
			counte++;
		}while(counte < splitByLetterE.length);
		char[] alphaArray = new char[alphabets.length()];
		alphabets.getChars(0, alphabets.length(), alphaArray, 0);
		
		System.out.println("Estimated occurrence of each letter based on number of letter \"E\" present in the sentence");
		for(char i : alphaArray) {
			System.out.print(i+" | ");
		}
		System.out.println();
		for(int count : counter) {
			System.out.print(count +" | ");
		}
		
		
		
	}

}
