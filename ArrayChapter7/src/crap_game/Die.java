package crap_game;

import java.security.SecureRandom;

public abstract class Die {
//	private Color color;
	private int die1;
	private int die2;
	
	private SecureRandom random = new SecureRandom();
	
	public int getDie1() {
		return die1;
	}
	public void setDie1() {
		die1 = 1 + random.nextInt(6);
	}
	
	public int getDie2() {
		return die2;
	}
	public void setDie2() {
		die2 = 1 + random.nextInt(6);
	}
	
	public int dieRoll() {
		return getDie1() + getDie2();
	}
	
	public abstract Color dieColor();
}
