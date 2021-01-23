package examples;

import java.security.SecureRandom;
import java.util.Scanner;

public class LinearSearchTest {
	public static int linearSearch(int[] dataArray, int searchKey) {
		for(int key=0; key <dataArray.length; key++) {
			if(dataArray[key] == searchKey)
				return key;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		
		int[] data = new int[10];
		for(int i = 0; i < data.length; i++)
			data[i] = 10 + random.nextInt(90);
		
		System.out.printf("%nEnter a search integer (-1 to quit).");
		int userSearch = scan.nextInt();
		
		while(userSearch != -1) {
			int position = linearSearch(data, userSearch);
			
			if(position == -1)
				System.out.printf("%n%d is not found %n", userSearch);
			else
				System.out.printf("%n%d is fount at %d%n", userSearch, position);
			
			System.out.printf("%nEnter a search integer (-1 to quit).");
			userSearch = scan.nextInt();
		}

	}

}
