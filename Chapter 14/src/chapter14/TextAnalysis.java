package chapter14;

public class TextAnalysis {
	private int[] index = new int[26];
	private int[] counterArray = new int[26];
	private String alphabets = "abcdefghijklmnopqrstuvwxyz";
	
	public void countTextOccurence(String text) {
		text = text.toLowerCase();
		String[] token = text.split("[e]");
		int counter = 0;
		do {
			for(int count = 0; count<alphabets.length(); count++) {
				
				switch(alphabets.charAt(count)) {
				case 'a':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('a', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'b':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('b', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'c':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('c', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'd':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('d', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'e':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('e', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'f':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('f', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'g':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('g', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'h':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('h', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'i':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('i', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'j':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('j', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'k':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('k', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'l':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('l', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'm':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('m', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'n':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('n', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'o':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('o', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'p':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('p', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'q':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('q', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'r':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('r', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 's':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('s', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 't':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('t', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'u':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('u', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'v':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('v', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'w':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('w', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'x':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('w', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'y':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('y', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
				case 'z':
					if(index[count] == -1)
						continue;
					
					index[count] = text.indexOf('z', index[count]);
					
					if(index[count] != -1) {
						++index[count];
						++counterArray[count];
					}
				break;
					
				}
			}
			counter++;
		}while(counter < token.length);
		System.out.println(counter);
		printStatsTable();
	}
	private void printStatsTable() {
		for(int i= 0; i< counterArray.length; i++) {
			System.out.printf("%c | %d%n", alphabets.charAt(i), counterArray[i]);
		}
	}

	public void lengthOfEachWord(String text) {
		String[] token = text.split("\\s");
		int[] wordLength = new int[token.length];
		for(int count=0; count< token.length; count++) {
			wordLength[count] = token[count].length(); // wrong logic check it
		}	
		System.out.println(token.length);
		printTable(wordLength);
	}
	private void printTable(int[] someArray) {
		System.out.printf("%10s%10s%n", "Word Length", "Occurrences");
		
		for(int i=0; i<someArray.length; i++) {
			System.out.printf("%10d%10d%n", i+1, someArray[i] );
		}
	}
}
