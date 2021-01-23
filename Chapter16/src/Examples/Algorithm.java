package Examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithm {

	public static void main(String[] args) {
		Character[] letters = {'P', 'C', 'M'};
		List<Character> list = Arrays.asList(letters);
		output(list);
		
		Collections.reverse(list);
		System.out.printf("%nAfter reversing:%n");
		output(list);
		
		Character[] letterCopy = new Character[3];
		List<Character> copy = Arrays.asList(letterCopy);
		
		Collections.copy(copy, list);
		System.out.printf("%nAfter copying:%n");
		output(copy);
		
		Collections.fill(list, 'R');
		System.out.printf("%nAfter calling fill, list contains: %n");
		output(list);

	}
	public static void output(List<Character> list) {
		for(Character element:list)
			System.out.printf("%s ", element);
		
		System.out.printf("%nMax: %c", Collections.max(list));
		System.out.printf("%nMin: %c", Collections.min(list));
	}

}
