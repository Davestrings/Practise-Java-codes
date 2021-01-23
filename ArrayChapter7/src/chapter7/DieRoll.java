package chapter7;

import java.security.SecureRandom;
import java.util.Arrays;

public class DieRoll {
	private final SecureRandom rand = new SecureRandom();
	private int[] dieRoll = new int[11];
	
	public int rollDice() {
		int die1 =  1 + rand.nextInt(6);
		int die2 =  1 + rand.nextInt(6);
		int sum = die1 + die2;
		return sum;
	}
	public void Roll(int[] array) {
		int limit = 2;
		int sum;
		for(int i = 0; i <= 36000000; i++) {
			sum = rollDice() - limit;
			++dieRoll[sum];
		}
		System.out.println(Arrays.toString(dieRoll));
	}
	
}
